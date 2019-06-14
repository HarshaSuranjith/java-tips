package com.tech99x.lombok.getters_setters;

import java.time.LocalDate;
import java.util.Objects;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEpfNo() {
        return epfNo;
    }

    protected void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                address.equals(employee.address) &&
                dateOfBirth.equals(employee.dateOfBirth) &&
                epfNo.equals(employee.epfNo) &&
                designation.equals(employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, dateOfBirth, epfNo, designation);
    }
}
