package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionTest() throws IOException {
        String json = "{\"message\":\"Error\",\"code\":400}";
        HttpException result = jacksonJsonTransformer.parse(json, HttpException.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(400, result.getCode());
        Assert.assertEquals("Error", result.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionTest() throws IOException {
        String json = "{\"message\":\"Bad Request\",\"code\":400}";
        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);
        Assert.assertNotNull(result);
        Assert.assertEquals(400, result.getCode());
        Assert.assertEquals("Bad Request", result.getMessage());
    }

    @Test
    public void parseProjectTest() throws IOException {
        String json = "{\"name\":\"Test Project\"}";
        Project result = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertNotNull(result);
        Assert.assertEquals("Test Project", result.getName());
    }

    @Test
    public void convertHttpExceptionTest() throws JsonProcessingException {
        HttpException exception = new HttpException("Error", 400);
        String result = jacksonJsonTransformer.convert(exception);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("\"message\":\"Error\""));
        Assert.assertTrue(result.contains("\"code\":400"));
    }

    @Test
    public void convertProjectTest() throws JsonProcessingException {
        Project project = new Project();
        project.setName("Test Project");
        String result = jacksonJsonTransformer.convert(project);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.contains("\"name\":\"Test Project\""));
    }

}