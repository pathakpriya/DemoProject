package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;

import java.util.List;


import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.PolPropSchedule;

public class PolPropScheduleService {
	
	 private static final List<PolPropSchedule> polpropschduledetails = new ArrayList<PolPropSchedule>();
		
	    static {
	        initData();
	    }
	   
	    private static void initData() {
	    	polpropschduledetails.add( new PolPropSchedule("EXP123",41234,"01/01/2018","31/12/2018","SCR",0,20.00,15.00,10.00,2.00,0.00,0.00,10000.00));
	    	polpropschduledetails.add( new PolPropSchedule("EXP12345",12345,"01/01/2018","31/12/2018","SSP",0,20.00,15.00,10.00,2.00,0.00,0.00,10000.00));
	    	polpropschduledetails.add( new PolPropSchedule("EXP111",1111,"01/01/2018","31/12/2018","ETP",0,20.00,15.00,10.00,2.00,0.00,0.00,10000.00));
	    	
	    }
	    
	    public static List<PolPropSchedule> getPolPropschddetailsList()
	    {
	    	return polpropschduledetails;
	    }

}
