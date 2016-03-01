package com.mdp.bank;

import com.mdp.bank.model.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MdpBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MdpBankApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(final CustomerRepository customerRepository) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Customer customer1 = new Customer();
				customer1.setEmail("rastadrian@gmail.com");
				customer1.setName("Adrian");
				customer1.setLastName("Pena");

				customer1 = customerRepository.save(customer1);
				System.out.println("This is the saved customer1 id: " + customer1.getId());

				Customer customer2 = new Customer();
				customer2.setEmail("anvitha@gmail.com");
				customer2.setName("Anvitha");
				customer2.setLastName("Paruchuri");

				customer2 = customerRepository.save(customer2);
				System.out.println("This is the saved customer1 id: " + customer2.getId());

			}
		};
	}
}
