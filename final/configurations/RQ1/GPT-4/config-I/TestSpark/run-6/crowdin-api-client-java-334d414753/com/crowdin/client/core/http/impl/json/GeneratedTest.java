package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void parseHttpExceptionTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"errorMessage\":\"Bad request\"}";

        HttpException ex = transformer.parse(json, HttpException.class);
        assertNotNull(ex);
    }

    @Test
    public void parseHttpBadRequestExceptionTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"errorMessage\":\"Bad request\"}";

        HttpBadRequestException ex = transformer.parse(json, HttpBadRequestException.class);
        assertNotNull(ex);
    }

    @Test
    public void parseExceptionTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{}";

        transformer.parse(json, Project.class);
    }

    @Test
    public void parseUnexpectedInputTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"unexpectedField\":\"unexpectedValue\"}";

        transformer.parse(json, FileInfo.class);
    }

    @Test
    public void convertHttpExceptionTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HttpException exception = new HttpException();

        String json = transformer.convert(exception);
        assertNotNull(json);
    }

    @Test
    public void convertProjectTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("Test project");

        String json = transformer.convert(project);
        assertEquals("{\"name\":\"Test project\"}", json);
    }

}