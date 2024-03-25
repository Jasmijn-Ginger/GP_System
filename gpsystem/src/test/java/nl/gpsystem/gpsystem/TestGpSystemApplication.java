package nl.gpsystem.gpsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestGpSystemApplication {

	public static void main(String[] args) {
		SpringApplication.from(GpSystemApplication::main).with(TestGpSystemApplication.class).run(args);
	}

}
