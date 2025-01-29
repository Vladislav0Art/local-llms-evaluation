package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestParse_SimpleString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParse_SimpleString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = (Project) parse(json, Project.class);
        assertEquals(1, project.getName().length());
        assertEquals(30, project.getAge());
    }

}