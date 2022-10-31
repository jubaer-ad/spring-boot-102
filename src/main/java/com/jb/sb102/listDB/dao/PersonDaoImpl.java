package com.jb.sb102.listDB.dao;

import com.jb.sb102.listDB.model.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository(value = "personRepo")
@Primary
public class PersonDaoImpl implements PersonDao{
    private static List<Person> personList = new ArrayList<>();

    @Override
    public int addPerson(UUID uuid, Person person) {
        personList.add(new Person(uuid, person.getNameTest()));
        return 1;
    }

    @Override
    public List<Person> getPersons() {
        return personList;
    }

    @Override
    public Optional<Person> getPerson(UUID uuid) {
        return personList.stream()
                .filter(p -> p.getIdTest().equals(uuid))
                .findFirst();
    }

    @Override
    public Person deletePerson(UUID uuid) {
        Person deletedPerson = getPerson(uuid).orElse(null);
        personList.remove(deletedPerson);
        return deletedPerson;
    }

    @Override
    public Person updatePerson(Person person) {
        Person updatedPerson = getPerson(person.getIdTest()).orElse(null);
        if(updatedPerson != null) {
            int indexOfPerson = personList.indexOf(updatedPerson);
            updatedPerson.setNameTest(person.getNameTest());
            personList.set(indexOfPerson, updatedPerson);
        }
        return updatedPerson;
    }


}
