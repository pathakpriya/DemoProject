package in.ecgc.erp.pol_shd_rod_lm_exp_fe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients("in.ecgc.erp.pol_shd_rod_lm_exp_fe")
public class PolShdRodLmExpFe {

	public static void main(String[] args) {
		SpringApplication.run(PolShdRodLmExpFe.class, args);
	}

}
