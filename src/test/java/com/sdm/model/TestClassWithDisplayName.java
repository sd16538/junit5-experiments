package com.sdm.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests in here are displayed differently")
class TestClassWithDisplayName {

    @Test
    @DisplayName("stupid test innit")
    void myFirstTest() {
        assertEquals(5, 3 + 2);
    }

    @Test
    @DisplayName("execute all assertions and report failures together")
    void groupedAssertions() {
        Address address = new Address("John", "User");
        assertAll("address",
                () -> assertEquals("John", address.getFirstName()),
                () -> assertEquals("User", address.getLastName())
        );
    }
}
