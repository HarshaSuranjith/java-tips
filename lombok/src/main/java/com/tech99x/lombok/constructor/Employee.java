package com.tech99x.lombok.constructor;

import java.time.LocalDate;

public class Employee {

    private String firstName;
    private String lastName;
    private String address;
    private LocalDate dateOfBirth;
    private String epfNo;
    private String designation;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String address, LocalDate dateOfBirth, String epfNo, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.epfNo = epfNo;
        this.designation = designation;
    }

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, String epfNo, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.epfNo = epfNo;
        this.designation = designation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEpfNo() {
        return epfNo;
    }

    public String getDesignation() {
        return designation;
    }
}
