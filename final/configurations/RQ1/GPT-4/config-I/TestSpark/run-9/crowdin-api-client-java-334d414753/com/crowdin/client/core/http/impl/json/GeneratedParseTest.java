package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseTest {

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

}