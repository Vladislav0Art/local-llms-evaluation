package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParseString() {
        String json = "{\"key\":\"value\"}";
        Project project = objectMapper.readValue(json, Project.class);
        assertNotNull(project);
        assertEquals("value", project.getKey());
    }

}