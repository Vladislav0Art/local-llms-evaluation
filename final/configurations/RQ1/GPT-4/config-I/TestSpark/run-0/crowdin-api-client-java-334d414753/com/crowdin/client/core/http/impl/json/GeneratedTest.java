package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private static JacksonJsonTransformer jsonTransformer;

    @BeforeClass
    public static void setUp() {
        jsonTransformer = new JacksonJsonTransformer();
    }

    @Test
    public void parseInvalidJsonTest() throws IOException {
        jsonTransformer.parse("{\"test\":}", Project.class);
    }

    @Test
    public void parseHttpExceptionTest() throws IOException {
        jsonTransformer.parse("{\"message\": \"Bad Request\"}", HttpBadRequestException.class);
    }

    @Test
    public void parseCrowdinApiExceptionTest() throws IOException {
        jsonTransformer.parse("{\"error\": \"Not Found\"}", CrowdinApiException.class);
    }

    @Test
    public void parseValidJsonTest() throws IOException {
        Project project = jsonTransformer.parse("{\"id\": 1, \"name\": \"Test Project\"}", Project.class);
        assertNotNull(project);
        assertEquals(Long.valueOf(1), project.getId());
        assertEquals("Test Project", project.getName());
    }

    @Test
    public void convertValidJsonObjectTest() throws JsonProcessingException {
        Project project = new Project();
        project.setId(1L);
        project.setName("Test Project");
        String jsonString = jsonTransformer.convert(project);
        assertEquals("{\"id\":1,\"name\":\"Test Project\"}", jsonString);
    }

}