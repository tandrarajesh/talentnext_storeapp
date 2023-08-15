package com.mphasis;

import com.mphasis.domain.Product;
import com.mphasis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StoreappApplication  implements CommandLineRunner {
	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(StoreappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		productRepository.save(new Product(null, "TV", "LG", 74343.0));
		productRepository.save(new Product(null, "Monitor", "Dell", 24343.0));
		productRepository.save(new Product(null, "EarBuds2", "Samsung", 44343.0));
		productRepository.save(new Product(null, "TV", "OnePlus11R", 44343.0));
		productRepository.save(new Product(null, "Speakers", "JBL", 14343.0));
		productRepository.save(new Product(null, "Bar Speakers", "LG", 74343.0));

	}
}