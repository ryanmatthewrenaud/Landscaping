package com.allskill.contact;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.allskill.contact.location.Address;

@Entity
public class Contact {

    // Instance variables for contact [String:firstName, String:lastName,
    // String:phoneNumber, Address:address, boolean:visited, boolean:contacted]

    private String firstName; // not modifiable only retreivable
    private String lastName; // not modifiable only retreivable
    private String primaryPhoneNumber;
    private String secondaryPhoneNumber;
    private Address address;
    private LocalDate lastVisited;
    private LocalDate lastContacted;

    public Contact(String firstName, String lastName, String primaryPhoneNumber,  String secondaryPhoneNumber, Address address, LocalDate lastVisited, LocalDate lastContacted) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.primaryPhoneNumber = primaryPhoneNumber;
        this.secondaryPhoneNumber = secondaryPhoneNumber;
        this.address = address;
        this.lastVisited = lastVisited;
        this.lastContacted = lastContacted;
    }

    // setters 
    public void setPrimaryPhoneNumber(String primaryPhoneNumber){
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber){
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public void setLastVisited(LocalDate lastVisited){
        this.lastVisited = lastVisited;
    }

    public void setLastContacted(LocalDate lastContacted){
        this.lastContacted = lastContacted;
    }

    //getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPrimaryPhoneNumber(){
        return primaryPhoneNumber;
    }

    public String getSecondaryPhoneNUmber(){
        return secondaryPhoneNumber;
    }

    public Address getAddress(){
        return address;
    }

    public LocalDate getLastVisited(){
        return lastVisited;
    }

    public LocalDate getLastContacted(){
        return lastContacted;
    }

    //toString
    @Override
    public String toString(){
        String str = "Contact - " + firstName + " " + lastName + ", primary phone: " + primaryPhoneNumber + ", secondary phone: " + secondaryPhoneNumber + " - Address -" + address + " , Last Visited: " + lastVisited + ", Last Contacted: " + lastContacted;
        return str; 
    }

}