package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.sql.Timestamp;

public class SdeclAmndScrSepEtpSspBwpAdjScrutiny {
	private int polNum;
	private int declId;
	private int shipmentId;
	private int shipmentAmndCounter;
	private String riskTypeCoverAdj;
	private Boolean ShipmentOverdueFlag;
	private Boolean LcCoverTakenFlag;
	private String clStat;
	private Boolean ClTakenBeforeOverdueFlag;
	private String clRefNum;
	private Boolean MerchantTradeTakenFlag;
	private Boolean ByrCountryRccFlag;
	private Boolean SaaTakenFlag;
	private String saaRefNum;
	private Boolean CrossCountryFlag;
	private Boolean ByrInBsalFlag;
	private Boolean ShipmentAdjustableFlag;
	private Double premiumRate;
	private Double totalAmountInrTobeAdj;
	private Boolean PremiumAvailableBeforeOverdueFlag;
	private Double amountDiffTobeAdj;
	private Boolean ShipmentAdjustedFlag;
	private Double totalInrPremiumAdjusted;
	private String adjustedBy;
	private Timestamp adjustedTimestamp;
	private String remarks;
	private char status;
	private String createdBy;
	private Timestamp createdDate;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;
	private String metaRemarks;
	private int versionNo;
}
