package in.ecgc.erp.pol_shd_rod_lm_exp_fe.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidationUtil {
	private static boolean checkEmpty(String value) {
		if( value == null ||  value.trim().equalsIgnoreCase("NONE") || 
				value.trim().replaceAll("\\.", "").replaceAll("\\s+", "").equalsIgnoreCase("NA") || value.trim().equalsIgnoreCase("NA") || value.trim().contains("N.A") || value.trim().contains("N.A.") || 
				value.trim().equalsIgnoreCase("NIL") || 
				value.trim().isEmpty()) {
				return true;
		}
		return false;
	}
	
	public static boolean isStringNullOrEmpty(String string) {
		return checkEmpty(string) ? true : false;
	}
	
	public static boolean isValidInteger(String integerVal) {
		
		if(checkEmpty(integerVal)) {
			return false;
		}
		
		try {
			Integer.parseInt(integerVal);
		}catch(NumberFormatException e) {
			return false;
		}
		
		return true;
	}
	
	public static boolean isValidDouble(String doubleVal) {
		
		if(checkEmpty(doubleVal)) {
			return false;
		}
		
		try {
			Double.parseDouble(doubleVal);
		}catch(NumberFormatException e) {
			return false;
		}
		
		return true;
	}
	
	public static boolean isValidDate(String date, String pattern) {
		if(checkEmpty(date)) {
			return false;
		}
		
		try {
			SimpleDateFormat sdf =  new SimpleDateFormat(pattern);
			sdf.setLenient(false);
			sdf.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	public static boolean isNullObject(Object object) {
		return object == null ? true : false;
	}
	
	public static boolean isemptyBoolean(boolean bVal) {
		if(!(bVal==true || bVal==false))
			return true;
		else
			return false;
	}
}
