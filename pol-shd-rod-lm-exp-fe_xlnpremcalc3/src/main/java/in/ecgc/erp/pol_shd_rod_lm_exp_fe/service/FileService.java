package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcPolShdScrSepEtpSspBwp;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.util.ExcelUtils;
@Service
public class FileService {
	public List<EcgcPolShdScrSepEtpSspBwp>  store(MultipartFile file) throws ParseException, EncryptedDocumentException, InvalidFormatException{
			List<EcgcPolShdScrSepEtpSspBwp>  set= ExcelUtils.parseExcelFile(file);
			EcgcPolShdScrSepEtpSspBwp lastElement=null;
			 Iterator<EcgcPolShdScrSepEtpSspBwp> itr = set.iterator();
			    while(itr.hasNext()){
			         lastElement = itr.next();
			    }
			//set.remove(lastElement);
    		//System.out.println(set);
    		return set;
	}
	
	
	
	public List<String> chkError(MultipartFile uploadfile,Integer policyNo) {
		// TODO Auto-generated method stub
		List<String> errors = new ArrayList<>();
		
			errors = ExcelUtils.chkErrorExcelFile(uploadfile,policyNo);
		
		return errors;
		
	}

}
