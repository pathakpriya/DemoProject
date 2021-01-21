package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;



public class PolPropSchedule {

	private String expCode;
	private Integer polNum;
	private String polStartDt;
	private String polEndDt;
	private String polType;
	private float malusReductionInCoverPercentage ;
	private double malusPremiumLoading;
	private double ncb;
	private double turnoverDisc;
	private double volumeDisc;
	private double upfrontDisc;
	private double specialDisc;
	private double avgMonthlyPremium;
	
	public PolPropSchedule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PolPropSchedule(String expCode, Integer polNum, String polStartDt, String polEndDt, String polType,
			float malusReductionInCoverPercentage, double malusPremiumLoading, double ncb, double turnoverDisc,
			double volumeDisc, double upfrontDisc, double specialDisc, double avgMonthlyPremium) {
		super();
		this.expCode = expCode;
		this.polNum = polNum;
		this.polStartDt = polStartDt;
		this.polEndDt = polEndDt;
		this.polType = polType;
		this.malusReductionInCoverPercentage = malusReductionInCoverPercentage;
		this.malusPremiumLoading = malusPremiumLoading;
		this.ncb = ncb;
		this.turnoverDisc = turnoverDisc;
		this.volumeDisc = volumeDisc;
		this.upfrontDisc = upfrontDisc;
		this.specialDisc = specialDisc;
		this.avgMonthlyPremium = avgMonthlyPremium;
	}
	public String getExpCode() {
		return expCode;
	}
	public void setExpCode(String expCode) {
		this.expCode = expCode;
	}
	public Integer getPolNum() {
		return polNum;
	}
	public void setPolNum(Integer polNum) {
		this.polNum = polNum;
	}
	public String getPolStartDt() {
		return polStartDt;
	}
	public void setPolStartDt(String polStartDt) {
		this.polStartDt = polStartDt;
	}
	public String getPolEndDt() {
		return polEndDt;
	}
	public void setPolEndDt(String polEndDt) {
		this.polEndDt = polEndDt;
	}
	public String getPolType() {
		return polType;
	}
	public void setPolType(String polType) {
		this.polType = polType;
	}
	public float getMalusReductionInCoverPercentage() {
		return malusReductionInCoverPercentage;
	}
	public void setMalusReductionInCoverPercentage(float malusReductionInCoverPercentage) {
		this.malusReductionInCoverPercentage = malusReductionInCoverPercentage;
	}
	public double getMalusPremiumLoading() {
		return malusPremiumLoading;
	}
	public void setMalusPremiumLoading(double malusPremiumLoading) {
		this.malusPremiumLoading = malusPremiumLoading;
	}
	public double getNcb() {
		return ncb;
	}
	public void setNcb(double ncb) {
		this.ncb = ncb;
	}
	public double getTurnoverDisc() {
		return turnoverDisc;
	}
	public void setTurnoverDisc(double turnoverDisc) {
		this.turnoverDisc = turnoverDisc;
	}
	public double getVolumeDisc() {
		return volumeDisc;
	}
	public void setVolumeDisc(double volumeDisc) {
		this.volumeDisc = volumeDisc;
	}
	public double getUpfrontDisc() {
		return upfrontDisc;
	}
	public void setUpfrontDisc(double upfrontDisc) {
		this.upfrontDisc = upfrontDisc;
	}
	public double getSpecialDisc() {
		return specialDisc;
	}
	public void setSpecialDisc(double specialDisc) {
		this.specialDisc = specialDisc;
	}
	public double getAvgMonthlyPremium() {
		return avgMonthlyPremium;
	}
	public void setAvgMonthlyPremium(double avgMonthlyPremium) {
		this.avgMonthlyPremium = avgMonthlyPremium;
	}
	@Override
	public String toString() {
		return "PolPropSchedule [expCode=" + expCode + ", polNum=" + polNum + ", polStartDt=" + polStartDt
				+ ", polEndDt=" + polEndDt + ", polType=" + polType + ", malusReductionInCoverPercentage="
				+ malusReductionInCoverPercentage + ", malusPremiumLoading=" + malusPremiumLoading + ", ncb=" + ncb
				+ ", turnoverDisc=" + turnoverDisc + ", volumeDisc=" + volumeDisc + ", upfrontDisc=" + upfrontDisc
				+ ", specialDisc=" + specialDisc + ", avgMonthlyPremium=" + avgMonthlyPremium + "]";
	}
	
				

		
	
}
