package com.jb.sb102.listDB.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    @JsonProperty("idd")
    private UUID idTest;

    @JsonProperty("namee")
    private String nameTest;

    public Person( UUID id,
                  String name) {
        this.idTest = id;
        this.nameTest = name;
    }

    public Person() {
    }

    public void setIdTest(UUID idTest) {
        this.idTest = idTest;
    }

    public void setNameTest(String nameTest) {
        this.nameTest = nameTest;
    }

    public UUID getIdTest() {
        return idTest;
    }

    public String getNameTest() {
        return nameTest;
    }
}
