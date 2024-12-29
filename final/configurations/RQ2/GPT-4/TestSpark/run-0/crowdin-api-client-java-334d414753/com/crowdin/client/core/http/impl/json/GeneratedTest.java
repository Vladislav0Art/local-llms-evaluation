package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":1,\"name\":\"Project\"}";
        Project project = transformer.parse(json, Project.class);
        assertEquals(new Long(1), project.getId());
        assertEquals("Project", project.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"id\":}";
        transformer.parse(json, Project.class);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "";
        transformer.parse(json, Project.class);
    }

    @Test
    public void parseNonExistingPropertyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"nonExistingProperty\":1,\"name\":\"Project\"}";
        transformer.parse(json, Project.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = new Project();
        project.setId(new Long(1));
        project.setName("Project");
        String json = transformer.convert(project);
        assertTrue(json.contains("\"id\":1"));
        assertTrue(json.contains("\"name\":\"Project\""));
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}