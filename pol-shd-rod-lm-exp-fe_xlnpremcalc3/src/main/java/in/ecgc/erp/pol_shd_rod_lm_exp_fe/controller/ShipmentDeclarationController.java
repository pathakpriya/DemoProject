package in.ecgc.erp.pol_shd_rod_lm_exp_fe.controller;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.openjson.JSONArray;
import com.github.openjson.JSONObject;
import com.google.gson.Gson;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.Country;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.PolPremRateMst;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.SdeclAmndScrSepEtpSspBwp;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcPolShdScrSepEtpSspBwp;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.Shipments;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.TermOfPayment;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.shipmentDeclDetailsHeader;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.service.CommodityService;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.service.CountryService;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.service.FileService;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.service.TermOfPaymentService;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.service.premRateService;

@Controller
public class ShipmentDeclarationController {
	 List<EcgcPolShdScrSepEtpSspBwp> set;
	
	@Autowired
	FileService fileService;
	

	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	@GetMapping("/modify")
	public String modify() {
		return "modify";
	}
	
	@GetMapping("/shipmentDeclaration")
	public String shipmentDeclaration(Model model,@RequestParam("policyNo") Integer policyNo) {
		//model.addAttribute("shipment", new ShipmentDeclaration());
		model.addAttribute("policyNo", policyNo);
		EcgcPolShdScrSepEtpSspBwp shddecl = new EcgcPolShdScrSepEtpSspBwp();
		shddecl.setPolNo(policyNo);
		List<Country> mapCountries = CountryService.getCountries();
		model.addAttribute("mapCountries", mapCountries);
		
		LinkedHashMap<String, ArrayList<String>> commodities = CommodityService.getCommodities();
		model.addAttribute("commodities", commodities);
		
		List<TermOfPayment> top = TermOfPaymentService.getListTop();
		model.addAttribute("top",top);
		List<PolPremRateMst> premRateList =  premRateService.premRate();
		System.out.println("**************"+premRateList.get(0).getPremiumRate());
		return "shipment_declaration";
	}

	
	  @PostMapping(value="/shipment",produces = "application/json; charset=utf-8",consumes="application/json") 
	  @ResponseBody
	  public Shipments shipmentsList(@RequestBody Shipments list)
	  {
		  System.err.println("hiiiii"); 
		  for(EcgcPolShdScrSepEtpSspBwp sd : list.getList())
		  {
			  System.out.println(sd.getDay());
		  }
			  
			  System.out.println(list); 
		  
			 return list ;
			//return "redirect:shipmentDeclaration";
	  }
	  
	  @GetMapping("/shipmentDeclarationFormSCR")
	  public String insertShipments(Model model) {
		  shipmentDeclDetailsHeader sDecl = new shipmentDeclDetailsHeader();
		  sDecl.setScrSepEtpSspBwpDecls(new ArrayList<SdeclAmndScrSepEtpSspBwp>());
		 // List<SdeclAmndScrSepEtpSspBwp> list = sDecl.getScrSepEtpSspBwpDecls();
		  model.addAttribute("sDecl", sDecl);
		  
		  Map<Integer, String> countries = new HashMap<Integer, String>();
		  countries.put(1, "Australia");
		  countries.put(2, "USA");
		  countries.put(3, "Nepal");
		  countries.put(4, "Italy");
		  
		  model.addAttribute("countries", countries);
		  return "shipmentDeclaration";
	  }
	// method uploadFile
	  @RequestMapping(value = "/uploadFile" , method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE) 
	  public ResponseEntity<Object> uploadFile(@RequestParam("uploadfile") MultipartFile uploadfile, Model model,@RequestParam("policyNo") Integer policyNo) throws IOException, ParseException, EncryptedDocumentException, InvalidFormatException  {
		  System.out.println(uploadfile.getOriginalFilename());
		  //rest sheet format check
		  List<String>  errors = fileService.chkError(uploadfile,policyNo);
		  set = fileService.store(uploadfile);
		  System.out.println("*****SET RETURNED***"+set);
		  String type="";
		  if(errors.size() > 0) {
				//model.addAttribute("actionError", "Invalid / Missing records found in uploaded Excel file. Please download Error File for details.");
				//model.addAttribute("uploadErrorFound",true);
				type+="error";
				String fileName = "src/main/resources/static/"+"EXCEL_UPLOAD_ERRORS.txt"; 
				System.out.println("fileName"+fileName);
				System.out.println("With errors : "+set.get(0).getErrorCode().toString());
				System.out.println("error in controller"+set.get(0).getErrorCode().length());
				
				File file = new File(fileName);
				FileWriter fr = null;
				try {
					fr = new FileWriter(file);
					fr.write("----------Errors-----------");
					fr.write("\n");
					for(String error : errors) {
						//System.out.println(error);
						fr.write(error);
						
						fr.write("\n");
					}
					if(set.get(0).getErrorCode().length()>0) {
						type+="warning";
						fr.write("\n\n");
						fr.write("-------Warnings-------");
						fr.write("\n");
						fr.write(set.get(0).getErrorCode());
						fr.write("\n");
					}
					fr.close();
					
					//model.addAttribute("errorInUpload", true);
		        } catch (IOException e) {
					e.printStackTrace();
				}
				
				//model.addAttribute("errorFilename", fileName);
				return new ResponseEntity<Object>(type, HttpStatus.BAD_REQUEST);
			}
		  else if(set.get(0).getErrorCode().length()>0) {
			  //type+="warning";
				//model.addAttribute("actionError", "Invalid / Missing records found in uploaded Excel file. Please download Error File for details.");
				//model.addAttribute("uploadErrorFound",true);
				
				String fileName = "src/main/resources/static/"+"EXCEL_UPLOAD_ERRORS.txt"; 
				System.out.println("fileName"+fileName);
				System.out.println("with duplicates : "+set.get(0).getErrorCode().toString());
				System.out.println("error in controller"+set.get(0).getErrorCode().length());
				
				File file = new File(fileName);
				FileWriter fr = null;
				try {
					fr = new FileWriter(file);
					
						fr.write("--------Warnings--------");
						fr.write("\n");
						fr.write(set.get(0).getErrorCode());
						fr.write("\n");
					
					fr.close();
					
					//model.addAttribute("errorInUpload", true);
		        } catch (IOException e) {
					e.printStackTrace();
				}
				
				//model.addAttribute("errorFilename", fileName);
				//return new ResponseEntity<Object>(type, HttpStatus.BAD_REQUEST);
			}
		  
		
	    	Gson gson = new Gson();
	    	String json = gson.toJson(set);
	    	System.out.println(json);
	    	//shdService.save(json);
	    	//model.addAttribute("message", "File uploaded successfully!");
		/*
		 * Iterator<ShipmentDeclaration> itr = set.iterator(); while(itr.hasNext()){
		 * ShipmentDeclaration shdobj =itr.next(); if(shdobj.getCountry()==null) {
		 * return new
		 * ResponseEntity<>("Enter correct country name",HttpStatus.BAD_REQUEST); }
		 * 
		 * if(shdobj.getCommodity()==null) { return new
		 * ResponseEntity<>("Enter correct commodity name",HttpStatus.BAD_REQUEST); }
		 * if(shdobj.getTop()==null) { return new
		 * ResponseEntity<>("Enter correct TOP",HttpStatus.BAD_REQUEST); }
		 * 
		 * 
		 * }
		 */
	    	
	    	return new ResponseEntity<Object>(json, HttpStatus.OK);
	    	
	  } 
	  
	 
	  @PostMapping(value = "/shipmentDtls", produces = "application/json", consumes = "application/json")
		@ResponseBody
		public List<SdeclAmndScrSepEtpSspBwp> getshipmentDtls(
				@RequestBody List<SdeclAmndScrSepEtpSspBwp> ScrSepEtpSspBwpDecls) {
			
			System.out.println(ScrSepEtpSspBwpDecls);
			for (SdeclAmndScrSepEtpSspBwp sdecl : ScrSepEtpSspBwpDecls) {
				
				sdecl.setByrCountryCd(CountryService.getKey(sdecl.getByrCountryCd(),CountryService.getMapCountries()));
					
				sdecl.setDestCountryCd(CountryService.getKey(sdecl.getDestCountryCd(), CountryService.getMapCountries()));
				
				sdecl.setCountryFromWhichPaymentToBeRecievedCd(CountryService.getKey(sdecl.getCountryFromWhichPaymentToBeRecievedCd(), CountryService.getMapCountries()));
				
				sdecl.setSourceCountryCd(CountryService.getKey(sdecl.getSourceCountryCd(), CountryService.getMapCountries()));
				
				sdecl.setLcOpeningBankAddrCountryCd(CountryService.getKey(sdecl.getLcOpeningBankAddrCountryCd(), CountryService.getMapCountries()));
				
				sdecl.setTopId(TermOfPaymentService.getKey(sdecl.getTopId(), TermOfPaymentService.getMapTop()));
				
				System.out.println("ScrSepEtpSspBwpDecls"+ sdecl);
				
			}
			
			
			return ScrSepEtpSspBwpDecls;
		}

	  
	  @PostMapping(value = "/shipmentDtlsXL",produces="application/json", consumes = "application/json")
		@ResponseBody
		public int getshipmentDtlsXL(@RequestBody String json, @RequestParam("polNum") int polNo){
			System.out.println("polNo"+polNo);
			System.out.println("controller data" +json);
			ObjectMapper mapper = new ObjectMapper();
			int result =0;
			List<EcgcPolShdScrSepEtpSspBwp> ScrSepEtpSspBwpDecls;
			//SdeclAmndScrSepEtpSspBwp sdeclAmndScrSepEtpSspBwpDecls= new SdeclAmndScrSepEtpSspBwp() ;
			
			 try {
				ScrSepEtpSspBwpDecls = Arrays.asList(mapper.readValue(json, EcgcPolShdScrSepEtpSspBwp[].class));
				 for(int i =0;i<ScrSepEtpSspBwpDecls.size();i++) {
					 if(!((set.get(i)).equals(ScrSepEtpSspBwpDecls.get(i))))
						set.set(i, ScrSepEtpSspBwpDecls.get(i));
							 
					
					 ScrSepEtpSspBwpDecls.get(i).setPolNo(polNo);
					 List<PolPremRateMst> premRateList =  premRateService.premRate();
						int premRate= premRateList.get(0).getPremiumRate();
						System.out.println("Premium Rate :"+premRate);
					Double givInr= ScrSepEtpSspBwpDecls.get(i).getGivInr();
					 Double premiumAmt = premRateService.calPremAmtdecl(premRate,givInr);
					 System.out.println("Premium Amount : "+premiumAmt);
					 ScrSepEtpSspBwpDecls.get(i).setPremiumAmt(premiumAmt);
					// System.out.println("shipment details for forntend"+i+" "+set.get(i));
					 System.out.println("*******************************************************");
					  System.out.println("Shipment Detail for backend"+i+"   " +ScrSepEtpSspBwpDecls.get(i)); 
					  }
			
					 // result = shipmentDeclService.insertDeclDtlXL(ScrSepEtpSspBwpDecls); Uncomment it, when merge with backend
					return result;
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
			return result;		
		}

	
	  
	  
	  
	  
	 
}

