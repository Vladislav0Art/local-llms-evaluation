package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @Test
    public void parseProjectToProjectTest() {
        Project project = new Project();
        project.setId(1L);
        project.setName("Crowdin");
        String json = (String) com.fasterxml.jackson.databind.JsonNode.toJson(project);

        assertTrue(JsonTransformer.parse(json, Project.class) instanceof Project);
    }

    @Test
    public void parseExportOptionsToExportOptionsTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setFileFormat(1L);
        exportOptions.setProjectId(2L);
        String json = (String) com.fasterxml.jackson.databind.JsonNode.toJson(exportOptions);

        assertTrue(JsonTransformer.parse(json, ExportOptions.class) instanceof ExportOptions);
    }

    @Test
    public void parseFileInfoToFileInfoTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(3L);
        fileInfo.setFileFormat(4L);
        fileInfo.setProjectId(5L);
        String json = (String) com.fasterxml.jackson.databind.JsonNode.toJson(fileInfo);

        assertTrue(JsonTransformer.parse(json, FileInfo.class) instanceof FileInfo);
    }

    @Test
    public void convertProjectToStringTest() {
        Project project = new Project();
        project.setId(1L);
        project.setName("Crowdin");

        String result = (String) JsonTransformer.convert(project);

        assertFalse(result.isEmpty());
    }

    @Test
    public void convertExportOptionsToStringTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setFileFormat(1L);
        exportOptions.setProjectId(2L);

        String result = (String) JsonTransformer.convert(exportOptions);

        assertFalse(result.isEmpty());
    }

    @Test
    public void convertFileInfoToStringTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(3L);
        fileInfo.setFileFormat(4L);
        fileInfo.setProjectId(5L);

        String result = (String) JsonTransformer.convert(fileInfo);

        assertFalse(result.isEmpty());
    }

}