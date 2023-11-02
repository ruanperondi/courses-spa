package com.mbitalent.courses.domain.entity.vo;

import com.mbitalent.courses.domain.entity.vo.Country;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountryTest {

    @Test
    @DisplayName("Testing creation of a valid country")
    void test1() {
        Country country = new Country("United States", "US");
        assertEquals("United States", country.name());
        assertEquals("US", country.abbreviation());
    }

    @Test
    @DisplayName("Testing if null name throws an exception")
    void test2() {
        assertThrows(IllegalArgumentException.class, () -> new Country(null, "US"));
    }

    @Test
    @DisplayName("Testing if blank name throws an exception")
    void test3() {
        assertThrows(IllegalArgumentException.class, () -> new Country("", "US"));
    }

    @Test
    @DisplayName("Testing if null abbreviation throws an exception")
    void test4() {
        assertThrows(IllegalArgumentException.class, () -> new Country("United States", null));
    }

    @Test
    @DisplayName("Testing if blank abbreviation throws an exception")
    void test5() {
        assertThrows(IllegalArgumentException.class, () -> new Country("United States", ""));
    }
}
