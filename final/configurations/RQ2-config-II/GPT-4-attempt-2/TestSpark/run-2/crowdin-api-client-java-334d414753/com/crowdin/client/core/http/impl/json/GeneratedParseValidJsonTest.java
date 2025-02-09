package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

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

}