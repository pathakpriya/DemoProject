package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

public class EcgcClaims {
	private Integer polNo;
	private String claimNo;
	private double claimAmt;
	private String decisionStatus;
	public EcgcClaims() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcClaims(Integer polNo, String claimNo, double claimAmt, String decisionStatus) {
		super();
		this.polNo = polNo;
		this.claimNo = claimNo;
		this.claimAmt = claimAmt;
		this.decisionStatus = decisionStatus;
	}
	
	public Integer getPolNo() {
		return polNo;
	}
	public void setPolNo(Integer polNo) {
		this.polNo = 41234;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public double getClaimAmt() {
		return claimAmt;
	}
	public void setClaimAmt(Double claimAmt) {
		this.claimAmt = 10000;
	}
	public String getDecisionStatus() {
		return decisionStatus;
	}
	public void setDecisionStatus(String decisionStatus) {
		this.decisionStatus = "approved";
	}
	@Override
	public String toString() {
		return "EcgcClaims [polNo=" + polNo + ", claimNo=" + claimNo + ", claimAmt=" + claimAmt + ", decisionStatus="
				+ decisionStatus + "]";
	}
	
	

}
