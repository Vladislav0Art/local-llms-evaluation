package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    private JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonIntoClassTest() {
        String json = "{\"name\":\"TestProject\", \"description\":\"TestDescription\"}";
        Project project = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertEquals("TestProject", project.getName());
        Assert.assertEquals("TestDescription", project.getDescription());
    }

    @Test
    public void parseInvalidJsonIntoClassTest() {
        String invalidJson = "InvalidJson";
        jacksonJsonTransformer.parse(invalidJson, Project.class);
    }

    @Test
    public void convertObjectIntoJsonTest() {
        Project project = new Project();
        project.setName("TestProject");
        project.setDescription("TestDescription");
        String json = jacksonJsonTransformer.convert(project);
        Assert.assertTrue(json.contains("\"name\":\"TestProject\""));
        Assert.assertTrue(json.contains("\"description\":\"TestDescription\""));
    }

    @Test
    public void convertInvalidObjectIntoJsonTest() {
        jacksonJsonTransformer.convert(new Object() {
            @Override
            public String toString() {
                throw new RuntimeException("TestException");
            }
        });
    }

    @Test
    public void convertNullObjectIntoJsonTest() {
        jacksonJsonTransformer.convert(null);
    }

}