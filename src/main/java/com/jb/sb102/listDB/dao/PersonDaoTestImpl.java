package com.jb.sb102.listDB.dao;

import com.jb.sb102.listDB.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository(value = "testrepo")
public class PersonDaoTestImpl implements PersonDao{
    @Override
    public int addPerson(UUID uuid, Person person) {
        return 0;
    }

    @Override
    public int addPerson(Person person) {
        return PersonDao.super.addPerson(person);
    }

    @Override
    public List<Person> getPersons() {
        return new ArrayList<>();
    }

    @Override
    public Optional<Person> getPerson(UUID uuid) {
        return Optional.of(null);
    }

    @Override
    public Person deletePerson(UUID uuid) {
        return null;
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }
}
