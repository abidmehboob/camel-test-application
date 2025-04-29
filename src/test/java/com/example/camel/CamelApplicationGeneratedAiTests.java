package com.example.camel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.SpringBootApplication;

@SpringBootApplication
class CamelApplicationGeneratedAiTests {
    @BeforeEach
    void setUp() {
    }

    @Test
    void testMain() {
        // GIVEN: The application context is initialized.
        // WHEN: The main method is executed.
        CamelApplication.main(new String[0]);
        // THEN: The application starts successfully.
    }
}