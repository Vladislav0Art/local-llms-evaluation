package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestObject {

    @Test
    public void testObject() {
        String json = "{\"key\":\"value\"}";
        Map<String, Object> map = objectMapper.readValue(json, Map.class);
        assertEquals(1, map.size());
        for (Object obj : map.values()) {
            assertNotNull(obj);
            if (((Map<String, Object>) obj).get("key").equals("value")) {
                assertEquals("value", ((Map<String, Object>) obj).get("value"));
            }
        }
    }

}