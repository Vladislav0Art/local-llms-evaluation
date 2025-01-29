package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParse_JsonStringWithWhitespace {

    @Test
    public void testParse_JsonStringWithWhitespace() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\  ,\"test\":\"value\"}";
        Project project = (Project) parse(json, Project.class);
        assertEquals(1, project.getName().length());
        assertEquals(30, project.getAge());
        assertEquals("New York", project.getCity());
    }

}