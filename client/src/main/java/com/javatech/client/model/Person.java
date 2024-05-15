package com.javatech.client.model;

public class Person {

    String name;

    String genre;

    Integer age;

    String identification;

    String address;

    String phoneNumber;

    public Person () {}

    public Person (Person person) {
        this.name = person.getName();
        this.genre = person.getGenre();
        this.age = person.getAge();
        this.identification = person.getIdentification();
        this.address = person.getAddress();
        this.phoneNumber = person.getPhoneNumber();
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getAge() {
        return age;
    }

    public String getIdentification() {
        return identification;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
