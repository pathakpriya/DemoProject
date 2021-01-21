package in.ecgc.erp.pol_shd_rod_lm_exp_fe.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcPolShdScrSepEtpSspBwp;
//import in.ecgc.erp.pol_shd_rod_lm_exp_fe.util.CountryUtil.Country;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.util.ExcelStaticData;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.util.ExcelValidator;



public class ExcelUtils {

	@SuppressWarnings("static-access")
	public static List<EcgcPolShdScrSepEtpSspBwp> parseExcelFile(MultipartFile file) throws ParseException, EncryptedDocumentException, InvalidFormatException {
		try {
			
			List<String[]> excelDetailsList = readExcelFile(file, ExcelStaticData.getExcelFormat(), 2);
			Multimap<String, String> map = ArrayListMultimap.create();
			Multimap<String, String> rowIndexMap = ArrayListMultimap.create();
			
			int year=0, month=0,polNo=0,noOfEntries=0;
			//CountryUtil countryutil = new CountryUtil();
			List<String> countries = new ArrayList<String>();
			countries.add("Algeria");
			countries.add("Argentina");
			countries.add("Australia");
			countries.add("Austria");
			countries.add("Austria");
			countries.add("Bahamas");
			countries.add("Barbados");
			countries.add("Belgium");
			countries.add("Bermuda");
			countries.add("Brazil");
			countries.add("Bulgaria");
			countries.add("Canada");
			countries.add("Chile");
			countries.add("China");
			countries.add("Cyprus");
			countries.add("Czech");
			countries.add("Denmark");
			countries.add("Egypt");
			countries.add("Finland");
			countries.add("Usa");

			List<String> commodity = new ArrayList<String>();
			commodity.add("10-Tea");
			commodity.add("11-Coffee");
			commodity.add("12-Spices");
			commodity.add("13-Cashew");
			commodity.add("14-Tobacco");
			commodity.add("21-Agriculture and Allied Products(Including Processed Foods)");
			commodity.add("22-Marine Products");
			commodity.add("31-Rice");
			commodity.add("32-Dairy and Poultry Products");
			commodity.add("33-Meat and Meat Preparations");

			List<String> top = new ArrayList<String>();
			top.add("DA-30");
			top.add("DA-60");
			top.add("DA-90");
			top.add("DP");
			top.add("LC");


			Workbook workbook = new XSSFWorkbook(file.getInputStream());
			Sheet sheet = workbook.getSheetAt(0);
			int r=sheet.getPhysicalNumberOfRows();
			int last=sheet.getLastRowNum();
			System.out.println("@@@@@@@"+r);
			System.out.println("########S"+last);
			DataFormatter formatter = new DataFormatter(Locale.US);
			Iterator<Row> rows = sheet.iterator();

			List<EcgcPolShdScrSepEtpSspBwp> decllist = new ArrayList<EcgcPolShdScrSepEtpSspBwp>();
			EcgcPolShdScrSepEtpSspBwp shipmentdecltemp = new EcgcPolShdScrSepEtpSspBwp();
			int rowNumber = 0;
			int tempRowNo=0;
			while (rows.hasNext()) {
				String vartop=null;
				EcgcPolShdScrSepEtpSspBwp shipmentdecl = new EcgcPolShdScrSepEtpSspBwp();
				System.out.println(rows.hasNext());
				Row currentRow = rows.next();

				
				if (rowNumber==0)
				{    System.out.println("Common details");
					for(int j=0; j<=7;j++)
					{   int cellIndex=j; 
					Cell currentCell = currentRow.getCell(j);
					if(cellIndex==0)
					{ //System.out.println("Policy no"+cellIndex);
						System.out.println(currentCell.getStringCellValue());	
					}
					if(cellIndex==1)//policy no
					{

						polNo=(int)currentCell.getNumericCellValue();

					}
					if(cellIndex==2)
					{
						System.out.println(currentCell.getStringCellValue());
					}
					if(cellIndex==3)//year of declaration
					{
						//System.out.println(currentCell.getStringCellValue());
						System.out.println(currentCell.getNumericCellValue());
						
						year=(int)currentCell.getNumericCellValue();
					}
					if(cellIndex==4)
					{
						System.out.println(currentCell.getStringCellValue());
					}
					if(cellIndex==5)//month of declaration
					{
						System.out.println(currentCell.getStringCellValue());
						//System.out.println(currentCell.getNumericCellValue());
					//month=(int)currentCell.getNumericCellValue();
						String monthtemp=currentCell.getStringCellValue();
						switch (monthtemp) {
					  case "january":
						    month=1;
						    break;
						  case "february":
							  month=2;
						    break;
						  case "february.":
						    month=2;
						    break;
						  case "march":
						    month=3;
						    break;
						  case "april":
						    month=4;
						    break;
						  case "may":
						   month=5;
						    break;
						  case "june":
						    month=6;
						    break;
						  case "july":
							    month=7;
							    break;
						  case "august":
							    month=8;
							    break;
						  case "september":
							    month=9;
							    break;
						  case "october":
							    month=10;
							    break;
						  case "november":
							    month=11;
							    break;
						  case "december":
							    month=12;
							    break;
						  default: 
							  System.out.println();
						    
						}
						
						
					}
					if(cellIndex==6)
					{
						System.out.println(currentCell.getStringCellValue());
					}
					if(cellIndex==7)//No. of rows of entries except first two rows
					{
						//System.out.println(currentCell.getStringCellValue());
						noOfEntries=(int)currentCell.getNumericCellValue();
						System.out.println("noOfEntries "+noOfEntries);
						System.out.println(currentCell.getNumericCellValue());
					}


					}

				}

				// skip header
				if(rowNumber == 1) {
					System.out.println("Skip header");
					rowNumber++;
					continue;
				}
				if(rowNumber>1 && rowNumber<(2+ noOfEntries)) {
						System.out.println("Inside real details");
						shipmentdecl.setPolNo(polNo);
						shipmentdecl.setYear(year);
						shipmentdecl.setMonth(month);
					Iterator<Cell> cellsInRow = currentRow.iterator();
					
					int cellIndex = 0;
					while (cellsInRow.hasNext()) {
						Cell currentCell = cellsInRow.next();

						if(cellIndex==0) { // day of shipment
							/*
							 * String s1=formatter.formatCellValue(currentRow.getCell(0)); Date date =new
							 * SimpleDateFormat("dd/MM/yyyy").parse(s1); SimpleDateFormat formattr = new
							 * SimpleDateFormat("dd/MM/yyyy"); String strDate = formattr.format(date);
							 */System.out.println(currentCell.getNumericCellValue());
							shipmentdecl.setDay((int)currentCell.getNumericCellValue());

						} else if(cellIndex==1) { // invoice no
							//System.out.println(currentCell.getStringCellValue());
							System.out.println(currentCell.getNumericCellValue());
							shipmentdecl.setInvoiceNo((int)currentCell.getNumericCellValue());
							//shipmentdecl.setInvoiceNo(Integer.parseInt(currentCell.getStringCellValue()));
						} else if(cellIndex==2) { // commodity


							String s1 =currentCell.getStringCellValue();
							System.out.println(s1);
							 shipmentdecl.setCommodity(currentCell.getStringCellValue());
						} else if(cellIndex==3) { // Country
							String S1= currentCell.getStringCellValue();
							// List<Country> countries=	countryutil.countrylist();
							shipmentdecl.setCountry(currentCell.getStringCellValue());
						}else if(cellIndex==4)//buyerCode
						{
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerCode(currentCell.getStringCellValue());
						}
						else if(cellIndex==5) { // buyerName
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerName(currentCell.getStringCellValue());
						}else if(cellIndex==6) { // buyerAddress
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerAddress(currentCell.getStringCellValue());
						}else if(cellIndex==7) { // buyerStreet
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerStreet(currentCell.getStringCellValue());
						}else if(cellIndex==8) { // buyerCity
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerCity(currentCell.getStringCellValue());
						}else if(cellIndex==9) { // buyerState
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerState(currentCell.getStringCellValue());
						}else if(cellIndex==10) { // buyerCountry
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerCountry(currentCell.getStringCellValue());
						}else if(cellIndex==11) { // buyerPostal
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBuyerPostal(currentCell.getStringCellValue());
						}else if(cellIndex==12) { // paymentCountry
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setPaymentCountry(currentCell.getStringCellValue());
						}else if(cellIndex==13) { // sourceCountry
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setSourceCountry(currentCell.getStringCellValue());
						}else if(cellIndex==14) { // destinationCountry
							System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setDestCountry(currentCell.getStringCellValue());
						}else if(cellIndex==15) { // Giv Inr
							System.out.println((Double)currentCell.getNumericCellValue());
							shipmentdecl.setGivInr((Double)currentCell.getNumericCellValue());
						}
						else if(cellIndex==16) { // top
							System.out.println(currentCell.getStringCellValue());
							 vartop = currentCell.getStringCellValue();
							  shipmentdecl.setTop(currentCell.getStringCellValue());
						}
						else if(cellIndex==17) { // dueDate
								String s1=formatter.formatCellValue(currentRow.getCell(17)); 
							
							  Date date =new SimpleDateFormat("yyyy-MM-dd").parse(s1); 
							  SimpleDateFormat formattr = new SimpleDateFormat("yyyy-MM-dd"); 
							  String strDate = formattr.format(date); System.out.println(strDate);
							 
								System.out.println("Due date"+strDate);
								shipmentdecl.setDueDate(strDate);

							}
						else if(cellIndex==18) { // dateOfRealization

								String s1=formatter.formatCellValue(currentRow.getCell(18)); 
							
							  Date date =new SimpleDateFormat("yyyy-MM-dd").parse(s1); SimpleDateFormat
							  formattr = new SimpleDateFormat("yyyy-MM-dd"); String strDate =
							  formattr.format(date);
							 
										System.out.println(strDate);
										shipmentdecl.setDateOfRealization(strDate);

							}
						else if(cellIndex==19) { // bankName
							if(vartop.equals("LC")){
								System.out.println(currentCell.getStringCellValue());
								shipmentdecl.setBankName(currentCell.getStringCellValue());
							}
							else shipmentdecl.setLcCode("-"); 	
							}
						else if(cellIndex==20) { // LCcode
							if(vartop.equals("LC"))
							{
								System.out.println(currentCell.getStringCellValue());
								shipmentdecl.setLcCode(currentCell.getStringCellValue());
							}
							else shipmentdecl.setBankName("-");	
							}
						else if(cellIndex==21) { // bankAddress
							if(vartop.equals("LC"))
							{
								System.out.println(currentCell.getStringCellValue());
								shipmentdecl.setBankAddress(currentCell.getStringCellValue());
							}
							else shipmentdecl.setBankAddress("-");
							}
						else if(cellIndex==22) { //bankStreet
							if(vartop.equals("LC"))
							{
								System.out.println(currentCell.getStringCellValue());
								shipmentdecl.setBankStreet(currentCell.getStringCellValue());
							}
							else shipmentdecl.setBankStreet("-");
							}
						else if(cellIndex==23) { // bankCity
							if(vartop.equals("LC"))
							{System.out.println(currentCell.getStringCellValue());
							shipmentdecl.setBankCity(currentCell.getStringCellValue());
							}
							else shipmentdecl.setBankCity("-");
								
							}else if(cellIndex==24) { // bankState
								if(vartop.equals("LC"))
								{
									System.out.println(currentCell.getStringCellValue());
									shipmentdecl.setBankState(currentCell.getStringCellValue());
								}
								else shipmentdecl.setBankState("-");
								
							}else if(cellIndex==25) { // bankCountry
								if(vartop.equals("LC"))
								{
									System.out.println(currentCell.getStringCellValue());
									shipmentdecl.setBankCountry(currentCell.getStringCellValue());
								}
								else shipmentdecl.setBankCountry("-");
								
							}else if(cellIndex==26) { // bankPostal
								if(vartop.equals("LC"))
								{
									System.out.println(currentCell.getStringCellValue());
									shipmentdecl.setBankPostal(currentCell.getStringCellValue());
								}
								else shipmentdecl.setBankPostal("-");
								
							}

						

						cellIndex++;
					}
					System.out.println(shipmentdecl);

					if(excelDetailsList.get(tempRowNo-1)!=null) {
	    				System.out.println("debug 0"+(tempRowNo-1));
	    				System.out.println("debug 1"+(tempRowNo-1));
	    			if(!(decllist.contains(shipmentdecl))) {
	    				decllist.add(shipmentdecl);
	    				
	    				System.out.println("debug 3"+(tempRowNo-1));
	    			String s1 =(decllist.indexOf(shipmentdecl))+" ";
					String s2 =(tempRowNo)+" ";
					rowIndexMap.put(s1, s2);
					
	    			}
	    			else {
	    				System.out.println("debug 4"+(tempRowNo-1));
	    				decllist.add(shipmentdecl);
	    				System.out.println(shipmentdecl.isDuplicateFlag());
	    				String s1 =(decllist.indexOf(shipmentdecl))+" ";
	    				String val = rowIndexMap.get(s1)+"";
	    				System.out.println("2"+val);
	    				val = val.substring(1,val.length()-2);
	    				System.out.println("3");
	    				String s2 =(tempRowNo)+" ";
	    				System.out.println("4");
	    			map.put(val, s2);
	    			//shipmentdecl.setDuplicateFlag(true);
	    			
	    			//decllist.get(Integer.parseInt(s1)).setDuplicateFlag(true);
	    		} 
	    			}
					//decllist.add(shipmentdecl);
				}
		

				rowNumber++;
				tempRowNo++;
    			shipmentdecltemp = shipmentdecl;

			}
	

			// Close WorkBook
			//System.out.println(decllist);
			workbook.close();
			System.out.println("befor*****"+decllist);
			//decllist.remove(shipmentdecltemp);
			System.out.println("aftr*****"+decllist);
			String error="";
    		String dup="";
    		Set<String> keys = map.keySet();
    		System.out.println("multiMap data**************");
    		for (String key : keys) {
                System.out.println("Key = " + key+" Values = " + map.get(key));
                for(int i = 0; i<map.get(key).size();i++) {
                	String keyval = key;
                	String trial = map.get(key).toString();
                	String val = trial.substring(1,trial.length()-2);
                	if(!(error.contains(val))) {
                	 error += "row " + key + " , "+val+" are duplicate \n" ;
                	 dup += key;
                	 dup += val;
                	 System.out.println("dup value is"+dup);
                	}
                	
                }
            }
    		System.out.println("key"+ error);
    		//System.out.println(map.get(1)+"************************************");
    		decllist.get(0).setErrorCode(error);
    		
    		for(int i = 0; i <dup.length(); i++) {
    			System.out.println("dup"+ i + " " + dup.charAt(i));
    			int index = Character.getNumericValue(dup.charAt(i));
    			decllist.get(index-1).setDuplicateFlag(true);
    		}
			
			return decllist;
		} catch (IOException e) {
			throw new RuntimeException("FAIL! -> message = " + e.getMessage());
		}
	}
	/*
	 * private static boolean checkLeap(int year) { if((year % 400 == 0) || ((year %
	 * 4 == 0) && (year % 100 != 0))) return true; else return false; }
	 */
	public static List<String> chkErrorExcelFile(MultipartFile file,Integer policyNo) {
		// TODO Auto-generated method stub
		//List<StatementDetailsOfLimitSanctioned> list = new ArrayList<>();
		List<String> errors = new ArrayList<>();
		try {
			//read file
			
			List<String[]> excelDetailsList = readExcelFile(file, ExcelStaticData.getExcelFormat(), 2);
			//System.out.println(excelDetailsList.size());
			// skip first Two rows
			int rowNo = 2;
			List<String> validationErrors = null;
			 DataFormatter formatter = new DataFormatter();
			//zeroth row validation	
			  InputStream is = new BufferedInputStream(new ByteArrayInputStream(file.getBytes()));
			  Workbook	workbook = WorkbookFactory.create(is);
			  System.out.println("helloooooo!!!!");
				// Getting the Sheet at index zero
				Sheet sheet = workbook.getSheetAt(0);
			            Row zerothrow = sheet.getRow(0);
			            Cell cellone = zerothrow.getCell(1);
			            String valone = formatter.formatCellValue(cellone);
			           // && ValidationUtil.isValidInteger(valone)==false
			  if(Integer.parseInt(valone)!=policyNo)
			  {
				  errors.add("Enter Correct policy no. !!");
			  }
			  Cell cellthree = zerothrow.getCell(3);
			  String year = formatter.formatCellValue(cellthree);
			  int yearInt = Integer.parseInt(year);
			  if(!ValidationUtil.isValidInteger(year))
			  {
				  errors.add("Enter correct year of declaration");
			  }
			
			  Cell cellfive = zerothrow.getCell(5);
			  String monthtemp = formatter.formatCellValue(cellfive);
			 
			/*
			 * if(!ValidationUtil. isStringNullOrEmpty(monthtemp)) {
			 * errors.add("Enter correct month of declaration"); }
			 */
			  System.out.println("---------"+monthtemp);
			  //int monthInt = Integer.parseInt(monthtemp);
			  int month=0;
			  switch (monthtemp) {
			  case "january":
				    month=1;
				    System.out.println("-------"+month);
				    break;
				  case "february":
					  month=2;
					  System.out.println("-------"+month);
				    break;
				  case "february.":
				    month=2;
				    System.out.println("-------"+month);
				    break;
				  case "march":
				    month=3;
				    System.out.println("-------"+month);
				    break;
				  case "april":
				    month=4;
				    System.out.println("-------"+month);
				    break;
				  case "may":
				   month=5;
				   System.out.println("-------"+month);
				    break;
				  case "june":
				    month=6;
				    System.out.println("-------"+month);
				    break;
				  case "july":
					    month=7;
					    System.out.println("-------"+month);
					    break;
				  case "august":
					    month=8;
					    System.out.println("-------"+month);
					    break;
				  case "september":
					    month=9;
					    System.out.println("-------"+month);
					    break;
				  case "october":
					    month=10;
					    System.out.println("-------"+month);
					    break;
				  case "november":
					    month=11;
					    System.out.println("-------"+month);
					    break;
				  case "december":
					    month=12;
					    System.out.println("-------"+month);
					    break;
				  default: 
					  System.out.println();
				    
				}
			  
			  monthtemp = String.valueOf(month);
			//System.out.println("size"+excelDetailsList.size());
			for(int x=0;x < excelDetailsList.size(); x++) {
				String[] row = excelDetailsList.get(x);
				//System.out.println("rowlength"+row.length);
				int i= 0 ;
				rowNo++;
				// validate record
				//if ok then add to list
				
				if(row != null) {
					validationErrors = ExcelValidator.validateStatementOfLimitsSanctioned(row, rowNo,year,monthtemp);
				}else {
					// if empty row
					// just to keep rowNo we have added null
					continue;
				}
				
				if(validationErrors.size() > 0) {
					System.out.println("returned to excel utils");
					errors.addAll(validationErrors);
					validationErrors.clear();
					continue;// continue for next row
				}
				}
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return errors;
	}
	
	/*
	 * private static boolean isleapyear(int parseInt) {
	 * 
	 * return false; }
	 */
	public static List<String[]> readExcelFile(MultipartFile multipartFile, String[] columnNames, int noOfRowsToSkip) throws IOException, EncryptedDocumentException, InvalidFormatException {
	InputStream is = new BufferedInputStream(new ByteArrayInputStream(multipartFile.getBytes()));
	DataFormatter formatter = new DataFormatter();
	ArrayList<String[]> excelDetails = new ArrayList<>();
	Workbook workbook = null;
	
	try {
			workbook = WorkbookFactory.create(is);
			// Getting the Sheet at index zero
			Sheet sheet = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.rowIterator();
			int rowCount = noOfRowsToSkip;
			while( rowCount > 0) {
				rowIterator.next();
				rowCount--;
			}
        
			rowCount = noOfRowsToSkip;
			
	        while (rowIterator.hasNext()) {
	        	//System.out.println("rowCount "+rowCount);
	        	rowCount++;
	        	Row row = rowIterator.next();
	        	String[] rowDetails = new String[columnNames.length];
	        	
	        	int emptyCount = 0;
	        	for(int i=0;i<columnNames.length;i++) {
	        		System.out.println("--Read-row--"+i+row.getCell(i));
	        		if( formatter.formatCellValue(row.getCell(i)).trim().length() == 0) {
	        			emptyCount++;
	        		}
	        		rowDetails[i] = formatter.formatCellValue(row.getCell(i)).trim();
	        	}
	        	// if row is empty
	        	if(emptyCount == columnNames.length) {
	        		excelDetails.add(null);
	        		//System.out.println("rowCount Empty!!");
	        		continue;
	        	}
	        	excelDetails.add(rowDetails);
	        }
	        
	} finally {
		 if(workbook != null) {
			 workbook.close();
		 }
	}
	
	return excelDetails;
}

}
