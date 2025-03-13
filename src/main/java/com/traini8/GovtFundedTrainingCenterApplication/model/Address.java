package com.traini8.GovtFundedTrainingCenterApplication.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    public String detailedAddress;
    public String city;
    public String state;
    public int pinCode;

    public Address(){

    }

    public Address(String detailedAddress, int pinCode, String state, String city) {
        this.detailedAddress = detailedAddress;
        this.pinCode = pinCode;
        this.state = state;
        this.city = city;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
