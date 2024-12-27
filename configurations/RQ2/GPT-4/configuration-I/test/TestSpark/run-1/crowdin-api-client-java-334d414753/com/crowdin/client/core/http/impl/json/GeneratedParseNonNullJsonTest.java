package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.core.JsonParseException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.crowdin.client.core.http.impl.json.JsonTransformer;

public class GeneratedParseNonNullJsonTest {

    @Test
    public void parseNonNullJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\": \"test-name\"}";
        TestObject testObject = transformer.parse(json, TestObject.class);

        assertNotNull(testObject);
        assertEquals("test-name", testObject.getName());
    }

}