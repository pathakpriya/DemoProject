package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

public class EcgcPolNcbMgmt {


	private Integer proposalNo;
	private Integer polNo;
	private String prefBranchCd;
	private String ieCd;
	private String exporterCd;
	private float ncbBalance;
	private String effectiveDt;
	private float ncbReduction;
	private float ncbRestoration;
	private String reason;
	private Integer claimNo;
	private Character status;
	private String createdBy;
	private String createdDt;
	private String lastUpdatedBy;
	private String lastUpdatedDt;
	public EcgcPolNcbMgmt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcPolNcbMgmt(Integer proposalNo, Integer polNo, String prefBranchCd, String ieCd, String exporterCd,
			float ncbBalance, String effectiveDt, float ncbReduction, float ncbRestoration, String reason, Integer claimNo,
			Character status, String createdBy, String createdDt, String lastUpdatedBy, String lastUpdatedDt) {
		super();
		this.proposalNo = proposalNo;
		this.polNo = polNo;
		this.prefBranchCd = prefBranchCd;
		this.ieCd = ieCd;
		this.exporterCd = exporterCd;
		this.ncbBalance = ncbBalance;
		this.effectiveDt = effectiveDt;
		this.ncbReduction = ncbReduction;
		this.ncbRestoration = ncbRestoration;
		this.reason = reason;
		this.claimNo = claimNo;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDt = lastUpdatedDt;
	}
	public Integer getProposalNo() {
		return proposalNo;
	}
	public void setProposalNo(Integer proposalNo) {
		this.proposalNo = proposalNo;
	}
	public Integer getPolNo() {
		return polNo;
	}
	public void setPolNo(Integer polNo) {
		this.polNo = polNo;
	}
	public String getPrefBranchCd() {
		return prefBranchCd;
	}
	public void setPrefBranchCd(String prefBranchCd) {
		this.prefBranchCd = prefBranchCd;
	}
	public String getIeCd() {
		return ieCd;
	}
	public void setIeCd(String ieCd) {
		this.ieCd = ieCd;
	}
	public String getExporterCd() {
		return exporterCd;
	}
	public void setExporterCd(String exporterCd) {
		this.exporterCd = exporterCd;
	}
	public float getNcbBalance() {
		return ncbBalance;
	}
	public void setNcbBalance(float ncbBalance) {
		this.ncbBalance = ncbBalance;
	}
	public String getEffectiveDt() {
		return effectiveDt;
	}
	public void setEffectiveDt(String effectiveDt) {
		this.effectiveDt = effectiveDt;
	}
	public float getNcbReduction() {
		return ncbReduction;
	}
	public void setNcbReduction(float ncbReduction) {
		this.ncbReduction = ncbReduction;
	}
	public float getNcbRestoration() {
		return ncbRestoration;
	}
	public void setNcbRestoration(float ncbRestoration) {
		this.ncbRestoration = ncbRestoration;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(Integer claimNo) {
		this.claimNo = claimNo;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(String createdDt) {
		this.createdDt = createdDt;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public String getLastUpdatedDt() {
		return lastUpdatedDt;
	}
	public void setLastUpdatedDt(String lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}
	@Override
	public String toString() {
		return "EcgcPolNcbMgmt [proposalNo=" + proposalNo + ", polNo=" + polNo + ", prefBranchCd=" + prefBranchCd
				+ ", ieCd=" + ieCd + ", exporterCd=" + exporterCd + ", ncbBalance=" + ncbBalance + ", effectiveDt="
				+ effectiveDt + ", ncbReduction=" + ncbReduction + ", ncbRestoration=" + ncbRestoration + ", reason="
				+ reason + ", claimNo=" + claimNo + ", status=" + status + ", createdBy=" + createdBy + ", createdDt="
				+ createdDt + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDt=" + lastUpdatedDt + "]";
	}





}
