package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertValidObjectTest {

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
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        MockClass object = new MockClass();
        object.setName("Test Project");
        String result = transformer.convert(object);
        assertTrue(result.contains("\"name\":\"Test Project\""));
    }

}