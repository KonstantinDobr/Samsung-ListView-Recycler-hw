package com.example.testandroid1302.domain;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private String number;
    private List<Pet> pets;

    public Person(int id, String name, String number, List<Pet> pets) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.pets = pets;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public List<Pet> getPets() {
        return pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", pets=" + pets +
                '}';
    }
}
