package com.fadlaoui.springreactiver2dbc.repositories;

import com.fadlaoui.springreactiver2dbc.domain.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PersonRepository extends ReactiveCrudRepository<Person,Long> {
}
