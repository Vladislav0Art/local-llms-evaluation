package com.crowdin.client.core.http.impl.json;

public class GeneratedParseProject {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseProject() {
        String json = "{\"name\":\"Project 1\",\"id\":1,\"description\":\"This is a test project\"}";
        Project expectedProject = new Project("Project 1", 1, "This is a test project");
        assertSame(expectedProject, jsonJsonTransformer.parse(json, Project.class));
    }

}