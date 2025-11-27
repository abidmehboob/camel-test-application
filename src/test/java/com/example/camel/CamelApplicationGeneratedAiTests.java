package com.example.camel;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import static org.mockito.Mockito.mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CamelApplicationGeneratedAiTests {

    @InjectMocks
    private CamelApplication camelApplication;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testMainMethod() {
        // GIVEN - The main method is called with arguments
        String[] args = new String[0];
        // WHEN - The main method executes
        camelApplication.main(args);
        // THEN - SpringApplication should have run the CamelApplication
        assertEquals(org.springframework.boot.SpringApplication.run(CamelApplication.class, args), null); 
    }
}
