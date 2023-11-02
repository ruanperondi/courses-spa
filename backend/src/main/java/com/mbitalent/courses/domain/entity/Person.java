package com.mbitalent.courses.domain.entity;


import com.google.i18n.phonenumbers.Phonenumber;
import com.mbitalent.courses.domain.entity.vo.Address;
import com.mbitalent.courses.domain.entity.vo.Email;

import java.time.LocalDate;

public record Person(LocalDate birthDate, String firstName, String lastName, Address address, Email email, Phonenumber.PhoneNumber phone) {

    public Person {
        if (birthDate == null) {
            throw new IllegalArgumentException("Birth date cannot be null");
        }

        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or blank");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or blank");
        }

        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null or blank");
        }

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }

        if (phone == null) {
            throw new IllegalArgumentException("Phone cannot be null");
        }
    }
}
