package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestJson {

    @Test
    public void testJson() {
        String json = "{\"key\":\"value\"}";
        Project project = objectMapper.readValue(json, Project.class);
        assertNotNull(project);
        assertEquals("value", project.getKey());
    }

}