package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestJsonArrayMap {

    @Test
    public void testJsonArrayMap() {
        String json = "[{\"key\":\"value\"}, {\"key\":\"value\"}]";
        Map<String, Object> map = objectMapper.readValue(json, Map.class);
        assertEquals(2, ((Map<?, ?>) map).size());
        for (Object obj : map.values()) {
            assertNotNull(obj);
            if (((Map<?, ?>) obj).get("key").equals("value")) {
                assertEquals("value", ((Map<String, Object>) obj).get("value"));
            }
        }
    }

}