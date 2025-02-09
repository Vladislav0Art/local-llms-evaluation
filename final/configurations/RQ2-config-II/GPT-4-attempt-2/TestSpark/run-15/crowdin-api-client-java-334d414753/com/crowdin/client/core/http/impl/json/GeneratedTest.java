package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Test Project\"}";

        Project project = transformer.parse(json, Project.class);

        assertNotNull(project);
        assertEquals(1, project.getId());
        assertEquals("Test Project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":\"abc\",\"name\":\"Test Project\"}";

        transformer.parse(json, Project.class);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        Project project = transformer.parse("", Project.class);

        assertNull(project);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(1);
        project.setName("Test Project");

        String json = transformer.convert(project);

        assertNotNull(json);
        assertTrue(json.contains("\"id\":1"));
        assertTrue(json.contains("\"name\":\"Test Project\""));
    }

    @Test
    public void convertInvalidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId("abc");
        fileInfo.setName("Test File");

        transformer.convert(fileInfo);
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();

        String json = transformer.convert(null);

        assertNull(json);
    }

}