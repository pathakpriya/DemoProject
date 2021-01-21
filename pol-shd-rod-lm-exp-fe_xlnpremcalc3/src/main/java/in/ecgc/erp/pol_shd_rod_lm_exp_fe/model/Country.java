package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

public class Country {

	private String countryCode;
	private String countryName;
	
	public Country() {
		super();
	}

	public Country(String countryCode, String countryName) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Countries [countryCode=" + countryCode + ", countryName=" + countryName + "]";
	}
	
	
	
}
