package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\": 1, \"name\": \"Test Project\"}";

        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals(1, project.getId());
        Assert.assertEquals("Test Project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "not a valid json";

        transformer.parse(json, Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1);
        project.setName("Test Project");

        String json = transformer.convert(project);

        Assert.assertTrue(json.contains("\"id\":1"));
        Assert.assertTrue(json.contains("\"name\":\"Test Project\""));
    }

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(new Object());
    }

}