package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseRightDataTest {

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

}