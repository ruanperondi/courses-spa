package com.mbitalent.courses.domain.entity.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddressTest {

    private final Country country = Country.BRAZIL;
    private final State state = new State("São Paulo", country);
    private final City city = new City("Santos", state);

    @Test
    @DisplayName("Create Address with valid parameters")
    public void test1() {
        Address address = new Address("Main St", "123", city, "12345");

        assertEquals("Main St", address.street());
        assertEquals("123", address.number());
        assertEquals(city, address.city());
        assertEquals("12345", address.zipCode());
    }

    @Test
    @DisplayName("Create Address with null or blank street should throw exception")
    public void test2() {
        assertThrows(IllegalArgumentException.class, () -> new Address(null, "123", city, "12345"));
        assertThrows(IllegalArgumentException.class, () -> new Address("  ", "123", city, "12345"));
    }

    @Test
    @DisplayName("Create Address with null or blank number should throw exception")
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> new Address("Main St", null, city, "12345"));
        assertThrows(IllegalArgumentException.class, () -> new Address("Main St", "  ", city, "12345"));
    }

    @Test
    @DisplayName("Create Address with null city should throw exception")
    public void test4() {
        assertThrows(IllegalArgumentException.class, () -> new Address("Main St", "123", null, "12345"));
    }

    @Test
    @DisplayName("Create Address with null or blank zip code should throw exception")
    public void test5() {
        assertThrows(IllegalArgumentException.class, () -> new Address("Main St", "123", city, null));
        assertThrows(IllegalArgumentException.class, () -> new Address("Main St", "123", city, "  "));
    }
}