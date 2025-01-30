package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void parseHttpExceptionClazzTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HttpException exception = jacksonJsonTransformer.parse("{\"status\":\"500\",\"message\":\"Internal server error\"}", HttpException.class);
        assertNotNull(exception);
        assertEquals("Internal server error", exception.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionClazzTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HttpBadRequestException exception = jacksonJsonTransformer.parse("{\"status\":\"400\",\"message\":\"Invalid request\"}", HttpBadRequestException.class);
        assertNotNull(exception);
        assertEquals("Invalid request", exception.getMessage());
    }

    @Test
    public void parseProjectClazzTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"Test Project\",\"identifier\":\"test_project\"}";
        Project result = jacksonJsonTransformer.parse(json, Project.class);
        assertNotNull(result);
        assertEquals("Test Project", result.getName());
    }

    @Test
    public void convertTest() throws Exception {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("Test Project");
        String result = jacksonJsonTransformer.convert(project);
        assertNotNull(result);
        assertEquals("{\"name\":\"Test Project\"}", result);
    }

}