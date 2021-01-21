package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;
import java.util.List;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcClaims;



public class EcgcClaimsService {
	 private static final List<EcgcClaims> claimdetails = new ArrayList<EcgcClaims>();
		
	    static {
	        initData();
	    }
	   
	 
	    private static void initData() {
	    	claimdetails.add( new EcgcClaims(41234,"claim123",5000.00,"Approved"));
	    	claimdetails.add( new EcgcClaims(12345,"claim1234",5000.00,"Processing"));
	    	claimdetails.add( new EcgcClaims(11111,"claim12345",100000.00,"Processing"));
	    	claimdetails.add( new EcgcClaims(22222,"claim123456",500000.00,"Approved"));
	    
	    }
	    
	    public static List<EcgcClaims> getClaimDetails()
	    {
	    	return claimdetails;
	    }

}
