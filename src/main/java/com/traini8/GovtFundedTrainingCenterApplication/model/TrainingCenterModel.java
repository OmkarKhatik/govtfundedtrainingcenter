package com.traini8.GovtFundedTrainingCenterApplication.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "training_center", catalog = "trainingcenterapplication")
public class TrainingCenterModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainingId;
    private String centerName;
    private String centerCode;
    private int studentCapacity;
    private LocalDate createdOn;
    private String contactEmail;
    private String contactPhone;
    private Address address;
    private String courseOffered;

    public TrainingCenterModel(){

    }
    //    public TrainingCenter(int trainingId, String centerName, String centerCode, int studentCapacity, LocalDate createdOn, String contactEmail, String contactPhone, Address address, List<String> courseOffered) {
    public TrainingCenterModel(int trainingId, String centerName, String centerCode, int studentCapacity, LocalDate createdOn, String contactEmail, String contactPhone, Address address) {
        this.trainingId = trainingId;
        this.centerName = centerName;
        this.centerCode = centerCode;
        this.studentCapacity = studentCapacity;
        this.createdOn = createdOn;
        this.contactEmail = contactEmail;
        this.contactPhone = contactPhone;
        this.address = address;
//        this.courseOffered = courseOffered;
    }

    public int getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(int trainingId) {
        this.trainingId = trainingId;
    }

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

    public String getCourseOffered() {
        return courseOffered;
    }

    public void setCourseOffered(String courseOffered) {
        this.courseOffered = courseOffered;
    }
}
