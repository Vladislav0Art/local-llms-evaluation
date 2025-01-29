package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestStringArray {

    @Test
    public void testStringArray() {
        String json = "[\"value\"]";
        Object[] array = objectMapper.readValue(json, Object[].class);
        for (Object obj : array) {
            assertNotNull(obj);
            if (((Map<String, Object>) obj).get("key").equals("value")) {
                assertEquals("value", ((Map<String, Object>) obj).get("value"));
            }
        }
    }

}