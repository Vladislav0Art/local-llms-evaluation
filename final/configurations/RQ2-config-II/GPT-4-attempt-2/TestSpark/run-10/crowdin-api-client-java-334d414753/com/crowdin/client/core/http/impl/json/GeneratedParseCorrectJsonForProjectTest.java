package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseCorrectJsonForProjectTest {

    private final JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseCorrectJsonForProjectTest() {
        String json = "{ \"name\": \"My Project\", \"id\": \"123\" }";

        Project project = jsonTransformer.parse(json, Project.class);

        Assert.assertEquals("My Project", project.getName());
        Assert.assertEquals("123", project.getId());
    }

}