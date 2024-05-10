package com.example;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.HttpResponseMessage;
import io.micronaut.http.HttpMethod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoFunctionTest {

    @Test
    public void testFunction() throws Exception {
        try (Function function = new Function()) {
            HttpResponseMessage response = function.request(HttpMethod.GET, "/demo")
                        .invoke();

            assertEquals(HttpStatus.OK, response.getStatus());
        }
    }
}
