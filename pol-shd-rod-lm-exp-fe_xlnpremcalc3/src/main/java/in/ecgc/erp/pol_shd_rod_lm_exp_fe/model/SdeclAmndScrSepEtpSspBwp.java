package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;
import java.sql.Timestamp;

public class SdeclAmndScrSepEtpSspBwp {
	private int polNum;
	private int declId;
	private int shipmentId;
	private int shipmentAmndCounter;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date shipmentDt;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date shipmentAmndDt;
	private String grPpSbInvoiceNo ;
	private String commodityCd;
	private String sourceCountryCd;
	private String destCountryCd;
	private String byrCd;
	private String byrName;
	private String byrAddrLine;
	private String byrAddrStreet;
	private String byrAddrCity;
	private String byrAddrState;
	private String byrAddrPincode;
	private String byrCountryCd;
	private String countryFromWhichPaymentToBeRecievedCd;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dueDtOfPayment;
	//@DateTimeFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date realizationDt;
	private String lcOpeningBankName;
	private String lcOpeningBankAddrLine;
	private String lcOpeningBankAddrStreet;
	private String lcOpeningBankAddrCity;
	private String lcOpeningBankAddrState;
	private String lcOpeningBankAddrCountryCd;
	private String lcOpeningBankAddrPincode;
	private Double givInr;
	private String topId;
	private Double premiumAmt;
	private Double projectedTurnoverBalanceAfterUtilisation;
	private String changeReason;
	private String remarks;
	private List<SdeclAmndScrSepEtpSspBwpAdjScrutiny> ScrSepEtpSspBwpAdjScrutiny;
	private char status;
	private String createdBy;
	private Timestamp createdDate;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;
	private String metaRemarks;
	private int versionNo;
	public SdeclAmndScrSepEtpSspBwp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SdeclAmndScrSepEtpSspBwp(int polNum, int declId, int shipmentId, int shipmentAmndCounter, Date shipmentDt,
			Date shipmentAmndDt, String grPpSbInvoiceNo, String commodityCd, String sourceCountryCd,
			String destCountryCd, String byrCd, String byrName, String byrAddrLine, String byrAddrStreet,
			String byrAddrCity, String byrAddrState, String byrAddrPincode, String byrCountryCd,
			String countryFromWhichPaymentToBeRecievedCd, Date dueDtOfPayment, Date realizationDt,
			String lcOpeningBankName, String lcOpeningBankAddrLine, String lcOpeningBankAddrStreet,
			String lcOpeningBankAddrCity, String lcOpeningBankAddrState, String lcOpeningBankAddrCountryCd,
			String lcOpeningBankAddrPincode, Double givInr, String topId, Double premiumAmt,
			Double projectedTurnoverBalanceAfterUtilisation, String changeReason, String remarks,
			List<SdeclAmndScrSepEtpSspBwpAdjScrutiny> scrSepEtpSspBwpAdjScrutiny, char status, String createdBy,
			Timestamp createdDate, String lastUpdatedBy, Timestamp lastUpdatedDate, String metaRemarks, int versionNo) {
		super();
		this.polNum = polNum;
		this.declId = declId;
		this.shipmentId = shipmentId;
		this.shipmentAmndCounter = shipmentAmndCounter;
		this.shipmentDt = shipmentDt;
		this.shipmentAmndDt = shipmentAmndDt;
		this.grPpSbInvoiceNo = grPpSbInvoiceNo;
		this.commodityCd = commodityCd;
		this.sourceCountryCd = sourceCountryCd;
		this.destCountryCd = destCountryCd;
		this.byrCd = byrCd;
		this.byrName = byrName;
		this.byrAddrLine = byrAddrLine;
		this.byrAddrStreet = byrAddrStreet;
		this.byrAddrCity = byrAddrCity;
		this.byrAddrState = byrAddrState;
		this.byrAddrPincode = byrAddrPincode;
		this.byrCountryCd = byrCountryCd;
		this.countryFromWhichPaymentToBeRecievedCd = countryFromWhichPaymentToBeRecievedCd;
		this.dueDtOfPayment = dueDtOfPayment;
		this.realizationDt = realizationDt;
		this.lcOpeningBankName = lcOpeningBankName;
		this.lcOpeningBankAddrLine = lcOpeningBankAddrLine;
		this.lcOpeningBankAddrStreet = lcOpeningBankAddrStreet;
		this.lcOpeningBankAddrCity = lcOpeningBankAddrCity;
		this.lcOpeningBankAddrState = lcOpeningBankAddrState;
		this.lcOpeningBankAddrCountryCd = lcOpeningBankAddrCountryCd;
		this.lcOpeningBankAddrPincode = lcOpeningBankAddrPincode;
		this.givInr = givInr;
		this.topId = topId;
		this.premiumAmt = premiumAmt;
		this.projectedTurnoverBalanceAfterUtilisation = projectedTurnoverBalanceAfterUtilisation;
		this.changeReason = changeReason;
		this.remarks = remarks;
		ScrSepEtpSspBwpAdjScrutiny = scrSepEtpSspBwpAdjScrutiny;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
		this.metaRemarks = metaRemarks;
		this.versionNo = versionNo;
	}
	public int getPolNum() {
		return polNum;
	}
	public void setPolNum(int polNum) {
		this.polNum = polNum;
	}
	public int getDeclId() {
		return declId;
	}
	public void setDeclId(int declId) {
		this.declId = declId;
	}
	public int getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(int shipmentId) {
		this.shipmentId = shipmentId;
	}
	public int getShipmentAmndCounter() {
		return shipmentAmndCounter;
	}
	public void setShipmentAmndCounter(int shipmentAmndCounter) {
		this.shipmentAmndCounter = shipmentAmndCounter;
	}
	public Date getShipmentDt() {
		return shipmentDt;
	}
	public void setShipmentDt(Date shipmentDt) {
		this.shipmentDt = shipmentDt;
	}
	public Date getShipmentAmndDt() {
		return shipmentAmndDt;
	}
	public void setShipmentAmndDt(Date shipmentAmndDt) {
		this.shipmentAmndDt = shipmentAmndDt;
	}
	public String getGrPpSbInvoiceNo() {
		return grPpSbInvoiceNo;
	}
	public void setGrPpSbInvoiceNo(String grPpSbInvoiceNo) {
		this.grPpSbInvoiceNo = grPpSbInvoiceNo;
	}
	public String getCommodityCd() {
		return commodityCd;
	}
	public void setCommodityCd(String commodityCd) {
		this.commodityCd = commodityCd;
	}
	public String getSourceCountryCd() {
		return sourceCountryCd;
	}
	public void setSourceCountryCd(String sourceCountryCd) {
		this.sourceCountryCd = sourceCountryCd;
	}
	public String getDestCountryCd() {
		return destCountryCd;
	}
	public void setDestCountryCd(String destCountryCd) {
		this.destCountryCd = destCountryCd;
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
	public String getByrAddrPincode() {
		return byrAddrPincode;
	}
	public void setByrAddrPincode(String byrAddrPincode) {
		this.byrAddrPincode = byrAddrPincode;
	}
	public String getByrCountryCd() {
		return byrCountryCd;
	}
	public void setByrCountryCd(String byrCountryCd) {
		this.byrCountryCd = byrCountryCd;
	}
	public String getCountryFromWhichPaymentToBeRecievedCd() {
		return countryFromWhichPaymentToBeRecievedCd;
	}
	public void setCountryFromWhichPaymentToBeRecievedCd(String countryFromWhichPaymentToBeRecievedCd) {
		this.countryFromWhichPaymentToBeRecievedCd = countryFromWhichPaymentToBeRecievedCd;
	}
	public Date getDueDtOfPayment() {
		return dueDtOfPayment;
	}
	public void setDueDtOfPayment(Date dueDtOfPayment) {
		this.dueDtOfPayment = dueDtOfPayment;
	}
	public Date getRealizationDt() {
		return realizationDt;
	}
	public void setRealizationDt(Date realizationDt) {
		this.realizationDt = realizationDt;
	}
	public String getLcOpeningBankName() {
		return lcOpeningBankName;
	}
	public void setLcOpeningBankName(String lcOpeningBankName) {
		this.lcOpeningBankName = lcOpeningBankName;
	}
	public String getLcOpeningBankAddrLine() {
		return lcOpeningBankAddrLine;
	}
	public void setLcOpeningBankAddrLine(String lcOpeningBankAddrLine) {
		this.lcOpeningBankAddrLine = lcOpeningBankAddrLine;
	}
	public String getLcOpeningBankAddrStreet() {
		return lcOpeningBankAddrStreet;
	}
	public void setLcOpeningBankAddrStreet(String lcOpeningBankAddrStreet) {
		this.lcOpeningBankAddrStreet = lcOpeningBankAddrStreet;
	}
	public String getLcOpeningBankAddrCity() {
		return lcOpeningBankAddrCity;
	}
	public void setLcOpeningBankAddrCity(String lcOpeningBankAddrCity) {
		this.lcOpeningBankAddrCity = lcOpeningBankAddrCity;
	}
	public String getLcOpeningBankAddrState() {
		return lcOpeningBankAddrState;
	}
	public void setLcOpeningBankAddrState(String lcOpeningBankAddrState) {
		this.lcOpeningBankAddrState = lcOpeningBankAddrState;
	}
	public String getLcOpeningBankAddrCountryCd() {
		return lcOpeningBankAddrCountryCd;
	}
	public void setLcOpeningBankAddrCountryCd(String lcOpeningBankAddrCountryCd) {
		this.lcOpeningBankAddrCountryCd = lcOpeningBankAddrCountryCd;
	}
	public String getLcOpeningBankAddrPincode() {
		return lcOpeningBankAddrPincode;
	}
	public void setLcOpeningBankAddrPincode(String lcOpeningBankAddrPincode) {
		this.lcOpeningBankAddrPincode = lcOpeningBankAddrPincode;
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
	public Double getPremiumAmt() {
		return premiumAmt;
	}
	public void setPremiumAmt(Double premiumAmt) {
		this.premiumAmt = premiumAmt;
	}
	public Double getProjectedTurnoverBalanceAfterUtilisation() {
		return projectedTurnoverBalanceAfterUtilisation;
	}
	public void setProjectedTurnoverBalanceAfterUtilisation(Double projectedTurnoverBalanceAfterUtilisation) {
		this.projectedTurnoverBalanceAfterUtilisation = projectedTurnoverBalanceAfterUtilisation;
	}
	public String getChangeReason() {
		return changeReason;
	}
	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public List<SdeclAmndScrSepEtpSspBwpAdjScrutiny> getScrSepEtpSspBwpAdjScrutiny() {
		return ScrSepEtpSspBwpAdjScrutiny;
	}
	public void setScrSepEtpSspBwpAdjScrutiny(List<SdeclAmndScrSepEtpSspBwpAdjScrutiny> scrSepEtpSspBwpAdjScrutiny) {
		ScrSepEtpSspBwpAdjScrutiny = scrSepEtpSspBwpAdjScrutiny;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getMetaRemarks() {
		return metaRemarks;
	}
	public void setMetaRemarks(String metaRemarks) {
		this.metaRemarks = metaRemarks;
	}
	public int getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(int versionNo) {
		this.versionNo = versionNo;
	}
	@Override
	public String toString() {
		return "SdeclAmndScrSepEtpSspBwp [polNum=" + polNum + ", declId=" + declId + ", shipmentId=" + shipmentId
				+ ", shipmentAmndCounter=" + shipmentAmndCounter + ", shipmentDt=" + shipmentDt + ", shipmentAmndDt="
				+ shipmentAmndDt + ", grPpSbInvoiceNo=" + grPpSbInvoiceNo + ", commodityCd=" + commodityCd
				+ ", sourceCountryCd=" + sourceCountryCd + ", destCountryCd=" + destCountryCd + ", byrCd=" + byrCd
				+ ", byrName=" + byrName + ", byrAddrLine=" + byrAddrLine + ", byrAddrStreet=" + byrAddrStreet
				+ ", byrAddrCity=" + byrAddrCity + ", byrAddrState=" + byrAddrState + ", byrAddrPincode="
				+ byrAddrPincode + ", byrCountryCd=" + byrCountryCd + ", countryFromWhichPaymentToBeRecievedCd="
				+ countryFromWhichPaymentToBeRecievedCd + ", dueDtOfPayment=" + dueDtOfPayment + ", realizationDt="
				+ realizationDt + ", lcOpeningBankName=" + lcOpeningBankName + ", lcOpeningBankAddrLine="
				+ lcOpeningBankAddrLine + ", lcOpeningBankAddrStreet=" + lcOpeningBankAddrStreet
				+ ", lcOpeningBankAddrCity=" + lcOpeningBankAddrCity + ", lcOpeningBankAddrState="
				+ lcOpeningBankAddrState + ", lcOpeningBankAddrCountryCd=" + lcOpeningBankAddrCountryCd
				+ ", lcOpeningBankAddrPincode=" + lcOpeningBankAddrPincode + ", givInr=" + givInr + ", topId=" + topId
				+ ", premiumAmt=" + premiumAmt + ", projectedTurnoverBalanceAfterUtilisation="
				+ projectedTurnoverBalanceAfterUtilisation + ", changeReason=" + changeReason + ", remarks=" + remarks
				+ ", ScrSepEtpSspBwpAdjScrutiny=" + ScrSepEtpSspBwpAdjScrutiny + ", status=" + status + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate="
				+ lastUpdatedDate + ", metaRemarks=" + metaRemarks + ", versionNo=" + versionNo + "]";
	}
	
	
}
