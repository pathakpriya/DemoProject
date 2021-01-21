package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class shipmentDeclDetailsHeader {
	private Integer declId;
	private Integer polNum;
	private Timestamp shipmentDeclRecevTimestamp;
	private Integer shipmentDeclMonth;
	private Integer shipmentDeclYear;
	private String inwardNum;
	private String inwardItemNum;
	private List<SdeclAmndScrSepEtpSspBwp> ScrSepEtpSspBwpDecls;
	private char status;
	private String createdBy;
	private Timestamp createdDate;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;
	private String metaRemarks;
	private Integer versionNo;
	
	public shipmentDeclDetailsHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public shipmentDeclDetailsHeader(Integer declId, Integer polNum, Timestamp shipmentDeclRecevTimestamp,
			Integer shipmentDeclMonth, Integer shipmentDeclYear, String inwardNum, String inwardItemNum,
			List<SdeclAmndScrSepEtpSspBwp> scrSepEtpSspBwpDecls, char status, String createdBy, Timestamp createdDate,
			String lastUpdatedBy, Timestamp lastUpdatedDate, String metaRemarks, Integer versionNo) {
		super();
		this.declId = declId;
		this.polNum = polNum;
		this.shipmentDeclRecevTimestamp = shipmentDeclRecevTimestamp;
		this.shipmentDeclMonth = shipmentDeclMonth;
		this.shipmentDeclYear = shipmentDeclYear;
		this.inwardNum = inwardNum;
		this.inwardItemNum = inwardItemNum;
		ScrSepEtpSspBwpDecls = scrSepEtpSspBwpDecls;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
		this.metaRemarks = metaRemarks;
		this.versionNo = versionNo;
	}

	public Integer getDeclId() {
		return declId;
	}

	public void setDeclId(Integer declId) {
		this.declId = declId;
	}

	public Integer getPolNum() {
		return polNum;
	}

	public void setPolNum(Integer polNum) {
		this.polNum = polNum;
	}

	public Timestamp getShipmentDeclRecevTimestamp() {
		return shipmentDeclRecevTimestamp;
	}

	public void setShipmentDeclRecevTimestamp(Timestamp shipmentDeclRecevTimestamp) {
		this.shipmentDeclRecevTimestamp = shipmentDeclRecevTimestamp;
	}

	public Integer getShipmentDeclMonth() {
		return shipmentDeclMonth;
	}

	public void setShipmentDeclMonth(Integer shipmentDeclMonth) {
		this.shipmentDeclMonth = shipmentDeclMonth;
	}

	public Integer getShipmentDeclYear() {
		return shipmentDeclYear;
	}

	public void setShipmentDeclYear(Integer shipmentDeclYear) {
		this.shipmentDeclYear = shipmentDeclYear;
	}

	public String getInwardNum() {
		return inwardNum;
	}

	public void setInwardNum(String inwardNum) {
		this.inwardNum = inwardNum;
	}

	public String getInwardItemNum() {
		return inwardItemNum;
	}

	public void setInwardItemNum(String inwardItemNum) {
		this.inwardItemNum = inwardItemNum;
	}

	public List<SdeclAmndScrSepEtpSspBwp> getScrSepEtpSspBwpDecls() {
		return ScrSepEtpSspBwpDecls;
	}

	public void setScrSepEtpSspBwpDecls(List<SdeclAmndScrSepEtpSspBwp> scrSepEtpSspBwpDecls) {
		ScrSepEtpSspBwpDecls = scrSepEtpSspBwpDecls;
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

	public Integer getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(Integer versionNo) {
		this.versionNo = versionNo;
	}

	@Override
	public String toString() {
		return "shipmentDeclDetailsHeader [declId=" + declId + ", polNum=" + polNum + ", shipmentDeclRecevTimestamp="
				+ shipmentDeclRecevTimestamp + ", shipmentDeclMonth=" + shipmentDeclMonth + ", shipmentDeclYear="
				+ shipmentDeclYear + ", inwardNum=" + inwardNum + ", inwardItemNum=" + inwardItemNum
				+ ", ScrSepEtpSspBwpDecls=" + ScrSepEtpSspBwpDecls + ", status=" + status + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", lastUpdatedBy=" + lastUpdatedBy + ", lastUpdatedDate="
				+ lastUpdatedDate + ", metaRemarks=" + metaRemarks + ", versionNo=" + versionNo + "]";
	}

	
	
}
