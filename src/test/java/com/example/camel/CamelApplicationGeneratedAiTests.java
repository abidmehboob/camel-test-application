package com.example.camel;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.mockito.Mockito.mock;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class CamelApplicationGeneratedAiTests {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = SpringApplication.run(CamelApplication.class, new String[0]);
    }

    @Test
    void testMainMethod() {
        // GIVEN - The main method is executed.
        SpringApplication.run(CamelApplication.class, new String[0]);
        // THEN - The application context is created and initialized.
        assertNotNull(context);
    }
}
