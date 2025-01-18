package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

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
    public void parseNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        MockClass result = transformer.parse(null, MockClass.class);
        assertNull(result);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        MockClass result = transformer.parse("", MockClass.class);
        assertNull(result);
    }

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"name\":\"Test Project\"}";
        MockClass result = transformer.parse(validJson, MockClass.class);
        assertEquals("Test Project", result.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        MockClass result = transformer.parse("{InvalidJson}", MockClass.class);
        assertNull(result);
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(null);
        assertNull(result);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        MockClass object = new MockClass();
        object.setName("Test Project");
        String result = transformer.convert(object);
        assertTrue(result.contains("\"name\":\"Test Project\""));
    }

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(new Object());
        assertNotNull(result);
    }

}