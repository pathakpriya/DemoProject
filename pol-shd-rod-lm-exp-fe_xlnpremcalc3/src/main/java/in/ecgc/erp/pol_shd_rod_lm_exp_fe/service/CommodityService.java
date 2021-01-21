package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CommodityService {

	public static LinkedHashMap<String, ArrayList<String>> getCommodities(){
		ArrayList<String> agriculture = new ArrayList<String>();
		agriculture.add("10-Tea");
		agriculture.add("11-Coffee");
		agriculture.add("12-Spices");
		agriculture.add("13-Cashew");
		agriculture.add("14-Tobacco");
		agriculture.add("21-Agriculture and Allied Products(Including Processed Foods)");
		agriculture.add("22-Marine Products");
		agriculture.add("31-Rice");
		agriculture.add("32-Dairy and Poultry Products");
		agriculture.add("33-Meat and Meat Preparations");
		
		ArrayList<String> textile =new ArrayList<String>();
		textile.add("04-Cotton(Fibre,Yarn,Fabrics)including handloom");
		textile.add("15-Jute and Jute Manufacturers");
		textile.add("16-Coir and coir Manufacturers");
		textile.add("17-Silk Goods(including yarn)");
		textile.add("18-Synthetic Yarn,Fibres,Manufacturers(Including nylon and woolen)");
		textile.add("19-Readymade Garments");
		textile.add("20-Hosiery Goods");
		textile.add("26-Carpets");
		
		LinkedHashMap<String,ArrayList<String>> commodities= new LinkedHashMap<String , ArrayList<String>>();
		commodities.put("A)AGRICULTURE AND ALLIED PRODUCTS", agriculture);
		commodities.put("B)TEXTILE AND TEXTILE PRODUCTS", textile);
		
		return commodities;
	}
}
