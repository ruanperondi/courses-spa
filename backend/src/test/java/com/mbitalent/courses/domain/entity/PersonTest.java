package com.mbitalent.courses.domain.entity;

import com.google.i18n.phonenumbers.Phonenumber;
import com.mbitalent.courses.domain.entity.vo.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PersonTest {

    private final Address validAddress = new Address("Main St", "123", new City("City", new State("State", Country.BRAZIL)), "12345");
    private final Email validEmail = new Email("test@example.com");
    private final Phonenumber.PhoneNumber validPhoneNumber = new Phonenumber.PhoneNumber();

    @Test
    @DisplayName("Create Person with valid parameters")
    public void test1() {
        Person person = new Person(LocalDate.of(1990, 1, 1), "John", "Doe", validAddress, validEmail, validPhoneNumber);

        assertEquals(LocalDate.of(1990, 1, 1), person.birthDate());
        assertEquals("John", person.firstName());
        assertEquals("Doe", person.lastName());
        assertEquals(validAddress, person.address());
        assertEquals(validEmail, person.email());
        assertEquals(validPhoneNumber, person.phone());
    }

    @Test
    @DisplayName("Create Person with null birth date should throw exception")
    public void test2() {
        assertThrows(IllegalArgumentException.class, () -> new Person(null, "John", "Doe", validAddress, validEmail, validPhoneNumber));
    }

    @Test
    @DisplayName("Create Person with null or blank first name should throw exception")
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), null, "Doe", validAddress, validEmail, validPhoneNumber));
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), "  ", "Doe", validAddress, validEmail, validPhoneNumber));
    }

    @Test
    @DisplayName("Create Person with null or blank last name should throw exception")
    public void test4() {
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), "John", null, validAddress, validEmail, validPhoneNumber));
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), "John", "  ", validAddress, validEmail, validPhoneNumber));
    }

    @Test
    @DisplayName("Create Person with null address should throw exception")
    public void test5() {
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), "John", "Doe", null, validEmail, validPhoneNumber));
    }

    @Test
    @DisplayName("Create Person with null email should throw exception")
    public void test6() {
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), "John", "Doe", validAddress, null, validPhoneNumber));
    }

    @Test
    @DisplayName("Create Person with null phone number should throw exception")
    public void test7() {
        assertThrows(IllegalArgumentException.class, () -> new Person(LocalDate.of(1990, 1, 1), "John", "Doe", validAddress, validEmail, null));
    }
}
