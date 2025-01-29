package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestObjectMapper {

    @Test
    public void testObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "{\"key\":\"value\"}";
        Project project = objectMapper.readValue(json, Project.class);
        assertNotNull(project);
        assertEquals("value", project.getKey());
    }

}