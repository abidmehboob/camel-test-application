package com.example.camel;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.mock;


import org.junit.jupiter.api.BeforeEach;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class CamelApplicationGeneratedAiTests {

    @Mock
    private SomeOtherComponent someOtherComponent;

    @InjectMocks
    private CamelApplication camelApplication;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testMainMethod() {
        // GIVEN - Set up the context for testing the main method
        String[] args = new String[0]; 

        // WHEN - Execute the main method under test
        camelApplication.main(args); 

        // THEN - Assert that SpringApplication was called with CamelApplication class and arguments
        assertThat(SpringApplication.run).wasCalledWith(CamelApplication.class, args);
    }   
}

class SomeOtherComponent {
    public void someMethod() {}
}
