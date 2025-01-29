package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestArray {

    @Test
    public void testArray() {
        String json = "[{\"key\":\"value\"}, {\"key\":\"value\"}]";
        Object[] array = objectMapper.readValue(json, Object[].class);
        for (Object obj : array) {
            assertNotNull(obj);
            assertEquals("value", ((Map<String, Object>) obj).get("key"));
        }
    }

}