package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;

public class EcgcPolShdAmndAdj {

	private Long shpmntSeqId;
	private Long amndSeqId;
	private Double previousAdjAmt;
	private Double premiumRateChgble;
	private Double premiumChgble;
	private String risktypeChgble;
	private String cntyGrp;
	private String topId;
	private String adjStat;
	private String adjStatRemarks;
	private Double premiumRateChged;
	private Double premiumChged;
	private String risktypeChged;
	private String txnNum;
	private Boolean shpmntAmdmntFlag;
	private String userIp;
	private String adjustedBy;
	private Timestamp adjustedDt;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDt;
	public EcgcPolShdAmndAdj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcPolShdAmndAdj(Long shpmntSeqId, Long amndSeqId, Double previousAdjAmt, Double premiumRateChgble,
			Double premiumChgble, String risktypeChgble, String cntyGrp, String topId, String adjStat,
			String adjStatRemarks, Double premiumRateChged, Double premiumChged, String risktypeChged, String txnNum,
			Boolean shpmntAmdmntFlag, String userIp, String adjustedBy, Timestamp adjustedDt, String lastUpdatedBy,
			Timestamp lastUpdatedDt) {
		super();
		this.shpmntSeqId = shpmntSeqId;
		this.amndSeqId = amndSeqId;
		this.previousAdjAmt = previousAdjAmt;
		this.premiumRateChgble = premiumRateChgble;
		this.premiumChgble = premiumChgble;
		this.risktypeChgble = risktypeChgble;
		this.cntyGrp = cntyGrp;
		this.topId = topId;
		this.adjStat = adjStat;
		this.adjStatRemarks = adjStatRemarks;
		this.premiumRateChged = premiumRateChged;
		this.premiumChged = premiumChged;
		this.risktypeChged = risktypeChged;
		this.txnNum = txnNum;
		this.shpmntAmdmntFlag = shpmntAmdmntFlag;
		this.userIp = userIp;
		this.adjustedBy = adjustedBy;
		this.adjustedDt = adjustedDt;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDt = lastUpdatedDt;
	}
	public Long getShpmntSeqId() {
		return shpmntSeqId;
	}
	public void setShpmntSeqId(Long shpmntSeqId) {
		this.shpmntSeqId = shpmntSeqId;
	}
	public Long getAmndSeqId() {
		return amndSeqId;
	}
	public void setAmndSeqId(Long amndSeqId) {
		this.amndSeqId = amndSeqId;
	}
	public Double getPreviousAdjAmt() {
		return previousAdjAmt;
	}
	public void setPreviousAdjAmt(Double previousAdjAmt) {
		this.previousAdjAmt = previousAdjAmt;
	}
	public Double getPremiumRateChgble() {
		return premiumRateChgble;
	}
	public void setPremiumRateChgble(Double premiumRateChgble) {
		this.premiumRateChgble = premiumRateChgble;
	}
	public Double getPremiumChgble() {
		return premiumChgble;
	}
	public void setPremiumChgble(Double premiumChgble) {
		this.premiumChgble = premiumChgble;
	}
	public String getRisktypeChgble() {
		return risktypeChgble;
	}
	public void setRisktypeChgble(String risktypeChgble) {
		this.risktypeChgble = risktypeChgble;
	}
	public String getCntyGrp() {
		return cntyGrp;
	}
	public void setCntyGrp(String cntyGrp) {
		this.cntyGrp = cntyGrp;
	}
	public String getTopId() {
		return topId;
	}
	public void setTopId(String topId) {
		this.topId = topId;
	}
	public String getAdjStat() {
		return adjStat;
	}
	public void setAdjStat(String adjStat) {
		this.adjStat = adjStat;
	}
	public String getAdjStatRemarks() {
		return adjStatRemarks;
	}
	public void setAdjStatRemarks(String adjStatRemarks) {
		this.adjStatRemarks = adjStatRemarks;
	}
	public Double getPremiumRateChged() {
		return premiumRateChged;
	}
	public void setPremiumRateChged(Double premiumRateChged) {
		this.premiumRateChged = premiumRateChged;
	}
	public Double getPremiumChged() {
		return premiumChged;
	}
	public void setPremiumChged(Double premiumChged) {
		this.premiumChged = premiumChged;
	}
	public String getRisktypeChged() {
		return risktypeChged;
	}
	public void setRisktypeChged(String risktypeChged) {
		this.risktypeChged = risktypeChged;
	}
	public String getTxnNum() {
		return txnNum;
	}
	public void setTxnNum(String txnNum) {
		this.txnNum = txnNum;
	}
	public Boolean getShpmntAmdmntFlag() {
		return shpmntAmdmntFlag;
	}
	public void setShpmntAmdmntFlag(Boolean shpmntAmdmntFlag) {
		this.shpmntAmdmntFlag = shpmntAmdmntFlag;
	}
	public String getUserIp() {
		return userIp;
	}
	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}
	public String getAdjustedBy() {
		return adjustedBy;
	}
	public void setAdjustedBy(String adjustedBy) {
		this.adjustedBy = adjustedBy;
	}
	public Timestamp getAdjustedDt() {
		return adjustedDt;
	}
	public void setAdjustedDt(Timestamp adjustedDt) {
		this.adjustedDt = adjustedDt;
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
	@Override
	public String toString() {
		return "EcgcPolShdAmndAdj [shpmntSeqId=" + shpmntSeqId + ", amndSeqId=" + amndSeqId + ", previousAdjAmt="
				+ previousAdjAmt + ", premiumRateChgble=" + premiumRateChgble + ", premiumChgble=" + premiumChgble
				+ ", risktypeChgble=" + risktypeChgble + ", cntyGrp=" + cntyGrp + ", topId=" + topId + ", adjStat="
				+ adjStat + ", adjStatRemarks=" + adjStatRemarks + ", premiumRateChged=" + premiumRateChged
				+ ", premiumChged=" + premiumChged + ", risktypeChged=" + risktypeChged + ", txnNum=" + txnNum
				+ ", shpmntAmdmntFlag=" + shpmntAmdmntFlag + ", userIp=" + userIp + ", adjustedBy=" + adjustedBy
				+ ", adjustedDt=" + adjustedDt + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDt=" + lastUpdatedDt
				+ "]";
	}
	
	
}
