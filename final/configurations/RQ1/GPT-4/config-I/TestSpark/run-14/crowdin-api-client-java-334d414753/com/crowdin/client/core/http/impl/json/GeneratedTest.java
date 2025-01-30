package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void parseHttpExceptionClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"Error Message\"}";
        HttpException exception = transformer.parse(json, HttpException.class);
        assertNotNull(exception);
        assertEquals("Error Message", exception.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"Error Message\"}";
        HttpBadRequestException exception = transformer.parse(json, HttpBadRequestException.class);
        assertNotNull(exception);
        assertEquals("Error Message", exception.getMessage());
    }

    @Test
    public void parseProjectClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test Project\"}";
        Project project = transformer.parse(json, Project.class);
        assertNotNull(project);
    }

    @Test
    public void parseFileInfoClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test File\"}";
        FileInfo fileInfo = transformer.parse(json, FileInfo.class);
        assertNotNull(fileInfo);
    }

    @Test
    public void convertProjectClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");
        String json = transformer.convert(project);
        assertNotNull(json);
    }

    @Test
    public void convertFileInfoClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(1L);
        fileInfo.setName("Test File");
        String json = transformer.convert(fileInfo);
        assertNotNull(json);
    }

}