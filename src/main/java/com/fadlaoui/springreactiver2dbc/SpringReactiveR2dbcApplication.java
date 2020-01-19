package com.fadlaoui.springreactiver2dbc;

import com.fadlaoui.springreactiver2dbc.domain.Person;
import com.fadlaoui.springreactiver2dbc.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactiveR2dbcApplication  implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringReactiveR2dbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Person person = new Person(1L,"Mohamed","Fadlaui");
		this.personRepository.save(person);
	}
}
