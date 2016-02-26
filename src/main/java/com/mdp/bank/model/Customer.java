package com.mdp.bank.model;

/**
 * Created on 2/25/16.
 *
 * @author Adrian Pena
 *
 * This is the model for the customer
 */
public class Customer {
    private long id;
    private String name;
    private String lastName;
    private String email;

    public Customer(){
    }

    public Customer(long id, String name, String lastName, String email){
        this.id = id;
        this.name = name;
        this .lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
