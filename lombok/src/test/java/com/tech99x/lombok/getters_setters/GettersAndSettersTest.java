package com.tech99x.lombok.getters_setters;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class GettersAndSettersTest {

    @Test
    public void testPlainObjectGettersSetters() {
        Employee employee = new Employee();

        employee.setFirstName("Neils");
        employee.setLastName("Bohr");
        employee.setAddress("Denmark");
        employee.setDateOfBirth(LocalDate.of(1885, 10, 7));
        employee.setEpfNo("E00002");
        employee.setDesignation("Physicist");

        assertThat(employee.getFirstName(), is("Neils"));
        assertThat(employee.getLastName(), is("Bohr"));
        assertThat(employee.getAddress(), is("Denmark"));
        assertThat(employee.getDateOfBirth(), is(LocalDate.of(1885, 10, 7)));
        assertThat(employee.getEpfNo(), is("E00002"));
        assertThat(employee.getDesignation(), is("Physicist"));
    }

    @Test
    public void testLombokObjectGettersSetters() {

        // usage of @NoArgsConstructor
        EmployeeLombok employee = new EmployeeLombok();

        // usage of @Getters and @Setters
        employee.setFirstName("Neils");
        employee.setLastName("Bohr");
        employee.setAddress("Denmark");
        employee.setDateOfBirth(LocalDate.of(1885, 10, 7));
        employee.setEpfNo("E00002");
        employee.setDesignation("Physicist");

        assertThat(employee.getFirstName(), is("Neils"));
        assertThat(employee.getLastName(), is("Bohr"));
        assertThat(employee.getAddress(), is("Denmark"));
        assertThat(employee.getDateOfBirth(), is(LocalDate.of(1885, 10, 7)));
        assertThat(employee.getEpfNo(), is("E00002"));
        assertThat(employee.getDesignation(), is("Physicist"));

    }
}
