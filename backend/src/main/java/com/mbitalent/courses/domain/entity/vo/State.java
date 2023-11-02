package com.mbitalent.courses.domain.entity.vo;

public record State(String name, Country country) {
    public State {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (country == null) {
            throw new IllegalArgumentException("Country cannot be null");
        }
    }
}
