package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    private class MockClass {
        public String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"name\":\"Test Project\"}";
        MockClass result = transformer.parse(validJson, MockClass.class);
        assertEquals("Test Project", result.getName());
    }

}