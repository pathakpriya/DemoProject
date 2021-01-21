package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.Country;

public class CountryService {

	  private static final List<Country> COUNTRIES = new ArrayList<Country>();
	
	    static {
	        initData();
	    }
	 
	    private static void initData() {
	        Country vn = new Country( "DZD", "Algeria");
	        Country en = new Country( "ARP", "Argentina");
	        Country ru = new Country( "AUD", "Australia");
	    
	        COUNTRIES.add(en);
	        COUNTRIES.add(vn);
	        COUNTRIES.add(ru);
	        
	        COUNTRIES.add( new Country("ATS","Austria"));
	        COUNTRIES.add( new Country( "BSD","Bahamas"));
	        COUNTRIES.add(new Country("BBD","Barbados"));
	        COUNTRIES.add(new Country( "BEF","Belgium"));
	        COUNTRIES.add(new Country( "BMD","Bermuda"));
	        COUNTRIES.add(new Country( "BRR","Brazil"));
	        COUNTRIES.add(new Country("BGL","Bulgaria"));
	        COUNTRIES.add(new Country("CAD","Canada"));
	        COUNTRIES.add(new Country("CLP","Chile"));
	        COUNTRIES.add(new Country("CNY","China"));
	        COUNTRIES.add(new Country("CYP","Cyprus"));
	        COUNTRIES.add(new Country("CSK","Czech"));
	        COUNTRIES.add(new Country( "DKK","Denmark"));
	        COUNTRIES.add(new Country( "NLG","Dutch"));
	        COUNTRIES.add(new Country("XCD","Eastern Caribbean"));
	        COUNTRIES.add(new Country( "EGP","Egypt"));
	        COUNTRIES.add(new Country("FJD","Fiji"));
	        COUNTRIES.add(new Country("FIM","Finland"));
	        COUNTRIES.add(new Country( "FRF","France"));
	       
	        
	    }
	 
	    public static List<Country> getCountries() {
	        return COUNTRIES;
	    }
	 
	    public static Map<String, String> getMapCountries() {
	    	 Map<String, String> map = new HashMap<String, String>();
	        for (Country c : COUNTRIES) {
	            map.put(c.getCountryCode(), c.getCountryName());
	        }
	        return map;
	    }
	    
	    public static String getKey(String data, Map<String, String> map) {
	    	
	    	for (Entry<String, String> e : map.entrySet()) {
	    		
	    		if (e.getValue().equals(data)) {
	    			System.out.println("key:" + (String) e.getKey());
	                return (String) e.getKey();
	    		}
	            	
	    	}
	            
	        return null;
	    }
	
}
