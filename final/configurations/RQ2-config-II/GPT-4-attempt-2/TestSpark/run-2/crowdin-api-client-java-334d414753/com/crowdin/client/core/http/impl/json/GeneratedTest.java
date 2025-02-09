package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{" +
                "\"id\": 1," +
                "\"name\": \"Test Project\"," +
                "\"description\": \"This is a test project\"" +
                "}";
        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals(Long.valueOf(1), project.getId());
        Assert.assertEquals("Test Project", project.getName());
        Assert.assertEquals("This is a test project", project.getDescription());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{" +
                "\"id\": \"invalid\"," +
                "\"name\": 123," +
                "\"description\": true" +
                "}";
        transformer.parse(json, Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");
        project.setDescription("This is a test project");

        String expectedJson =
                "{" +
                        "\"id\":1," +
                        "\"name\":\"Test Project\"," +
                        "\"description\":\"This is a test project\"" +
                        "}";
        String actualJson = transformer.convert(project);

        Assert.assertEquals(expectedJson, actualJson);
    }

    @Test
    public void convertNonSerializableObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        NonSerializableClass nonSerializableObject = new NonSerializableClass();
        transformer.convert(nonSerializableObject);
    }

    private static class NonSerializableClass {
    }

}