package com.mbitalent.courses.domain.entity.vo;

public record Address(String street, String number, City city, String zipCode) {
    
    public Address {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("Street cannot be null or blank");
        }

        if (number == null || number.isBlank()) {
            throw new IllegalArgumentException("Number cannot be null or blank");
        }

        if (city == null) {
            throw new IllegalArgumentException("City cannot be null");
        }

        if (zipCode == null || zipCode.isBlank()) {
            throw new IllegalArgumentException("Zip code cannot be null or blank");
        }
    }
}
