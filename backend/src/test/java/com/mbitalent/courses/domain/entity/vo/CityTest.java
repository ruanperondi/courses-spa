package com.mbitalent.courses.domain.entity.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityTest {

    private final State sp = new State("São Paulo", Country.BRAZIL);

    @Test
    @DisplayName("Create City with valid name and state")
    public void test1() {

        City city = new City("Santos", sp);

        assertEquals("Santos", city.name());
        assertEquals(sp, city.state());
    }

    @Test
    @DisplayName("Create City with null name should throw exception")
    public void test2() {
        assertThrows(IllegalArgumentException.class, () -> new City(null, sp));
    }

    @Test
    @DisplayName("Create City with blank name should throw exception")
    public void test3() {
        assertThrows(IllegalArgumentException.class, () -> new City("  ", sp));
    }

    @Test
    @DisplayName("Create City with null state should throw exception")
    public void test4() {
        assertThrows(IllegalArgumentException.class, () -> new City("Santos", null));
    }
}
