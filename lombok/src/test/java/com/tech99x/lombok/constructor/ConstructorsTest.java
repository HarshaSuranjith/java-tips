package com.tech99x.lombok.constructor;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

public class ConstructorsTest {

    @Test
    public void testPlainJavaConstructors() {

        Employee noArgsConstructor = new Employee();

        assertThat(noArgsConstructor.getFirstName(), is(nullValue()));
        assertThat(noArgsConstructor.getLastName(), is(nullValue()));
        assertThat(noArgsConstructor.getAddress(), is(nullValue()));
        assertThat(noArgsConstructor.getDateOfBirth(), is(nullValue()));
        assertThat(noArgsConstructor.getEpfNo(), is(nullValue()));
        assertThat(noArgsConstructor.getDesignation(), is(nullValue()));

        Employee allArgsConstructor = new Employee("Max", "Planck", "Germany", LocalDate.of(1858, 10, 4), "E00003", "Physicist");

        assertThat(allArgsConstructor.getFirstName(), is("Max"));
        assertThat(allArgsConstructor.getLastName(), is("Planck"));
        assertThat(allArgsConstructor.getAddress(), is("Germany"));
        assertThat(allArgsConstructor.getDateOfBirth(), is(LocalDate.of(1858, 10, 4)));
        assertThat(allArgsConstructor.getEpfNo(), is("E00003"));
        assertThat(allArgsConstructor.getDesignation(), is("Physicist"));


        Employee requiredArgsConstructor = new Employee("Max", "Planck", LocalDate.of(1858, 10, 4), "E00003", "Physicist");

        assertThat(requiredArgsConstructor.getFirstName(), is("Max"));
        assertThat(requiredArgsConstructor.getLastName(), is("Planck"));
        assertThat(requiredArgsConstructor.getDateOfBirth(), is(LocalDate.of(1858, 10, 4)));
        assertThat(requiredArgsConstructor.getEpfNo(), is("E00003"));
        assertThat(requiredArgsConstructor.getDesignation(), is("Physicist"));
    }

}
