package cat.mdz.demopay;

import org.springframework.boot.SpringApplication;

public class TestDemopayApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemopayApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
