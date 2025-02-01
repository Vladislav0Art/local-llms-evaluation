package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void parseTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test Project\"}";
        Project project = jacksonJsonTransformer.parse(json, Project.class);
        Assert.assertNotNull(project);
        Assert.assertEquals(1, project.getId().intValue());
        Assert.assertEquals("Test Project", project.getName());
    }

    @Test
    public void parseHttpExceptionTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"description\":\"Bad Request\",\"errors\":[{\"code\":\"BadRequest\"}]";
        jacksonJsonTransformer.parse(json, HttpException.class);
    }

    @Test
    public void parseHttpBadRequestExceptionTest() throws IOException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"description\":\"Bad Request\",\"errors\":[{\"code\":\"BadRequest\"}]";
        jacksonJsonTransformer.parse(json, HttpBadRequestException.class);
    }

    @Test
    public void convertTest() throws JsonProcessingException {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        Project testProject = new Project();
        testProject.setId(1L);
        testProject.setName("Test Project");
        String json = jacksonJsonTransformer.convert(testProject);
        Assert.assertNotNull(json);
        Assert.assertTrue(json.contains("\"id\":1"));
        Assert.assertTrue(json.contains("\"name\":\"Test Project\""));
    }

}