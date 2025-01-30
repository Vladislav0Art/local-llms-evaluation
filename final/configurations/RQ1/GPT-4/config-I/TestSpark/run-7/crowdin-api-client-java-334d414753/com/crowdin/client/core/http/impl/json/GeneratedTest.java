package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseHttpExceptionJsonClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"exception message\"}";

        HttpException exception = transformer.parse(json, HttpException.class);

        assertNotNull(exception);
        assertEquals("exception message", exception.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionJsonClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"message\":\"bad request exception message\"}";

        HttpBadRequestException exception = transformer.parse(json, HttpBadRequestException.class);

        assertNotNull(exception);
        assertEquals("bad request exception message", exception.getMessage());
    }

    @Test
    public void parseProjectJsonClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Project name\"}";

        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals(Long.valueOf(1), project.getId());
        assertEquals("Project name", project.getName());
    }

    @Test
    public void convertProjectToJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(2L);
        project.setName("Test project");

        String json = transformer.convert(project);

        assertNotNull(json);
        assertTrue(json.contains(project.getName()));
        assertTrue(json.contains(String.valueOf(project.getId())));
    }

}