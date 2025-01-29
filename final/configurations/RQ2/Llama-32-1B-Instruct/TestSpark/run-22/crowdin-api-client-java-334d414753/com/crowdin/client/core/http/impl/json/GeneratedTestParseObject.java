package com.crowdin.client.core.http.impl.json;

public class GeneratedTestParseObject {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testParseObject() {
        Object obj = new Object();
        Project project = objectMapper.readValue(obj, Project.class);
        assertNotNull(project);
        assertEquals(1, project.getProjects().size());
        assertTrue(project.getProjects().iterator().hasNext());
        Project lastProject = (Project) project.getProjects().next();
        assertEquals("value", lastProject.getKey());
    }

}