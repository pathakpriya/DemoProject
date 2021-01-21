package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;

public class EcgcPolShdAmndSctyChklst {

	private Long shpmntSeqId;
	private Long amndSeqId;
	private Boolean shpmntCoveredFlag;
	private Boolean shpmntOverdueFlag;
	private Boolean lcReqFlag;
	private Boolean lcTakenFlag;
	private String claStat;
	private String claNum;
	private Boolean mtradeReqFlag;
	private Boolean mtradeTakenFlag;
	private Boolean byrCntyRccFlag;
	private Boolean saaTakenFlag;
	private String saaClaNum;
	private String cntyGrp;
	private String topId;
	private Boolean crossCntyFlag;
	private Boolean byrBsalFlag;
	private String byrBsalReason;
	private Boolean byrAssociateFlag;
	private String risktypeChgble;
	private Double premiumRateChgble;
	private Double premiumChgble;
	private Double previousAdjAmt;
	private Double adjDiff;
	private Boolean premAvailFalg;
	//new fields added
	private Boolean shpmntDeclAfterOdFlag;
	private Boolean givGtClaFlag;
	private Boolean givGtMlFlag;
	private Boolean lmtDponlyFlag;
	private Boolean cntyExclFlag;
	private Boolean cntygrpExclFlag;
	private Boolean cmdtyExclFlag;
	private Boolean byrAssociateEndoFlag;
	
	private String createdBy;
	private Timestamp createdDt;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDt;
	public EcgcPolShdAmndSctyChklst() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcPolShdAmndSctyChklst(Long shpmntSeqId, Long amndSeqId, Boolean shpmntCoveredFlag,
			Boolean shpmntOverdueFlag, Boolean lcReqFlag, Boolean lcTakenFlag, String claStat, String claNum,
			Boolean mtradeReqFlag, Boolean mtradeTakenFlag, Boolean byrCntyRccFlag, Boolean saaTakenFlag,
			String saaClaNum, String cntyGrp, String topId, Boolean crossCntyFlag, Boolean byrBsalFlag,
			String byrBsalReason, Boolean byrAssociateFlag, String risktypeChgble, Double premiumRateChgble,
			Double premiumChgble, Double previousAdjAmt, Double adjDiff, Boolean premAvailFalg,
			Boolean shpmntDeclAfterOdFlag, Boolean givGtClaFlag, Boolean givGtMlFlag, Boolean lmtDponlyFlag,
			Boolean cntyExclFlag, Boolean cntygrpExclFlag, Boolean cmdtyExclFlag, Boolean byrAssociateEndoFlag,
			String createdBy, Timestamp createdDt, String lastUpdatedBy, Timestamp lastUpdatedDt) {
		super();
		this.shpmntSeqId = shpmntSeqId;
		this.amndSeqId = amndSeqId;
		this.shpmntCoveredFlag = shpmntCoveredFlag;
		this.shpmntOverdueFlag = shpmntOverdueFlag;
		this.lcReqFlag = lcReqFlag;
		this.lcTakenFlag = lcTakenFlag;
		this.claStat = claStat;
		this.claNum = claNum;
		this.mtradeReqFlag = mtradeReqFlag;
		this.mtradeTakenFlag = mtradeTakenFlag;
		this.byrCntyRccFlag = byrCntyRccFlag;
		this.saaTakenFlag = saaTakenFlag;
		this.saaClaNum = saaClaNum;
		this.cntyGrp = cntyGrp;
		this.topId = topId;
		this.crossCntyFlag = crossCntyFlag;
		this.byrBsalFlag = byrBsalFlag;
		this.byrBsalReason = byrBsalReason;
		this.byrAssociateFlag = byrAssociateFlag;
		this.risktypeChgble = risktypeChgble;
		this.premiumRateChgble = premiumRateChgble;
		this.premiumChgble = premiumChgble;
		this.previousAdjAmt = previousAdjAmt;
		this.adjDiff = adjDiff;
		this.premAvailFalg = premAvailFalg;
		this.shpmntDeclAfterOdFlag = shpmntDeclAfterOdFlag;
		this.givGtClaFlag = givGtClaFlag;
		this.givGtMlFlag = givGtMlFlag;
		this.lmtDponlyFlag = lmtDponlyFlag;
		this.cntyExclFlag = cntyExclFlag;
		this.cntygrpExclFlag = cntygrpExclFlag;
		this.cmdtyExclFlag = cmdtyExclFlag;
		this.byrAssociateEndoFlag = byrAssociateEndoFlag;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
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
	public Boolean getShpmntCoveredFlag() {
		return shpmntCoveredFlag;
	}
	public void setShpmntCoveredFlag(Boolean shpmntCoveredFlag) {
		this.shpmntCoveredFlag = shpmntCoveredFlag;
	}
	public Boolean getShpmntOverdueFlag() {
		return shpmntOverdueFlag;
	}
	public void setShpmntOverdueFlag(Boolean shpmntOverdueFlag) {
		this.shpmntOverdueFlag = shpmntOverdueFlag;
	}
	public Boolean getLcReqFlag() {
		return lcReqFlag;
	}
	public void setLcReqFlag(Boolean lcReqFlag) {
		this.lcReqFlag = lcReqFlag;
	}
	public Boolean getLcTakenFlag() {
		return lcTakenFlag;
	}
	public void setLcTakenFlag(Boolean lcTakenFlag) {
		this.lcTakenFlag = lcTakenFlag;
	}
	public String getClaStat() {
		return claStat;
	}
	public void setClaStat(String claStat) {
		this.claStat = claStat;
	}
	public String getClaNum() {
		return claNum;
	}
	public void setClaNum(String claNum) {
		this.claNum = claNum;
	}
	public Boolean getMtradeReqFlag() {
		return mtradeReqFlag;
	}
	public void setMtradeReqFlag(Boolean mtradeReqFlag) {
		this.mtradeReqFlag = mtradeReqFlag;
	}
	public Boolean getMtradeTakenFlag() {
		return mtradeTakenFlag;
	}
	public void setMtradeTakenFlag(Boolean mtradeTakenFlag) {
		this.mtradeTakenFlag = mtradeTakenFlag;
	}
	public Boolean getByrCntyRccFlag() {
		return byrCntyRccFlag;
	}
	public void setByrCntyRccFlag(Boolean byrCntyRccFlag) {
		this.byrCntyRccFlag = byrCntyRccFlag;
	}
	public Boolean getSaaTakenFlag() {
		return saaTakenFlag;
	}
	public void setSaaTakenFlag(Boolean saaTakenFlag) {
		this.saaTakenFlag = saaTakenFlag;
	}
	public String getSaaClaNum() {
		return saaClaNum;
	}
	public void setSaaClaNum(String saaClaNum) {
		this.saaClaNum = saaClaNum;
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
	public Boolean getCrossCntyFlag() {
		return crossCntyFlag;
	}
	public void setCrossCntyFlag(Boolean crossCntyFlag) {
		this.crossCntyFlag = crossCntyFlag;
	}
	public Boolean getByrBsalFlag() {
		return byrBsalFlag;
	}
	public void setByrBsalFlag(Boolean byrBsalFlag) {
		this.byrBsalFlag = byrBsalFlag;
	}
	public String getByrBsalReason() {
		return byrBsalReason;
	}
	public void setByrBsalReason(String byrBsalReason) {
		this.byrBsalReason = byrBsalReason;
	}
	public Boolean getByrAssociateFlag() {
		return byrAssociateFlag;
	}
	public void setByrAssociateFlag(Boolean byrAssociateFlag) {
		this.byrAssociateFlag = byrAssociateFlag;
	}
	public String getRisktypeChgble() {
		return risktypeChgble;
	}
	public void setRisktypeChgble(String risktypeChgble) {
		this.risktypeChgble = risktypeChgble;
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
	public Double getPreviousAdjAmt() {
		return previousAdjAmt;
	}
	public void setPreviousAdjAmt(Double previousAdjAmt) {
		this.previousAdjAmt = previousAdjAmt;
	}
	public Double getAdjDiff() {
		return adjDiff;
	}
	public void setAdjDiff(Double adjDiff) {
		this.adjDiff = adjDiff;
	}
	public Boolean getPremAvailFalg() {
		return premAvailFalg;
	}
	public void setPremAvailFalg(Boolean premAvailFalg) {
		this.premAvailFalg = premAvailFalg;
	}
	public Boolean getShpmntDeclAfterOdFlag() {
		return shpmntDeclAfterOdFlag;
	}
	public void setShpmntDeclAfterOdFlag(Boolean shpmntDeclAfterOdFlag) {
		this.shpmntDeclAfterOdFlag = shpmntDeclAfterOdFlag;
	}
	public Boolean getGivGtClaFlag() {
		return givGtClaFlag;
	}
	public void setGivGtClaFlag(Boolean givGtClaFlag) {
		this.givGtClaFlag = givGtClaFlag;
	}
	public Boolean getGivGtMlFlag() {
		return givGtMlFlag;
	}
	public void setGivGtMlFlag(Boolean givGtMlFlag) {
		this.givGtMlFlag = givGtMlFlag;
	}
	public Boolean getLmtDponlyFlag() {
		return lmtDponlyFlag;
	}
	public void setLmtDponlyFlag(Boolean lmtDponlyFlag) {
		this.lmtDponlyFlag = lmtDponlyFlag;
	}
	public Boolean getCntyExclFlag() {
		return cntyExclFlag;
	}
	public void setCntyExclFlag(Boolean cntyExclFlag) {
		this.cntyExclFlag = cntyExclFlag;
	}
	public Boolean getCntygrpExclFlag() {
		return cntygrpExclFlag;
	}
	public void setCntygrpExclFlag(Boolean cntygrpExclFlag) {
		this.cntygrpExclFlag = cntygrpExclFlag;
	}
	public Boolean getCmdtyExclFlag() {
		return cmdtyExclFlag;
	}
	public void setCmdtyExclFlag(Boolean cmdtyExclFlag) {
		this.cmdtyExclFlag = cmdtyExclFlag;
	}
	public Boolean getByrAssociateEndoFlag() {
		return byrAssociateEndoFlag;
	}
	public void setByrAssociateEndoFlag(Boolean byrAssociateEndoFlag) {
		this.byrAssociateEndoFlag = byrAssociateEndoFlag;
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
	@Override
	public String toString() {
		return "EcgcPolShdAmndSctyChklst [shpmntSeqId=" + shpmntSeqId + ", amndSeqId=" + amndSeqId
				+ ", shpmntCoveredFlag=" + shpmntCoveredFlag + ", shpmntOverdueFlag=" + shpmntOverdueFlag
				+ ", lcReqFlag=" + lcReqFlag + ", lcTakenFlag=" + lcTakenFlag + ", claStat=" + claStat + ", claNum="
				+ claNum + ", mtradeReqFlag=" + mtradeReqFlag + ", mtradeTakenFlag=" + mtradeTakenFlag
				+ ", byrCntyRccFlag=" + byrCntyRccFlag + ", saaTakenFlag=" + saaTakenFlag + ", saaClaNum=" + saaClaNum
				+ ", cntyGrp=" + cntyGrp + ", topId=" + topId + ", crossCntyFlag=" + crossCntyFlag + ", byrBsalFlag="
				+ byrBsalFlag + ", byrBsalReason=" + byrBsalReason + ", byrAssociateFlag=" + byrAssociateFlag
				+ ", risktypeChgble=" + risktypeChgble + ", premiumRateChgble=" + premiumRateChgble + ", premiumChgble="
				+ premiumChgble + ", previousAdjAmt=" + previousAdjAmt + ", adjDiff=" + adjDiff + ", premAvailFalg="
				+ premAvailFalg + ", shpmntDeclAfterOdFlag=" + shpmntDeclAfterOdFlag + ", givGtClaFlag=" + givGtClaFlag
				+ ", givGtMlFlag=" + givGtMlFlag + ", lmtDponlyFlag=" + lmtDponlyFlag + ", cntyExclFlag=" + cntyExclFlag
				+ ", cntygrpExclFlag=" + cntygrpExclFlag + ", cmdtyExclFlag=" + cmdtyExclFlag
				+ ", byrAssociateEndoFlag=" + byrAssociateEndoFlag + ", createdBy=" + createdBy + ", createdDt="
				+ createdDt + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDt=" + lastUpdatedDt + "]";
	}
		
	
}
