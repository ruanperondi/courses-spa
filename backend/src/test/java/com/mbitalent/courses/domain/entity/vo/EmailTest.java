package com.mbitalent.courses.domain.entity.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    @DisplayName("Valid email should not throw exception")
    void test01() {
        assertDoesNotThrow(() -> new Email("example@example.com"));
        assertDoesNotThrow(() -> new Email("user123@example.co.uk"));
    }

    @Test
    @DisplayName("Invalid email should throw exception")
    void test02() {
        assertThrows(IllegalArgumentException.class, () -> new Email("invalid_email"));
        assertThrows(IllegalArgumentException.class, () -> new Email("example@.com"));
        assertThrows(IllegalArgumentException.class, () -> new Email("example@com"));
        assertThrows(IllegalArgumentException.class, () -> new Email("example@com."));
        assertThrows(IllegalArgumentException.class, () -> new Email("example@com.."));
        assertThrows(IllegalArgumentException.class, () -> new Email("@example.com"));
    }

    @Test
    @DisplayName("Email with numeric username should not throw exception")
    public void emailWithNumericUsernameShouldNotThrowException() {
        assertDoesNotThrow(() -> new Email("test0x@example.com"));
    }
}
