package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        String json = "{\"key\":\"value\"}";
        Object result = jacksonJsonTransformer.parse(json, Object.class);
        assertNotNull(result);

        json = "invalid json";
        try {
            jacksonJsonTransformer.parse(json, Object.class);
            fail("Expected exception not thrown for invalid JSON input");
        } catch (Exception ignore) {
            //success path
        }
    }

    @Test
    public void convertTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        Object obj = new Object();
        String result = jacksonJsonTransformer.convert(obj);
        assertNotNull(result);

        obj = null;
        result = jacksonJsonTransformer.convert(obj);
        assertNull(result);
    }

}