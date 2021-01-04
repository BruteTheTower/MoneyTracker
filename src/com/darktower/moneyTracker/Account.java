package com.darktower.moneyTracker;

public class Account {

    private Person person;

    public Account(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
