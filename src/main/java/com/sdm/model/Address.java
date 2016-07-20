package com.sdm.model;


public class Address {
    private final String firstName;
    private final String lastName;

    public Address(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
