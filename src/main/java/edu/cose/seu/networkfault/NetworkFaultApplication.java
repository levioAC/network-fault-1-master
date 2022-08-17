package edu.cose.seu.networkfault;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.cose.seu.networkfault.mapper")
public class NetworkFaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetworkFaultApplication.class, args);
	}

}
