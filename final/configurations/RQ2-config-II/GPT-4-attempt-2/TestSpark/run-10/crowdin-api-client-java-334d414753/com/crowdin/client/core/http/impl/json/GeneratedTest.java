package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    private final JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseCorrectJsonForProjectTest() {
        String json = "{ \"name\": \"My Project\", \"id\": \"123\" }";

        Project project = jsonTransformer.parse(json, Project.class);

        Assert.assertEquals("My Project", project.getName());
        Assert.assertEquals("123", project.getId());
    }

    @Test
    public void parseEmptyJsonForProjectTest() {
        String json = "";

        jsonTransformer.parse(json, Project.class);
    }

    @Test
    public void parseNullJsonForProjectTest() {
        String json = null;

        Project project = jsonTransformer.parse(json, Project.class);

        Assert.assertNull(project);
    }

    @Test
    public void convertProjectToJsonTest() {
        Project project = new Project();
        project.setName("My Project");
        project.setId("123");

        String json = jsonTransformer.convert(project);

        Assert.assertTrue(json.contains("\"name\":\"My Project\""));
        Assert.assertTrue(json.contains("\"id\":\"123\""));
    }

    @Test
    public void convertNullObjectToJsonTest() {
        jsonTransformer.convert(null);
    }

}