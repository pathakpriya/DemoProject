package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class EcgcPolShdAmndHdr {

	private String branchCd;
	private Long amndId;
	private Long polNum;
	private Integer amndYear;
	private Integer amndMonth;
	private Integer amndNum;
	private Long iwNum;
	private Long iwItmNum;
	private Date amndRecvdDt;
	private String entryByType;
	private String amndStatus;
	private String delFlag;
	private String createdBy;
	private Timestamp createdDt;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDt;
	private List<EcgcPolShdAmndDtls> ecgcPolShdAmndDtlss;
	private List<EcgcPolShdAmndSctyChklst> ecgcPolShdAmndSctyChklsts;
	public EcgcPolShdAmndHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcPolShdAmndHdr(String branchCd, Long amndId, Long polNum, Integer amndYear, Integer amndMonth,
			Integer amndNum, Long iwNum, Long iwItmNum, Date amndRecvdDt, String entryByType, String amndStatus,
			String delFlag, String createdBy, Timestamp createdDt, String lastUpdatedBy, Timestamp lastUpdatedDt,
			List<EcgcPolShdAmndDtls> ecgcPolShdAmndDtlss, List<EcgcPolShdAmndSctyChklst> ecgcPolShdAmndSctyChklsts) {
		super();
		this.branchCd = branchCd;
		this.amndId = amndId;
		this.polNum = polNum;
		this.amndYear = amndYear;
		this.amndMonth = amndMonth;
		this.amndNum = amndNum;
		this.iwNum = iwNum;
		this.iwItmNum = iwItmNum;
		this.amndRecvdDt = amndRecvdDt;
		this.entryByType = entryByType;
		this.amndStatus = amndStatus;
		this.delFlag = delFlag;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDt = lastUpdatedDt;
		this.ecgcPolShdAmndDtlss = ecgcPolShdAmndDtlss;
		this.ecgcPolShdAmndSctyChklsts = ecgcPolShdAmndSctyChklsts;
	}
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public Long getAmndId() {
		return amndId;
	}
	public void setAmndId(Long amndId) {
		this.amndId = amndId;
	}
	public Long getPolNum() {
		return polNum;
	}
	public void setPolNum(Long polNum) {
		this.polNum = polNum;
	}
	public Integer getAmndYear() {
		return amndYear;
	}
	public void setAmndYear(Integer amndYear) {
		this.amndYear = amndYear;
	}
	public Integer getAmndMonth() {
		return amndMonth;
	}
	public void setAmndMonth(Integer amndMonth) {
		this.amndMonth = amndMonth;
	}
	public Integer getAmndNum() {
		return amndNum;
	}
	public void setAmndNum(Integer amndNum) {
		this.amndNum = amndNum;
	}
	public Long getIwNum() {
		return iwNum;
	}
	public void setIwNum(Long iwNum) {
		this.iwNum = iwNum;
	}
	public Long getIwItmNum() {
		return iwItmNum;
	}
	public void setIwItmNum(Long iwItmNum) {
		this.iwItmNum = iwItmNum;
	}
	public Date getAmndRecvdDt() {
		return amndRecvdDt;
	}
	public void setAmndRecvdDt(Date amndRecvdDt) {
		this.amndRecvdDt = amndRecvdDt;
	}
	public String getEntryByType() {
		return entryByType;
	}
	public void setEntryByType(String entryByType) {
		this.entryByType = entryByType;
	}
	public String getAmndStatus() {
		return amndStatus;
	}
	public void setAmndStatus(String amndStatus) {
		this.amndStatus = amndStatus;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Timestamp createdDt) {
		this.createdDt = createdDt;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Timestamp getLastUpdatedDt() {
		return lastUpdatedDt;
	}
	public void setLastUpdatedDt(Timestamp lastUpdatedDt) {
		this.lastUpdatedDt = lastUpdatedDt;
	}
	public List<EcgcPolShdAmndDtls> getEcgcPolShdAmndDtlss() {
		return ecgcPolShdAmndDtlss;
	}
	public void setEcgcPolShdAmndDtlss(List<EcgcPolShdAmndDtls> ecgcPolShdAmndDtlss) {
		this.ecgcPolShdAmndDtlss = ecgcPolShdAmndDtlss;
	}
	public List<EcgcPolShdAmndSctyChklst> getEcgcPolShdAmndSctyChklsts() {
		return ecgcPolShdAmndSctyChklsts;
	}
	public void setEcgcPolShdAmndSctyChklsts(List<EcgcPolShdAmndSctyChklst> ecgcPolShdAmndSctyChklsts) {
		this.ecgcPolShdAmndSctyChklsts = ecgcPolShdAmndSctyChklsts;
	}
	@Override
	public String toString() {
		return "EcgcPolShdAmndHdr [branchCd=" + branchCd + ", amndId=" + amndId + ", polNum=" + polNum + ", amndYear="
				+ amndYear + ", amndMonth=" + amndMonth + ", amndNum=" + amndNum + ", iwNum=" + iwNum + ", iwItmNum="
				+ iwItmNum + ", amndRecvdDt=" + amndRecvdDt + ", entryByType=" + entryByType + ", amndStatus="
				+ amndStatus + ", delFlag=" + delFlag + ", createdBy=" + createdBy + ", createdDt=" + createdDt
				+ ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDt=" + lastUpdatedDt + ", ecgcPolShdAmndDtlss="
				+ ecgcPolShdAmndDtlss + ", ecgcPolShdAmndSctyChklsts=" + ecgcPolShdAmndSctyChklsts + "]";
	}
	
	
}
