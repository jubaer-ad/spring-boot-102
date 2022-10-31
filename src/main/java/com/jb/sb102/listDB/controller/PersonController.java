package com.jb.sb102.listDB.controller;

import com.jb.sb102.listDB.model.Person;
import com.jb.sb102.listDB.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/listdb")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public int addPerson(@Valid @NonNull @RequestBody Person person) {
        personService.addPerson(person);
        return 1;
    }

    @GetMapping
    public List<Person> getPersons() {
        return personService.getPersons();
    }


    @GetMapping("/{uuid}")
    public Optional<Person> getPerson(@PathVariable("uuid") UUID uuid) {
        return personService.getPerson(uuid);
    }

    @DeleteMapping("/{uuid}")
    public Person deletePerson(@PathVariable("uuid") UUID uuid) {
        return personService.deletePerson(uuid);
    }

    @PutMapping
    public Person updatePerson(@Valid @NonNull @RequestBody Person person) {
        return personService.updatePerson(person);
    }
}
