package cd.presenceless.Identitysearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IdentitySearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdentitySearchServiceApplication.class, args);
	}

}
