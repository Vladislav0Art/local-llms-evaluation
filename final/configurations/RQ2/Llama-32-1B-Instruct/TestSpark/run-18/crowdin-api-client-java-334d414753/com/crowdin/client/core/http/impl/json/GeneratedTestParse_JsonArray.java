package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParse_JsonArray {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParse_JsonArray() {
        String json = "[{\"id\":1,\"name\":\"John\"},{\"id\":2,\"name\":\"Jane\"}]";
        Object[] objects = parse(json, Object.class);
        Project[] projects = (Project[]) objects;
        assertEquals(2, projects.length);
        for (int i = 0; i < projects.length; i++) {
            Project project = (Project) projects[i];
            assertEquals("John", project.getName());
            assertEquals(30, project.getAge());
        }
    }

}