package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParseJsonWithNull {

    @Test
    public void testParseJsonWithNull() throws JsonProcessingException {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\" null}";
        ObjectMapper objectMapper = new ObjectMapper();
        Project project = objectMapper.readValue(json, Project.class);
        assertEquals(1, project.getNames().size());
        assertEquals(30, project.getAge());
    }

}