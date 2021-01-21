package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.util.Map;
import java.util.Map.Entry;

public class TermOfPayment {

	private String topId;
	private String top;
	
	public TermOfPayment() {
	
	}
	
	public TermOfPayment(String topId, String top) {
		super();
		this.topId = topId;
		this.top = top;
	}

	public String getTopId() {
		return topId;
	}

	public void setTopId(String topId) {
		this.topId = topId;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	@Override
	public String toString() {
		return "TermOfPayment [topId=" + topId + ", top=" + top + "]";
	}

	 
	
	
}
