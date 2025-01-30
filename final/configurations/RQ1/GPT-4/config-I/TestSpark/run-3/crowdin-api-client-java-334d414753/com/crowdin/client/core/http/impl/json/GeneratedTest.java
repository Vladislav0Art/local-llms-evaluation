package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseExceptionClassTest() throws JsonProcessingException {
        String json = "{\"message\":\"Exception message\"}";
        HttpException exception = transformer.parse(json, HttpException.class);

        Assert.assertEquals("Exception message", exception.getMessage());
    }

    @Test
    public void parseInvalidJsonTest() throws JsonProcessingException {
        String json = "Invalid json message";
        transformer.parse(json, HttpException.class);
    }

    @Test
    public void parseProjectClassTest() throws JsonProcessingException {
        String json = "{\"id\":1,\"name\":\"Project name\"}";
        Project project = transformer.parse(json, Project.class);

        Assert.assertEquals((Long) 1L, project.getId());
        Assert.assertEquals("Project name", project.getName());
    }

    @Test
    public void convertProjectTest() throws JsonProcessingException {
        Project project = new Project();
        project.setId(1L);
        project.setName("Project name");
        String json = transformer.convert(project);

        Assert.assertEquals("{\"id\":1,\"name\":\"Project name\"}", json);
    }

}