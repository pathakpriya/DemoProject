package in.ecgc.erp.pol_shd_rod_lm_exp_fe.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.Country;
import in.ecgc.erp.pol_shd_rod_lm_exp_fe.model.TermOfPayment;

public class TermOfPaymentService {

	private static final List<TermOfPayment> top = new ArrayList<TermOfPayment>();

	static {
		initData();
	}

	private static void initData() {
		top.add(new TermOfPayment("DA-30", "DA-30"));
		top.add(new TermOfPayment("DA-60", "DA-60"));
		top.add(new TermOfPayment("DA-90", "DA-90"));
		top.add(new TermOfPayment("DP", "DP"));
		top.add(new TermOfPayment("LC", "LC"));

	}

	public static List<TermOfPayment> getListTop() {
		return top;
	}

	public static Map<String, String> getMapTop() {
		Map<String, String> map = new HashMap<String, String>();
		for (TermOfPayment c : top) {
			map.put(c.getTopId(), c.getTop());
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
