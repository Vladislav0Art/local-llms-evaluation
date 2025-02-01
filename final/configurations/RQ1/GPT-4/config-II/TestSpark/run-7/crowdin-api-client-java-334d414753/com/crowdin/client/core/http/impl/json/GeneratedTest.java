package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private final JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionClassTest() throws Exception {
        String json = "{\"message\": \"HttpException occurred\"}";

        HttpException result = jacksonJsonTransformer.parse(json, HttpException.class);

        assertEquals("Testing parsing of HttpException", "HttpException occurred", result.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws Exception {
        String json = "{\"message\": \"HttpBadRequestException occurred\"}";

        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);

        assertEquals("Testing parsing of HttpBadRequestException", "HttpBadRequestException occurred", result.getMessage());
    }

    @Test
    public void parseExceptionWhenInvalidJsonTest() throws Exception {
        expectedException.expect(CrowdinApiException.class);
        expectedException.expectMessage("Could not read JSON: Unrecognized token 'InvalidJson': was expecting ('true', 'false' or 'null')");

        jacksonJsonTransformer.parse("InvalidJson", Project.class);
    }

    @Test
    public void parseProjectClassTest() throws Exception {
        String json = "{ \"id\": 1, \"name\": \"Example Project\" }";

        Project result = jacksonJsonTransformer.parse(json, Project.class);

        assertEquals(1L, (long) result.getId());
        assertEquals("Example Project", result.getName());
    }

    @Test
    public void convertProjectTest() throws Exception {
        Project project = new Project();
        project.setId(1L);
        project.setName("Example Project");

        String result = jacksonJsonTransformer.convert(project);

        assertTrue(result.contains("\"id\":1"));
        assertTrue(result.contains("\"name\":\"Example Project\""));
    }

    @Test
    public void parseNonexistentClassTest() throws Exception {
        expectedException.expect(CrowdinApiException.class);
        expectedException.expectMessage("Could not read JSON: Could not initialize class com.crowdin.client.nonExistentClass");

        // Error expected since `nonExistentClass` does not exist
        jacksonJsonTransformer.parse("{}", Class.forName("com.crowdin.client.nonExistentClass"));
    }

}