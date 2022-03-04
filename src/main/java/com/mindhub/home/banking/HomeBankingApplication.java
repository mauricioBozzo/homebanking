package com.mindhub.home.banking;

import com.mindhub.home.banking.models.Account;
import com.mindhub.home.banking.models.Client;
import com.mindhub.home.banking.repositories.AccountRepository;
import com.mindhub.home.banking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class HomeBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeBankingApplication.class, args);
	}
	@Bean
	CommandLineRunner initData(ClientRepository clientRepository, AccountRepository accountRepository) {
		return (args) ->{
			Client cliente1 = new Client("Melba","Morel","melba@mindhub.com");
			clientRepository.save(cliente1);
			Client cliente2 = new Client("Esteban","Aguirre","eaguirre@hotmail.com");
			clientRepository.save(cliente2);
			Client cliente3 = new Client("Ana","Duarte","ana.duarte@empresa.cl");
			clientRepository.save(cliente3);

			Account account1 = new Account("VIN001", LocalDateTime.now(),5000.0,cliente1);
			accountRepository.save(account1);
			Account account2 = new Account("VIN002", LocalDateTime.now().plusDays(1),7500.0,cliente1);
			accountRepository.save(account2);
			Account account3 = new Account("VIN003", LocalDateTime.now().plusDays(2),15000.0,cliente2);
			accountRepository.save(account3);
			Account account4 = new Account("VIN004", LocalDateTime.now().plusDays(3),27500.0,cliente3);
			accountRepository.save(account4);
		};
	}

}
