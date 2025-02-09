package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = transformer.parse("{invalidJson}", Project.class);
    }

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Project project = transformer.parse("{\"id\":1,\"name\":\"Project\"}", Project.class);
        assertEquals(project.getId(), Integer.valueOf(1));
        assertEquals(project.getName(), "Project");
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = transformer.convert(null);
        assertEquals(json, "null");
    }

    @Test
    public void convertNonNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setExportPattern("testPattern");
        String json = transformer.convert(exportOptions);
        assertTrue(json.contains("\"exportPattern\":\"testPattern\""));
    }

}