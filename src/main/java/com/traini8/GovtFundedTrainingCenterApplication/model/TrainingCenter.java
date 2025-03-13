package com.traini8.GovtFundedTrainingCenterApplication.model;

import java.time.LocalDate;
import java.util.List;

public class TrainingCenter {
    private String centerName;
    private String centerCode;
    private int studentCapacity;
    private LocalDate createdOn;
    private String contactEmail;
    private String contactPhone;
    private Address address;
    private List<String> courseOffered;
//    private String courseOffered;

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getCourseOffered() {
        return courseOffered;
    }

    public void setCourseOffered(List<String> courseOffered) {
        this.courseOffered = courseOffered;
    }
}
