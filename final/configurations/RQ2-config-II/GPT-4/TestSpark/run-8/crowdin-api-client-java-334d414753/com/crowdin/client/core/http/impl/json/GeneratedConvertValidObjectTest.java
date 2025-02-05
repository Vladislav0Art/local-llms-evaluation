package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjectTest {

    // Test the parse() method when correct json and class type is provided

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

}