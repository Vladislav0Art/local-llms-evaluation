package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertProjectToJsonTest {

    private final JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertProjectToJsonTest() {
        Project project = new Project();
        project.setName("My Project");
        project.setId("123");

        String json = jsonTransformer.convert(project);

        Assert.assertTrue(json.contains("\"name\":\"My Project\""));
        Assert.assertTrue(json.contains("\"id\":\"123\""));
    }

}