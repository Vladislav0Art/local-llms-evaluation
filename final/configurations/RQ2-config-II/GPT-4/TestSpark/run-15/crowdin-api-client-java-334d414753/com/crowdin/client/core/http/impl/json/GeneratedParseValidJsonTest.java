package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"testField\":\"testValue\"}";
        TestClass result = transformer.parse(json, TestClass.class);

        assertEquals("testValue", result.getTestField());
    }

}