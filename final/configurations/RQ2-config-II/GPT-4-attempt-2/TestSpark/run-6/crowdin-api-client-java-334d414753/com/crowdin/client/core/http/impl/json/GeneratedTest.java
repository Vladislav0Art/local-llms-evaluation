package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{ \"name\": \"test\", \"id\": 1 }";
        Project result = transformer.parse(validJson, Project.class);
        assertNotNull(result);
        assertEquals("test", result.getName());
        assertEquals(1, result.getId());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{ \"name\": \"test\", \"id\": \"invalid\" }";
        exception.expect(RuntimeException.class);
        transformer.parse(invalidJson, Project.class);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String emptyJson = "{}";
        Project result = transformer.parse(emptyJson, Project.class);
        assertNotNull(result);
        assertNull(result.getName());
        assertEquals(0, result.getId());
    }

    @Test
    public void convertNonnullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setName("test");
        project.setId(1);
        String result = transformer.convert(project);
        assertNotNull(result);
        assertTrue(result.contains("\"name\":\"test\""));
        assertTrue(result.contains("\"id\":1"));
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = null;
        String result = transformer.convert(project);
        assertNotNull(result);
        assertEquals("null", result);
    }

    @Test
    public void convertEmptyObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions exportOptions = new ExportOptions();
        String result = transformer.convert(exportOptions);
        assertNotNull(result);
        assertEquals("{}", result.trim());
    }

}