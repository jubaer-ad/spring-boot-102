package com.jb.sb102.listDB.service;

import com.jb.sb102.listDB.dao.PersonDao;
import com.jb.sb102.listDB.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier(value = "personRepo") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        personDao.addPerson(person);
        return 1;
    }

    public List<Person> getPersons() {
        return personDao.getPersons();
    }

    public Optional<Person> getPerson(UUID uuid) {
        return personDao.getPerson(uuid);
    }

    public Person deletePerson(UUID uuid) {
        return personDao.deletePerson(uuid);
    }

    public Person updatePerson(Person person) {
        return personDao.updatePerson(person);
    }
}
