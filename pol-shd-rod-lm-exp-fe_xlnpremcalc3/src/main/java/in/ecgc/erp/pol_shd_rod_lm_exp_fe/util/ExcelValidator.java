package in.ecgc.erp.pol_shd_rod_lm_exp_fe.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.web.multipart.MultipartFile;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.EcgcPolShdScrSepEtpSspBwp;

public class ExcelValidator {
	
	public static List<String> validateStatementOfLimitsSanctioned(String[] row, int recordNo,String year, String month) throws IOException, EncryptedDocumentException, InvalidFormatException {
		int i = -1;
		int count =0;
		String day;
		LocalDate date = null;
		
		List<String> errors = new ArrayList<>();
		String top=null;
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
		
		List<String> toplist = new ArrayList<String>();
		toplist.add("DA-30");
		toplist.add("DA-60");
		toplist.add("DA-90");
		toplist.add("DP");
		toplist.add("LC");
		boolean leapornot = isleapyear(Integer.parseInt(year));
		 int monthInt = Integer.parseInt(month);
		
		/*
		 * "Serial No","Bank Branch", "Exporter Name & Address", "Status of Exporter", "IE Code", "Asses Classification", "Credit Rating", "Commodity Exported",
				"Packing credit Limit in force", "Other bankers"
		 */
		//System.out.println("Validating "+recordNo);
		//Bank branch Name 
	
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Day Of Shipment is Empty");
			count++;
		}
		else if(!ValidationUtil.isValidInteger(row[i])) {
			errors.add("Invalid Day of Shipment no.");
			count++;
		}else if(monthInt==2 && leapornot)
		{
			if (Integer.parseInt(row[i])>=29 && Integer.parseInt(row[i])<=1)
			{
				errors.add("Invalid Day of Shipment no.");
				count++;
			}
		}else if(monthInt==2)
		{
			if (Integer.parseInt(row[i])>=28 && Integer.parseInt(row[i])<=1)
			{
				errors.add("Invalid Day of Shipment no.");
				count++;
			}
		}else if(monthInt == 1 || monthInt == 3 || monthInt == 5 || monthInt == 7 || monthInt == 8 || monthInt == 10 || monthInt == 12)
		{
			if (Integer.parseInt(row[i])>=31 && Integer.parseInt(row[i])<=1)
			{
				errors.add("Invalid Day of Shipment no.");
				count++;
			}
		}else 
		{
			if (Integer.parseInt(row[i])>=30 && Integer.parseInt(row[i])<=1)
			{
				errors.add("Invalid Day of Shipment no.");
				count++;
			}
		}
		if(count==0)
		{
			day=row[i];
 date = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month), Integer.parseInt(day)); //2015-12-22
			//with custom formatter 
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
  String   formattedDate = date.format(myFormatObj);  
			System.out.println("++++++Date+++++ "+formattedDate);
		}
		//System.out.println("i"+row[i]);
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Invoice no. is Empty");
		}else if(!ValidationUtil.isValidInteger(row[i])) {
			errors.add("Invalid Invoice no.");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Commodity is Empty");
		}else if(!commodity.contains(row[i]))
		{
			errors.add("Invalid Commodity");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Country is Empty");
		}else if(!countries.contains(row[i]))
		{
			errors.add("Invalid Country");
		}
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer Code is Empty");
		}
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer name is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer Address is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer street is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer city is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer state is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer country is Empty");
		}
		
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Buyer postal is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Payment country is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Source country is Empty");
		}
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Destination country is Empty");
		}
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Giv INR is Empty");
		}else if(!ValidationUtil.isValidDouble(row[i])) {
			errors.add("Invalid Giv INR");
		}
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("TOP is Empty");
		}else if(true)
		{
		top = row[i];
		System.out.println("++++top+++++"+top);
		}
	
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Due Date is Empty");
		}else if(top.equals("DA-30") ){
			//System.out.println("its DA-30");
			 LocalDate newDate= date.plusDays(30);
			 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		  String   formattedDate = newDate.format(myFormatObj);
			System.out.println("+++++New Date++++"+formattedDate);
			if(row[i].equals(formattedDate)) {
				
			}else
			{
				errors.add("Enter Correct Due date according to Top !");
			}
		}else if(top.equals("DA-60") ){
			//System.out.println("its DA-30");
			 LocalDate newDate= date.plusDays(60);
			 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/YYYY");  
		  String   formattedDate = newDate.format(myFormatObj);
			System.out.println("+++++New Date++++"+formattedDate);
			if(row[i].equals(formattedDate)) {
				
			}else
			{
				errors.add("Enter Correct Due date according to Top !");
			}
		}else if(top.equals("DA-90") ){
			//System.out.println("its DA-30");
			 LocalDate newDate= date.plusDays(90);
			 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/YYYY");  
		  String   formattedDate = newDate.format(myFormatObj);
			System.out.println("+++++New Date++++"+formattedDate);
			if(row[i].equals(formattedDate)) {
				
			}else
			{
				errors.add("Enter Correct Due date according to Top !");
			}
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])) {
			errors.add("Date of Realization is Empty");
		}
		if(ValidationUtil.isStringNullOrEmpty(row[++i]) && top=="LC") {
			errors.add("Bank Code is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i]) && top=="LC") {
			errors.add("Bank name is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])&& top=="LC") {
			errors.add("Bank Address is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])&& top=="LC") {
			errors.add("Bank street is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])&& top=="LC") {
			errors.add("Bank city is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])&& top=="LC") {
			errors.add("Bank state is Empty");
		}
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])&& top=="LC") {
			errors.add("Bank country is Empty");
		}
		
		
		if(ValidationUtil.isStringNullOrEmpty(row[++i])&& top=="LC") {
			errors.add("Bank postal is Empty");
		}
		
		
		if(errors.size() > 0) {
			errors.add(0,"----------------------------------------------");
			errors.add(1,"Errors in Excel Row "+(recordNo-1));
		}
		
		System.out.println("errors are :" + errors);
		System.out.println("errors are not there?"+""+errors.isEmpty());
		return errors;
	}

	private static boolean isleapyear(int year) {
		if(((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
			return true;
		else return false;
	}

}
