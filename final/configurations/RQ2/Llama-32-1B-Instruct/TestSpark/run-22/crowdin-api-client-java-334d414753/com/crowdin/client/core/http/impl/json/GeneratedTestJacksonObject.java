package com.crowdin.client.core.http.impl.json;

public class GeneratedTestJacksonObject {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testJacksonObject() {
        Project project = new Project();
        project.setKey("value");
        project.setProjects(new ArrayList<>());
        String json = objectMapper.writeValueAsString(project);
        assertNotNull(json);
        assertEquals("{\"key\":\"value\"}", json);
    }

}