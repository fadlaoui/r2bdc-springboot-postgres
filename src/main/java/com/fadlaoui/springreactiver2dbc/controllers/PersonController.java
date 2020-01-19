package com.fadlaoui.springreactiver2dbc.controllers;

import com.fadlaoui.springreactiver2dbc.domain.Person;
import com.fadlaoui.springreactiver2dbc.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository repository;

    @GetMapping("findAll")
    public Flux<Person> findAll() {
        return repository.findAll();
    }

    // Get Mapping used instead of POST Juust for testiing :D
    @GetMapping("save/{firstname}/{lastname}")
    public Mono<Person> save(@NotNull @PathVariable("firstname") String firstname , @NotNull @PathVariable("lastname") String lastname) {
        return repository.save(new Person(null,firstname ,lastname));
    }
}
