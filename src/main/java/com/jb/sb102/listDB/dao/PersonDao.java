package com.jb.sb102.listDB.dao;

import com.jb.sb102.listDB.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int addPerson(UUID uuid, Person person);

    default int addPerson(Person person) {
        UUID uuid = UUID.randomUUID();
        return addPerson(uuid, person);
    }

    List<Person> getPersons();

    Optional<Person> getPerson(UUID uuid);

    Person deletePerson(UUID uuid);

    Person updatePerson(Person person);
}
