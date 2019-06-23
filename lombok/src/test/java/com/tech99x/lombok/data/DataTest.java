package com.tech99x.lombok.data;


import com.tech99x.lombok.data.lombok.Employee;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DataTest {

    @Test
    public void testPlainObject() {

        com.tech99x.lombok.data.Employee employee = com.tech99x.lombok.data.Employee.of("Albert", "Einstein", "USA", LocalDate.of(1879, 3, 14), "E0001", "Physicist");

        assertThat(employee.getFirstName(), is("Albert"));
        assertThat(employee.getLastName(), is("Einstein"));
        assertThat(employee.getAddress(), is("USA"));
        assertThat(employee.getDateOfBirth(), is(LocalDate.of(1879, 3, 14)));
        assertThat(employee.getEpfNo(), is("E0001"));
        assertThat(employee.getDesignation(), is("Physicist"));

    }

    @Test
    public void testLombokObject() {
        Employee employee = Employee.of("Albert", "Einstein", "USA", LocalDate.of(1879, 3, 14), "E0001", "Physicist");

        assertThat(employee.getFirstName(), is("Albert"));
        assertThat(employee.getLastName(), is("Einstein"));
        assertThat(employee.getAddress(), is("USA"));
        assertThat(employee.getDateOfBirth(), is(LocalDate.of(1879, 3, 14)));
        assertThat(employee.getEpfNo(), is("E0001"));
        assertThat(employee.getDesignation(), is("Physicist"));
    }

}
