package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcClaims;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcPolNcbMgmt;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.PolPremRateMst;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.PolPropSchedule;

public class premRateService {
	 private static final List<PolPremRateMst> premRates = new ArrayList<PolPremRateMst>();
		
	    static {
	        initData();
	    }
	 
	    private static void initData() {
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A1","DA90",10,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A1","DA180",14,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A1","DA270",18,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A1","DA360",22,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A2","DA90",29,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A2","DA180",43,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A2","DA270",55,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","A2","DA360",65,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","B1","DA90",42,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","B1","DA180",62,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","B1","DA270",79,"","","","01/11/2019"));
	    	premRates.add( new PolPremRateMst("SCR","SCRPOL","SCR Political risk","B1","DA360",94,"","","","01/11/2019"));
	    	
	    }
	    
	    public static List<PolPremRateMst> getPremRates()
	    {
	    	return premRates;
	    }
	    
	    public static List<PolPremRateMst> premRate()
		  {
	    	return premRateService.getPremRates().stream().filter(o->o.getTopId()=="DA90"&& o.getProductId()=="SCR"&& o.getRiskCode()=="SCRPOL").collect(Collectors.toList());
		  }

		public static Double calPremAmtdecl(int premRate, Double givInr) {
			double premAmt=0.00;
			double netprem=0.00;
			List<EcgcPolNcbMgmt> ncbdetail =NcbMgmtService.getPolNcbDetails().stream().filter(o->o.getPolNo()==41234).collect(Collectors.toList());
			double ncb = ncbdetail.get(0).getNcbBalance();
			List<PolPropSchedule> polpropschedule = PolPropScheduleService.getPolPropschddetailsList().stream().filter(o->o.getPolNum()==41234).collect(Collectors.toList());
			double voldiscount=polpropschedule.get(0).getVolumeDisc();
			double upfrontdicount=polpropschedule.get(0).getUpfrontDisc();
			double turndiscount=polpropschedule.get(0).getTurnoverDisc();
			double specialdiscount=polpropschedule.get(0).getSpecialDisc();
			double malus=polpropschedule.get(0).getMalusPremiumLoading();
			netprem=premRate+ncb+voldiscount+upfrontdicount+turndiscount+specialdiscount-malus;
			premAmt=(netprem*givInr)/100;
			return premAmt;
		}
		
		public static Double calPremAmtexpo(int premRate, Double givInr) {
			double premAmt=0.00;
			double netprem=0.00;
			List<PolPropSchedule> ncbdetail=PolPropScheduleService.getPolPropschddetailsList().stream().filter(o->o.getPolNum()==41234).collect(Collectors.toList());
			double ncb = ncbdetail.get(0).getNcb();
			List<PolPropSchedule> polpropschedule = PolPropScheduleService.getPolPropschddetailsList().stream().filter(o->o.getPolNum()==41234).collect(Collectors.toList());
			double voldiscount=polpropschedule.get(0).getVolumeDisc();
			double upfrontdicount=polpropschedule.get(0).getUpfrontDisc();
			double turndiscount=polpropschedule.get(0).getTurnoverDisc();
			double specialdiscount=polpropschedule.get(0).getSpecialDisc();
			double malus=polpropschedule.get(0).getMalusPremiumLoading();
			netprem=premRate+ncb+voldiscount+upfrontdicount+turndiscount+specialdiscount-malus;
			premAmt=(netprem*givInr)/100;
			return premAmt;
		}
	   
	    
	    
	    
	    
	    
	    
	    
	    
}
