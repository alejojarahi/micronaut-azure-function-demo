package com.example;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Factory
class AppContext {

    protected static final Logger LOG = LoggerFactory.getLogger(AppContext.class);

    @Singleton
    public ExampleService function() {
        LOG.info("Creating ExampleService bean in custom AppContext with Factory annotation.");
        return new ExampleService();
    }

}
