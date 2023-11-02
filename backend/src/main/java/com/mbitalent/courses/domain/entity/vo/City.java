package com.mbitalent.courses.domain.entity.vo;

public record City(String name, State state) {

    public City {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
    }

}
