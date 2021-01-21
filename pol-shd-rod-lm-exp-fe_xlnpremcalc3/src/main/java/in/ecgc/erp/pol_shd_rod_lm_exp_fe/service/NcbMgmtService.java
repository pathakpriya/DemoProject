package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;
import java.util.List;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcPolNcbMgmt;


public class NcbMgmtService {
	
	
	private static final List<EcgcPolNcbMgmt> ncbmgmtdetails = new ArrayList<EcgcPolNcbMgmt>();
	
    static {
        initData();
    }
   
    private static void initData() {
    	ncbmgmtdetails.add( new EcgcPolNcbMgmt(9876,41234,"","","",10,"",0,0,"",12345,'Y',"","","",""));
    	ncbmgmtdetails.add( new EcgcPolNcbMgmt(2345,4563,"","","",10,"",0,0,"",123456,'Y',"","","",""));
    	ncbmgmtdetails.add( new EcgcPolNcbMgmt(3456,6789,"","","",10,"",0,0,"",123457,'Y',"","","",""));
    	
    }
    
    public static List<EcgcPolNcbMgmt> getPolNcbDetails()
    {
    	return ncbmgmtdetails;
    }
	
	
	

}
