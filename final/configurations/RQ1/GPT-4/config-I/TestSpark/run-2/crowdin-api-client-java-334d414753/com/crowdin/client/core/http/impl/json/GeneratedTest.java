package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonToHttpExceptionTest() throws IOException {
        String json = "{\"message\":\"Bad request\"}";
        HttpException result = jacksonJsonTransformer.parse(json, HttpException.class);
        Assert.assertEquals("Bad request", result.getMessage());
    }

    @Test
    public void parseJsonToHttpBadRequestExceptionTest() throws IOException {
        String json = "{\"message\":\"Bad request\"}";
        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);
        Assert.assertEquals("Bad request", result.getMessage());
    }

    @Test
    public void parseJsonToProjectTest() throws IOException {
        String json = "{\"name\":\"My project\"}";
        Project result = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertEquals("My project", result.getName());
    }

    @Test
    public void parseInvalidJsonTest() throws IOException {
        String json = "{\"name:My project}";
        jacksonJsonTransformer.parse(json, Project.class);
    }

    @Test
    public void parseEmptyJsonTest() throws IOException {
        jacksonJsonTransformer.parse("", Project.class);
    }

    @Test
    public void convertObjectToJsonTest() {
        Project project = new Project();
        project.setName("My project");
        String result = jacksonJsonTransformer.convert(project);
        Assert.assertTrue(result.contains("My project"));
    }

    @Test
    public void convertEmptyObjectToJsonTest() {
        Project project = new Project();
        String result = jacksonJsonTransformer.convert(project);
        Assert.assertNotNull(result);
    }

    @Test
    public void convertNullObjectToJsonTest() {
        jacksonJsonTransformer.convert(null);
    }

}