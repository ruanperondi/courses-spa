package com.mbitalent.courses.domain.entity.vo;

public record Country(String name, String abbreviation) {
    public static final Country BRAZIL = new Country("Brazil", "BR");
    public static final Country USA = new Country("United States", "USA");

    public Country {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (abbreviation == null || abbreviation.isBlank()) {
            throw new IllegalArgumentException("Abbreviation cannot be null or blank");
        }
    }
}
