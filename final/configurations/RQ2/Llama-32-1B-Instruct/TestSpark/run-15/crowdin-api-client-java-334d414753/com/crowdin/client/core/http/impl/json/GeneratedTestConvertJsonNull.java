package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestConvertJsonNull {

    @Test
    public void testConvertJsonNull() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = (Project) objectMapper.readValue(json, Object.class);
        assertEquals(null, project.getName());
        assertEquals(30, project.getAge());
    }

}