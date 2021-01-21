package in.ecgc.erp.pol_shd_rod_lm_exp_fe.model;

import java.util.List;

public class Shipments {

	private List<EcgcPolShdScrSepEtpSspBwp> list;

	public List<EcgcPolShdScrSepEtpSspBwp> getList() {
		return list;
	}

	public void setList(List<EcgcPolShdScrSepEtpSspBwp> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Shipments [list=" + list + "]";
	}
	
	
}
