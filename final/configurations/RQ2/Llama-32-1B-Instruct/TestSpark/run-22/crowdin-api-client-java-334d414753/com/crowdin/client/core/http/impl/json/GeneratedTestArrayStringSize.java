package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestArrayStringSize {

    @Test
    public void testArrayStringSize() {
        String json = "[\"value\", \"value\"]";
        Object[] array = objectMapper.readValue(json, Object[].class);
        assertEquals(2, array.length);
        for (Object obj : array) {
            assertNotNull(obj);
            if (((Map<String, Object>) obj).get("key").equals("value")) {
                assertEquals("value", ((Map<String, Object>) obj).get("value"));
            }
        }
    }

}