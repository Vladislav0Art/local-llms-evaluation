package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestConvertJson {

    @Test
    public void testConvertJson() throws JsonProcessingException {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        String convertedJson = objectMapper.writeValueAsString(null);
        assertEquals(json, convertedJson);
    }

}