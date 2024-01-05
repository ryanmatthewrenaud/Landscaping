package com.allskill.contact.location;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Address {
    // Instance variables for address [int:houseNumber, String:appartment
    // String:streetName,
    // String:city, String:state, int:zipCode]

    private int houseNumber;
    private String streetName;
    private String city;
    private String state;
    private int zipCode;
    private String locationType;

    public Address(int houseNumber, String streetName, String city, String state, int zipCode, String locationType) {
        super();
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.locationType = locationType;
    }

    //setters
    public void setHouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setState(String state){
        this.state = state;
    }

    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }

    public void setLocationType(String locationType){
        this.locationType = locationType;
    }

    //getters
    public int getHouseNumber(){
        return houseNumber;
    }

    public String getStreetName(){
        return streetName;
    }

    public String getCity(){
        return city;
    }

    public String getState(){
        return state;
    }

    public int getZipCode(){
        return zipCode;
    }

    public String getLocationType(){
        return locationType;
    }

    //toString
    @Override
    public String toString(){
        String str = "Address - " + houseNumber + " " + streetName + " " + city + " " + state + " , " + zipCode + " : Location Type - " + locationType;  
        return str;
        
    }


}
