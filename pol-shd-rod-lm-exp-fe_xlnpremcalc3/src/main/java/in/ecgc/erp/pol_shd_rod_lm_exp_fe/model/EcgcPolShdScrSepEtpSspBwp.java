package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;
import java.util.Date;

public class EcgcPolShdScrSepEtpSspBwp {
	private Long shpmntSeqId;
	private Long declId;
	private Integer shpmntSrNum;
    private Integer polNo;
	private Integer year;
	private Integer month;
	private Integer day;
	private Integer invoiceNo;
	private String commodity;
	private String country;
	private String buyerCode;
	private String buyerName;
	private String buyerAddress;
	private String buyerStreet;
	private String buyerCity;
	private String buyerState;
	private String buyerCountry;
	private String buyerPostal;
	private String paymentCountry;
	private String sourceCountry;
	private String destCountry;
	private Double givInr;
	private String top; 
	private Double premiumRate;
	private Double premiumAmt;
	private String dueDate;
	private String dateOfRealization;
	private String lcCode;
	private String bankName;
	private String bankAddress;
	private String bankStreet;
	private String bankCity;
	private String bankState;
	private String bankCountry;
	private String bankPostal;
	private String errorCode;
	private boolean duplicateFlag;
	private Boolean chklstFlag;
	private String adjStat;
	private Boolean delFlag;
	private String createdBy;
	private Timestamp createdDt;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDt;
	public EcgcPolShdScrSepEtpSspBwp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EcgcPolShdScrSepEtpSspBwp(Long shpmntSeqId, Long declId, Integer shpmntSrNum, Integer polNo, Integer year,
			Integer month, Integer day, Integer invoiceNo, String commodity, String country, String buyerCode,
			String buyerName, String buyerAddress, String buyerStreet, String buyerCity, String buyerState,
			String buyerCountry, String buyerPostal, String paymentCountry, String sourceCountry, String destCountry,
			Double givInr, String top, Double premiumRate, Double premiumAmt, String dueDate, String dateOfRealization,
			String lcCode, String bankName, String bankAddress, String bankStreet, String bankCity, String bankState,
			String bankCountry, String bankPostal, String errorCode, boolean duplicateFlag, Boolean chklstFlag,
			String adjStat, Boolean delFlag, String createdBy, Timestamp createdDt, String lastUpdatedBy,
			Timestamp lastUpdatedDt) {
		super();
		this.shpmntSeqId = shpmntSeqId;
		this.declId = declId;
		this.shpmntSrNum = shpmntSrNum;
		this.polNo = polNo;
		this.year = year;
		this.month = month;
		this.day = day;
		this.invoiceNo = invoiceNo;
		this.commodity = commodity;
		this.country = country;
		this.buyerCode = buyerCode;
		this.buyerName = buyerName;
		this.buyerAddress = buyerAddress;
		this.buyerStreet = buyerStreet;
		this.buyerCity = buyerCity;
		this.buyerState = buyerState;
		this.buyerCountry = buyerCountry;
		this.buyerPostal = buyerPostal;
		this.paymentCountry = paymentCountry;
		this.sourceCountry = sourceCountry;
		this.destCountry = destCountry;
		this.givInr = givInr;
		this.top = top;
		this.premiumRate = premiumRate;
		this.premiumAmt = premiumAmt;
		this.dueDate = dueDate;
		this.dateOfRealization = dateOfRealization;
		this.lcCode = lcCode;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
		this.bankStreet = bankStreet;
		this.bankCity = bankCity;
		this.bankState = bankState;
		this.bankCountry = bankCountry;
		this.bankPostal = bankPostal;
		this.errorCode = errorCode;
		this.duplicateFlag = duplicateFlag;
		this.chklstFlag = chklstFlag;
		this.adjStat = adjStat;
		this.delFlag = delFlag;
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
	public Long getDeclId() {
		return declId;
	}
	public void setDeclId(Long declId) {
		this.declId = declId;
	}
	public Integer getShpmntSrNum() {
		return shpmntSrNum;
	}
	public void setShpmntSrNum(Integer shpmntSrNum) {
		this.shpmntSrNum = shpmntSrNum;
	}
	public Integer getPolNo() {
		return polNo;
	}
	public void setPolNo(Integer polNo) {
		this.polNo = polNo;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getMonth() {
		return month;
	}
	public void setMonth(Integer month) {
		this.month = month;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public Integer getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(Integer invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getCommodity() {
		return commodity;
	}
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getBuyerCode() {
		return buyerCode;
	}
	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerAddress() {
		return buyerAddress;
	}
	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}
	public String getBuyerStreet() {
		return buyerStreet;
	}
	public void setBuyerStreet(String buyerStreet) {
		this.buyerStreet = buyerStreet;
	}
	public String getBuyerCity() {
		return buyerCity;
	}
	public void setBuyerCity(String buyerCity) {
		this.buyerCity = buyerCity;
	}
	public String getBuyerState() {
		return buyerState;
	}
	public void setBuyerState(String buyerState) {
		this.buyerState = buyerState;
	}
	public String getBuyerCountry() {
		return buyerCountry;
	}
	public void setBuyerCountry(String buyerCountry) {
		this.buyerCountry = buyerCountry;
	}
	public String getBuyerPostal() {
		return buyerPostal;
	}
	public void setBuyerPostal(String buyerPostal) {
		this.buyerPostal = buyerPostal;
	}
	public String getPaymentCountry() {
		return paymentCountry;
	}
	public void setPaymentCountry(String paymentCountry) {
		this.paymentCountry = paymentCountry;
	}
	public String getSourceCountry() {
		return sourceCountry;
	}
	public void setSourceCountry(String sourceCountry) {
		this.sourceCountry = sourceCountry;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public Double getGivInr() {
		return givInr;
	}
	public void setGivInr(Double givInr) {
		this.givInr = givInr;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
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
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getDateOfRealization() {
		return dateOfRealization;
	}
	public void setDateOfRealization(String dateOfRealization) {
		this.dateOfRealization = dateOfRealization;
	}
	public String getLcCode() {
		return lcCode;
	}
	public void setLcCode(String lcCode) {
		this.lcCode = lcCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getBankStreet() {
		return bankStreet;
	}
	public void setBankStreet(String bankStreet) {
		this.bankStreet = bankStreet;
	}
	public String getBankCity() {
		return bankCity;
	}
	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}
	public String getBankState() {
		return bankState;
	}
	public void setBankState(String bankState) {
		this.bankState = bankState;
	}
	public String getBankCountry() {
		return bankCountry;
	}
	public void setBankCountry(String bankCountry) {
		this.bankCountry = bankCountry;
	}
	public String getBankPostal() {
		return bankPostal;
	}
	public void setBankPostal(String bankPostal) {
		this.bankPostal = bankPostal;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public boolean isDuplicateFlag() {
		return duplicateFlag;
	}
	public void setDuplicateFlag(boolean duplicateFlag) {
		this.duplicateFlag = duplicateFlag;
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
		return "EcgcPolShdScrSepEtpSspBwp [shpmntSeqId=" + shpmntSeqId + ", declId=" + declId + ", shpmntSrNum="
				+ shpmntSrNum + ", polNo=" + polNo + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", invoiceNo=" + invoiceNo + ", commodity=" + commodity + ", country=" + country + ", buyerCode="
				+ buyerCode + ", buyerName=" + buyerName + ", buyerAddress=" + buyerAddress + ", buyerStreet="
				+ buyerStreet + ", buyerCity=" + buyerCity + ", buyerState=" + buyerState + ", buyerCountry="
				+ buyerCountry + ", buyerPostal=" + buyerPostal + ", paymentCountry=" + paymentCountry
				+ ", sourceCountry=" + sourceCountry + ", destCountry=" + destCountry + ", givInr=" + givInr + ", top="
				+ top + ", premiumRate=" + premiumRate + ", premiumAmt=" + premiumAmt + ", dueDate=" + dueDate
				+ ", dateOfRealization=" + dateOfRealization + ", lcCode=" + lcCode + ", bankName=" + bankName
				+ ", bankAddress=" + bankAddress + ", bankStreet=" + bankStreet + ", bankCity=" + bankCity
				+ ", bankState=" + bankState + ", bankCountry=" + bankCountry + ", bankPostal=" + bankPostal
				+ ", errorCode=" + errorCode + ", duplicateFlag=" + duplicateFlag + ", chklstFlag=" + chklstFlag
				+ ", adjStat=" + adjStat + ", delFlag=" + delFlag + ", createdBy=" + createdBy + ", createdDt="
				+ createdDt + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDt=" + lastUpdatedDt + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adjStat == null) ? 0 : adjStat.hashCode());
		result = prime * result + ((bankAddress == null) ? 0 : bankAddress.hashCode());
		result = prime * result + ((bankCity == null) ? 0 : bankCity.hashCode());
		result = prime * result + ((bankCountry == null) ? 0 : bankCountry.hashCode());
		result = prime * result + ((bankName == null) ? 0 : bankName.hashCode());
		result = prime * result + ((bankPostal == null) ? 0 : bankPostal.hashCode());
		result = prime * result + ((bankState == null) ? 0 : bankState.hashCode());
		result = prime * result + ((bankStreet == null) ? 0 : bankStreet.hashCode());
		result = prime * result + ((buyerAddress == null) ? 0 : buyerAddress.hashCode());
		result = prime * result + ((buyerCity == null) ? 0 : buyerCity.hashCode());
		result = prime * result + ((buyerCode == null) ? 0 : buyerCode.hashCode());
		result = prime * result + ((buyerCountry == null) ? 0 : buyerCountry.hashCode());
		result = prime * result + ((buyerName == null) ? 0 : buyerName.hashCode());
		result = prime * result + ((buyerPostal == null) ? 0 : buyerPostal.hashCode());
		result = prime * result + ((buyerState == null) ? 0 : buyerState.hashCode());
		result = prime * result + ((buyerStreet == null) ? 0 : buyerStreet.hashCode());
		result = prime * result + ((chklstFlag == null) ? 0 : chklstFlag.hashCode());
		result = prime * result + ((commodity == null) ? 0 : commodity.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((createdDt == null) ? 0 : createdDt.hashCode());
		result = prime * result + ((dateOfRealization == null) ? 0 : dateOfRealization.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((declId == null) ? 0 : declId.hashCode());
		result = prime * result + ((delFlag == null) ? 0 : delFlag.hashCode());
		result = prime * result + ((destCountry == null) ? 0 : destCountry.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + (duplicateFlag ? 1231 : 1237);
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		result = prime * result + ((givInr == null) ? 0 : givInr.hashCode());
		result = prime * result + ((invoiceNo == null) ? 0 : invoiceNo.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedDt == null) ? 0 : lastUpdatedDt.hashCode());
		result = prime * result + ((lcCode == null) ? 0 : lcCode.hashCode());
		result = prime * result + ((month == null) ? 0 : month.hashCode());
		result = prime * result + ((paymentCountry == null) ? 0 : paymentCountry.hashCode());
		result = prime * result + ((polNo == null) ? 0 : polNo.hashCode());
		result = prime * result + ((premiumAmt == null) ? 0 : premiumAmt.hashCode());
		result = prime * result + ((premiumRate == null) ? 0 : premiumRate.hashCode());
		result = prime * result + ((shpmntSeqId == null) ? 0 : shpmntSeqId.hashCode());
		result = prime * result + ((shpmntSrNum == null) ? 0 : shpmntSrNum.hashCode());
		result = prime * result + ((sourceCountry == null) ? 0 : sourceCountry.hashCode());
		result = prime * result + ((top == null) ? 0 : top.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EcgcPolShdScrSepEtpSspBwp other = (EcgcPolShdScrSepEtpSspBwp) obj;
		if (adjStat == null) {
			if (other.adjStat != null)
				return false;
		} else if (!adjStat.equals(other.adjStat))
			return false;
		if (bankAddress == null) {
			if (other.bankAddress != null)
				return false;
		} else if (!bankAddress.equals(other.bankAddress))
			return false;
		if (bankCity == null) {
			if (other.bankCity != null)
				return false;
		} else if (!bankCity.equals(other.bankCity))
			return false;
		if (bankCountry == null) {
			if (other.bankCountry != null)
				return false;
		} else if (!bankCountry.equals(other.bankCountry))
			return false;
		if (bankName == null) {
			if (other.bankName != null)
				return false;
		} else if (!bankName.equals(other.bankName))
			return false;
		if (bankPostal == null) {
			if (other.bankPostal != null)
				return false;
		} else if (!bankPostal.equals(other.bankPostal))
			return false;
		if (bankState == null) {
			if (other.bankState != null)
				return false;
		} else if (!bankState.equals(other.bankState))
			return false;
		if (bankStreet == null) {
			if (other.bankStreet != null)
				return false;
		} else if (!bankStreet.equals(other.bankStreet))
			return false;
		if (buyerAddress == null) {
			if (other.buyerAddress != null)
				return false;
		} else if (!buyerAddress.equals(other.buyerAddress))
			return false;
		if (buyerCity == null) {
			if (other.buyerCity != null)
				return false;
		} else if (!buyerCity.equals(other.buyerCity))
			return false;
		if (buyerCode == null) {
			if (other.buyerCode != null)
				return false;
		} else if (!buyerCode.equals(other.buyerCode))
			return false;
		if (buyerCountry == null) {
			if (other.buyerCountry != null)
				return false;
		} else if (!buyerCountry.equals(other.buyerCountry))
			return false;
		if (buyerName == null) {
			if (other.buyerName != null)
				return false;
		} else if (!buyerName.equals(other.buyerName))
			return false;
		if (buyerPostal == null) {
			if (other.buyerPostal != null)
				return false;
		} else if (!buyerPostal.equals(other.buyerPostal))
			return false;
		if (buyerState == null) {
			if (other.buyerState != null)
				return false;
		} else if (!buyerState.equals(other.buyerState))
			return false;
		if (buyerStreet == null) {
			if (other.buyerStreet != null)
				return false;
		} else if (!buyerStreet.equals(other.buyerStreet))
			return false;
		if (chklstFlag == null) {
			if (other.chklstFlag != null)
				return false;
		} else if (!chklstFlag.equals(other.chklstFlag))
			return false;
		if (commodity == null) {
			if (other.commodity != null)
				return false;
		} else if (!commodity.equals(other.commodity))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (createdDt == null) {
			if (other.createdDt != null)
				return false;
		} else if (!createdDt.equals(other.createdDt))
			return false;
		if (dateOfRealization == null) {
			if (other.dateOfRealization != null)
				return false;
		} else if (!dateOfRealization.equals(other.dateOfRealization))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (declId == null) {
			if (other.declId != null)
				return false;
		} else if (!declId.equals(other.declId))
			return false;
		if (delFlag == null) {
			if (other.delFlag != null)
				return false;
		} else if (!delFlag.equals(other.delFlag))
			return false;
		if (destCountry == null) {
			if (other.destCountry != null)
				return false;
		} else if (!destCountry.equals(other.destCountry))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (duplicateFlag != other.duplicateFlag)
			return false;
		if (errorCode == null) {
			if (other.errorCode != null)
				return false;
		} else if (!errorCode.equals(other.errorCode))
			return false;
		if (givInr == null) {
			if (other.givInr != null)
				return false;
		} else if (!givInr.equals(other.givInr))
			return false;
		if (invoiceNo == null) {
			if (other.invoiceNo != null)
				return false;
		} else if (!invoiceNo.equals(other.invoiceNo))
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
			return false;
		if (lastUpdatedDt == null) {
			if (other.lastUpdatedDt != null)
				return false;
		} else if (!lastUpdatedDt.equals(other.lastUpdatedDt))
			return false;
		if (lcCode == null) {
			if (other.lcCode != null)
				return false;
		} else if (!lcCode.equals(other.lcCode))
			return false;
		if (month == null) {
			if (other.month != null)
				return false;
		} else if (!month.equals(other.month))
			return false;
		if (paymentCountry == null) {
			if (other.paymentCountry != null)
				return false;
		} else if (!paymentCountry.equals(other.paymentCountry))
			return false;
		if (polNo == null) {
			if (other.polNo != null)
				return false;
		} else if (!polNo.equals(other.polNo))
			return false;
		if (premiumAmt == null) {
			if (other.premiumAmt != null)
				return false;
		} else if (!premiumAmt.equals(other.premiumAmt))
			return false;
		if (premiumRate == null) {
			if (other.premiumRate != null)
				return false;
		} else if (!premiumRate.equals(other.premiumRate))
			return false;
		if (shpmntSeqId == null) {
			if (other.shpmntSeqId != null)
				return false;
		} else if (!shpmntSeqId.equals(other.shpmntSeqId))
			return false;
		if (shpmntSrNum == null) {
			if (other.shpmntSrNum != null)
				return false;
		} else if (!shpmntSrNum.equals(other.shpmntSrNum))
			return false;
		if (sourceCountry == null) {
			if (other.sourceCountry != null)
				return false;
		} else if (!sourceCountry.equals(other.sourceCountry))
			return false;
		if (top == null) {
			if (other.top != null)
				return false;
		} else if (!top.equals(other.top))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
				
	
	
	
}
