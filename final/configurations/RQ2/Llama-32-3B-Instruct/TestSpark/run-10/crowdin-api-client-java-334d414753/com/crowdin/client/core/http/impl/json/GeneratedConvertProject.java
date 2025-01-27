package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertProject {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertProject() {
        Project project = new Project("Project 1", 1, "This is a test project");
        String expectedJson = "{\"name\":\"Project 1\",\"id\":1,\"description\":\"This is a test project\"}";
        assertSame(expectedJson, jsonJsonTransformer.convert(project));
    }

}