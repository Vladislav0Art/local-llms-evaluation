package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParse_JsonObject {

    @Test
    public void testParse_JsonObject() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        Project project = (Project) parse(json, Project.class);
        assertEquals(1, project.getName().length());
        assertEquals(30, project.getAge());
        assertEquals("New York", project.getCity());
    }

}