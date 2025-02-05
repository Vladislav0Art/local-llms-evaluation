package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    // Test the parse() method when correct json and class type is provided

    @Test
    public void parseRightDataTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String validJson = "{\"name\":\"test\",\"identifier\":\"test-id\",\"description\":\"test project\"}";
        Project project = jsonTransformer.parse(validJson, Project.class);

        Assert.assertEquals("test", project.getName());
        Assert.assertEquals("test-id", project.getIdentifier());
        Assert.assertEquals("test project", project.getDescription());
    }

    @Test
    public void parseWrongJsonFormatTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String invalidJson = "invalid json format";
        Project project = jsonTransformer.parse(invalidJson, Project.class);
    }

    @Test
    public void parseWrongClassTypeTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String validJson = "{\"name\":\"test\",\"identifier\":\"test-id\",\"description\":\"test project\"}";
        // Try to parse to object of a different type
        String nothing = jsonTransformer.parse(validJson, String.class);
    }

    @Test
    public void convertValidObjectTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        Project inputProject = new Project();
        inputProject.setName("Test project");
        inputProject.setIdentifier("Test id");
        inputProject.setDescription("Test description");

        String expectedOutput = "{\"name\":\"Test project\",\"identifier\":\"Test id\",\"description\":\"Test description\"}";

        String actualOutput = jsonTransformer.convert(inputProject);

        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void convertNullObjectTest() throws Exception {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String output = jsonTransformer.convert(null);
    }

}