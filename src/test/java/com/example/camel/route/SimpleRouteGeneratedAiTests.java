package com.example.camel.route;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

// Note: The following import might be incorrect if SimpleRoute should not extend RouteBuilder directly. Adjust accordingly.
// import some.package.RouteBuilder; // Uncomment and correct the package name as needed.

@Component
public class SimpleRoute extends RouteBuilder {  // Added closing brace here

    @Override public void configure() throws Exception {
        from("timer:foo?period=1000")
                .log("Hello Camel!");
    }
}
