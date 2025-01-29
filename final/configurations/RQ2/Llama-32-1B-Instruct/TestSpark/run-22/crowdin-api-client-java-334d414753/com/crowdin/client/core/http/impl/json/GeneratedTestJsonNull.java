package com.crowdin.client.core.http.impl.json;

public class GeneratedTestJsonNull {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testJsonNull() {
        String json = "{\"key\":null}";
        Project project = objectMapper.readValue(json, Project.class);
        assertNotNull(project);
        assertEquals(null, project.getKey());
    }

}