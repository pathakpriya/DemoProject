package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;

public class PolPremRateMst {
	private String productId;	
	private String riskCode;
	private String riskDesc;
	private String countryGrp;
	private String topId;
	private Integer premiumRate;
	private String validFrom;
	private String validTo;
	private String enteredBy;	
	private String enteredTimestamp;
	
	public PolPremRateMst() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PolPremRateMst(String productId, String riskCode, String riskDesc, String countryGrp, String topId,
			Integer premiumRate, String validFrom, String validTo, String enteredBy, String enteredTimestamp) {
		super();
		this.productId = productId;
		this.riskCode = riskCode;
		this.riskDesc = riskDesc;
		this.countryGrp = countryGrp;
		this.topId = topId;
		this.premiumRate = premiumRate;
		this.validFrom = validFrom;
		this.validTo = validTo;
		this.enteredBy = enteredBy;
		this.enteredTimestamp = enteredTimestamp;
	}

	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskDesc() {
		return riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}
	public String getCountryGrp() {
		return countryGrp;
	}
	public void setCountryGrp(String countryGrp) {
		this.countryGrp = countryGrp;
	}
	public String getTopId() {
		return topId;
	}
	public void setTopId(String topId) {
		this.topId = topId;
	}
	public Integer getPremiumRate() {
		return premiumRate;
	}
	public void setPremiumRate(Integer premiumRate) {
		this.premiumRate = premiumRate;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTo() {
		return validTo;
	}
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	public String getEnteredBy() {
		return enteredBy;
	}
	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}
	public String getEnteredTimestamp() {
		return enteredTimestamp;
	}
	public void setEnteredTimestamp(String enteredTimestamp) {
		this.enteredTimestamp = enteredTimestamp;
	}

	@Override
	public String toString() {
		return "PolPremRateMst [productId=" + productId + ", riskCode=" + riskCode + ", riskDesc=" + riskDesc
				+ ", countryGrp=" + countryGrp + ", topId=" + topId + ", premiumRate=" + premiumRate + ", validFrom="
				+ validFrom + ", validTo=" + validTo + ", enteredBy=" + enteredBy + ", enteredTimestamp="
				+ enteredTimestamp + "]";
	}	
	
	

}
