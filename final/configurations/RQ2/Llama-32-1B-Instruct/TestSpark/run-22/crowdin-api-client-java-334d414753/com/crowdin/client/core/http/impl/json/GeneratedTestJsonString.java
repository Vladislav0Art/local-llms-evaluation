package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

public class GeneratedTestJsonString {

    @Test
    public void testJsonString() {
        String json = "{\"key\":\"value\"}";
        Project project = objectMapper.readValue(json, Project.class);
        assertNotNull(project);
        assertEquals(1, project.getProjects().size());
        assertTrue(project.getProjects().iterator().hasNext());
        Project lastProject = (Project) project.getProjects().next();
        assertEquals("value", lastProject.getKey());
    }

}