package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseValidJsonToClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\": 1, \"name\": \"Test\"}";
        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        //assuming setId() and getId() return and accept a Long
        assertEquals(Long.valueOf(1), project.getId());
        assertEquals("Test", project.getName());
    }

    @Test
    public void parseHttpExceptionTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\": \"An error occurred\"}";
        HttpException exception = transformer.parse(json, HttpException.class);

        assertNotNull(exception);
        assertTrue(exception instanceof HttpException);
        assertEquals("An error occurred", exception.getMessage());
    }

    @Test
    public void parseInvalidJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"unknownField\": 1}";
        transformer.parse(json, Project.class);
    }

    @Test
    public void convertObjectToJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(Long.valueOf(1));
        project.setName("Test");

        String json = transformer.convert(project);

        assertNotNull(json);
        assertTrue(json.contains("\"id\":1"));
        assertTrue(json.contains("\"name\":\"Test\""));
    }

    @Test
    public void convertNullObjectToJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}