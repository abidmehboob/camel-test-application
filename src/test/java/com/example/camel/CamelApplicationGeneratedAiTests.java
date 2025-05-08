package com.example.camel;

com.example.camel.CamelApplicationGeneratedAiTests

import org.junit.Before;
import org.junit.Test;
import org.junit.After;
package com.example.camel;

public class CamelApplicationGeneratedAiTests {

    private CamelApplication camelApp;

    @BeforeEach
    void setUp() {
        this.camelApp = new CamelApplication();
    }

    // GIVEN a valid Spring application context is created with default properties.
    // WHEN the main method of CamelApplication is called without arguments.
    // THEN no exception should be thrown during startup and run configuration completes successfully.
    @Test
    void givenValidSpringContext_whenMainMethodCalledWithoutArguments_thenNoException() {
        assertThat(() -> this.camelApp.main(new String[0])).doesNotThrowAnyException();
    }

}
