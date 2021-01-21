package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;
import java.util.Date;

public class EcgcPolShdAmndDtls {
	private Long amndSeqId;
	private Long amndId;
	private Integer amndSrNum;
	private Long shpmntSeqId;
	private Integer shpmntDay;
	private Date shpmentDt;
	private String griNum;
	private Integer commodityCd;
	private String srcCntyCd;
	private String destCntyCd;
	private String byrCd;
	private String byrName;
	private String byrAddrLine;
	private String byrAddrStreet;
	private String byrAddrCity;
	private String byrAddrState;
	private String byrAddrPcode;
	private String byrCntyCd;
	private String payCntyCd;
	private Date payDueDt;
	private Date realizationDt;
	private String lcCd;
	private String lcName;
	private String lcAddrLine;
	private String lcAddrStreet;
	private String lcAddrCity;
	private String lcAddrState;
	private String lcAddrCntyCd;
	private Double givInr;
	private String topId;
	private Double premiumRate;
	private Double premiumAmt;
	private Boolean chklstFlag;
	private String adjStat;
	private Boolean delFlag;
	private String createdBy;
	private Timestamp createdDt;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDt;
	public EcgcPolShdAmndDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcPolShdAmndDtls(Long amndSeqId, Long amndId, Integer amndSrNum, Long shpmntSeqId, Integer shpmntDay,
			Date shpmentDt, String griNum, Integer commodityCd, String srcCntyCd, String destCntyCd, String byrCd,
			String byrName, String byrAddrLine, String byrAddrStreet, String byrAddrCity, String byrAddrState,
			String byrAddrPcode, String byrCntyCd, String payCntyCd, Date payDueDt, Date realizationDt, String lcCd,
			String lcName, String lcAddrLine, String lcAddrStreet, String lcAddrCity, String lcAddrState,
			String lcAddrCntyCd, Double givInr, String topId, Double premiumRate, Double premiumAmt, Boolean chklstFlag,
			String adjStat, Boolean delFlag, String createdBy, Timestamp createdDt, String lastUpdatedBy,
			Timestamp lastUpdatedDt) {
		super();
		this.amndSeqId = amndSeqId;
		this.amndId = amndId;
		this.amndSrNum = amndSrNum;
		this.shpmntSeqId = shpmntSeqId;
		this.shpmntDay = shpmntDay;
		this.shpmentDt = shpmentDt;
		this.griNum = griNum;
		this.commodityCd = commodityCd;
		this.srcCntyCd = srcCntyCd;
		this.destCntyCd = destCntyCd;
		this.byrCd = byrCd;
		this.byrName = byrName;
		this.byrAddrLine = byrAddrLine;
		this.byrAddrStreet = byrAddrStreet;
		this.byrAddrCity = byrAddrCity;
		this.byrAddrState = byrAddrState;
		this.byrAddrPcode = byrAddrPcode;
		this.byrCntyCd = byrCntyCd;
		this.payCntyCd = payCntyCd;
		this.payDueDt = payDueDt;
		this.realizationDt = realizationDt;
		this.lcCd = lcCd;
		this.lcName = lcName;
		this.lcAddrLine = lcAddrLine;
		this.lcAddrStreet = lcAddrStreet;
		this.lcAddrCity = lcAddrCity;
		this.lcAddrState = lcAddrState;
		this.lcAddrCntyCd = lcAddrCntyCd;
		this.givInr = givInr;
		this.topId = topId;
		this.premiumRate = premiumRate;
		this.premiumAmt = premiumAmt;
		this.chklstFlag = chklstFlag;
		this.adjStat = adjStat;
		this.delFlag = delFlag;
		this.createdBy = createdBy;
		this.createdDt = createdDt;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDt = lastUpdatedDt;
	}
	public Long getAmndSeqId() {
		return amndSeqId;
	}
	public void setAmndSeqId(Long amndSeqId) {
		this.amndSeqId = amndSeqId;
	}
	public Long getAmndId() {
		return amndId;
	}
	public void setAmndId(Long amndId) {
		this.amndId = amndId;
	}
	public Integer getAmndSrNum() {
		return amndSrNum;
	}
	public void setAmndSrNum(Integer amndSrNum) {
		this.amndSrNum = amndSrNum;
	}
	public Long getShpmntSeqId() {
		return shpmntSeqId;
	}
	public void setShpmntSeqId(Long shpmntSeqId) {
		this.shpmntSeqId = shpmntSeqId;
	}
	public Integer getShpmntDay() {
		return shpmntDay;
	}
	public void setShpmntDay(Integer shpmntDay) {
		this.shpmntDay = shpmntDay;
	}
	public Date getShpmentDt() {
		return shpmentDt;
	}
	public void setShpmentDt(Date shpmentDt) {
		this.shpmentDt = shpmentDt;
	}
	public String getGriNum() {
		return griNum;
	}
	public void setGriNum(String griNum) {
		this.griNum = griNum;
	}
	public Integer getCommodityCd() {
		return commodityCd;
	}
	public void setCommodityCd(Integer commodityCd) {
		this.commodityCd = commodityCd;
	}
	public String getSrcCntyCd() {
		return srcCntyCd;
	}
	public void setSrcCntyCd(String srcCntyCd) {
		this.srcCntyCd = srcCntyCd;
	}
	public String getDestCntyCd() {
		return destCntyCd;
	}
	public void setDestCntyCd(String destCntyCd) {
		this.destCntyCd = destCntyCd;
	}
	public String getByrCd() {
		return byrCd;
	}
	public void setByrCd(String byrCd) {
		this.byrCd = byrCd;
	}
	public String getByrName() {
		return byrName;
	}
	public void setByrName(String byrName) {
		this.byrName = byrName;
	}
	public String getByrAddrLine() {
		return byrAddrLine;
	}
	public void setByrAddrLine(String byrAddrLine) {
		this.byrAddrLine = byrAddrLine;
	}
	public String getByrAddrStreet() {
		return byrAddrStreet;
	}
	public void setByrAddrStreet(String byrAddrStreet) {
		this.byrAddrStreet = byrAddrStreet;
	}
	public String getByrAddrCity() {
		return byrAddrCity;
	}
	public void setByrAddrCity(String byrAddrCity) {
		this.byrAddrCity = byrAddrCity;
	}
	public String getByrAddrState() {
		return byrAddrState;
	}
	public void setByrAddrState(String byrAddrState) {
		this.byrAddrState = byrAddrState;
	}
	public String getByrAddrPcode() {
		return byrAddrPcode;
	}
	public void setByrAddrPcode(String byrAddrPcode) {
		this.byrAddrPcode = byrAddrPcode;
	}
	public String getByrCntyCd() {
		return byrCntyCd;
	}
	public void setByrCntyCd(String byrCntyCd) {
		this.byrCntyCd = byrCntyCd;
	}
	public String getPayCntyCd() {
		return payCntyCd;
	}
	public void setPayCntyCd(String payCntyCd) {
		this.payCntyCd = payCntyCd;
	}
	public Date getPayDueDt() {
		return payDueDt;
	}
	public void setPayDueDt(Date payDueDt) {
		this.payDueDt = payDueDt;
	}
	public Date getRealizationDt() {
		return realizationDt;
	}
	public void setRealizationDt(Date realizationDt) {
		this.realizationDt = realizationDt;
	}
	public String getLcCd() {
		return lcCd;
	}
	public void setLcCd(String lcCd) {
		this.lcCd = lcCd;
	}
	public String getLcName() {
		return lcName;
	}
	public void setLcName(String lcName) {
		this.lcName = lcName;
	}
	public String getLcAddrLine() {
		return lcAddrLine;
	}
	public void setLcAddrLine(String lcAddrLine) {
		this.lcAddrLine = lcAddrLine;
	}
	public String getLcAddrStreet() {
		return lcAddrStreet;
	}
	public void setLcAddrStreet(String lcAddrStreet) {
		this.lcAddrStreet = lcAddrStreet;
	}
	public String getLcAddrCity() {
		return lcAddrCity;
	}
	public void setLcAddrCity(String lcAddrCity) {
		this.lcAddrCity = lcAddrCity;
	}
	public String getLcAddrState() {
		return lcAddrState;
	}
	public void setLcAddrState(String lcAddrState) {
		this.lcAddrState = lcAddrState;
	}
	public String getLcAddrCntyCd() {
		return lcAddrCntyCd;
	}
	public void setLcAddrCntyCd(String lcAddrCntyCd) {
		this.lcAddrCntyCd = lcAddrCntyCd;
	}
	public Double getGivInr() {
		return givInr;
	}
	public void setGivInr(Double givInr) {
		this.givInr = givInr;
	}
	public String getTopId() {
		return topId;
	}
	public void setTopId(String topId) {
		this.topId = topId;
	}
	public Double getPremiumRate() {
		return premiumRate;
	}
	public void setPremiumRate(Double premiumRate) {
		this.premiumRate = premiumRate;
	}
	public Double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	public Boolean getChklstFlag() {
		return chklstFlag;
	}
	public void setChklstFlag(Boolean chklstFlag) {
		this.chklstFlag = chklstFlag;
	}
	public String getAdjStat() {
		return adjStat;
	}
	public void setAdjStat(String adjStat) {
		this.adjStat = adjStat;
	}
	public Boolean getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(Boolean delFlag) {
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
	@Override
	public String toString() {
		return "EcgcPolShdAmndDtls [amndSeqId=" + amndSeqId + ", amndId=" + amndId + ", amndSrNum=" + amndSrNum
				+ ", shpmntSeqId=" + shpmntSeqId + ", shpmntDay=" + shpmntDay + ", shpmentDt=" + shpmentDt + ", griNum="
				+ griNum + ", commodityCd=" + commodityCd + ", srcCntyCd=" + srcCntyCd + ", destCntyCd=" + destCntyCd
				+ ", byrCd=" + byrCd + ", byrName=" + byrName + ", byrAddrLine=" + byrAddrLine + ", byrAddrStreet="
				+ byrAddrStreet + ", byrAddrCity=" + byrAddrCity + ", byrAddrState=" + byrAddrState + ", byrAddrPcode="
				+ byrAddrPcode + ", byrCntyCd=" + byrCntyCd + ", payCntyCd=" + payCntyCd + ", payDueDt=" + payDueDt
				+ ", realizationDt=" + realizationDt + ", lcCd=" + lcCd + ", lcName=" + lcName + ", lcAddrLine="
				+ lcAddrLine + ", lcAddrStreet=" + lcAddrStreet + ", lcAddrCity=" + lcAddrCity + ", lcAddrState="
				+ lcAddrState + ", lcAddrCntyCd=" + lcAddrCntyCd + ", givInr=" + givInr + ", topId=" + topId
				+ ", premiumRate=" + premiumRate + ", premiumAmt=" + premiumAmt + ", chklstFlag=" + chklstFlag
				+ ", adjStat=" + adjStat + ", delFlag=" + delFlag + ", createdBy=" + createdBy + ", createdDt="
				+ createdDt + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDt=" + lastUpdatedDt + "]";
	}
	
	
}
