package com.mbitalent.courses.domain.entity.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateTest {

    @Test
    @DisplayName("Create State with valid name and country")
    public void test1() {
        Country country = Country.BRAZIL;
        State state = new State("São Paulo", country);

        assertEquals("São Paulo", state.name());
        assertEquals(country, state.country());
    }

    @Test
    @DisplayName("Create State with null name should throw exception")
    public void test2() {
        Country country = Country.BRAZIL;
        assertThrows(IllegalArgumentException.class, () -> new State(null, country));
    }

    @Test
    @DisplayName("Create State with blank name should throw exception")
    public void test3() {
        Country country = Country.BRAZIL;
        assertThrows(IllegalArgumentException.class, () -> new State("  ", country));
    }

    @Test
    @DisplayName("Create State with null country should throw exception")
    public void test4() {
        assertThrows(IllegalArgumentException.class, () -> new State("São Paulo", null));
    }
}
