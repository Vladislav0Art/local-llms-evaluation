package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedTest {

    @Test
    public void parse_ProjectTest() {
        String json = "{\"name\":\"ProjectName\",\"description\":\"ProjectDescription\"}";
        Project project = JacksonJsonTransformer.parse(json, Project.class);
        assertNotNull(project);
        assertEquals("ProjectName", project.getName());
        assertEquals("ProjectDescription", project.getDescription());
    }

    @Test
    public void parse_ExportOptionsTest() {
        String json = "{\"exportFormat\":\"pdf\",\"exportLayout\":\"vertical\"}";
        ExportOptions exportOptions = JacksonJsonTransformer.parse(json, ExportOptions.class);
        assertNotNull(exportOptions);
        assertEquals("pdf", exportOptions.getExportFormat());
        assertEquals("vertical", exportOptions.getExportLayout());
    }

    @Test
    public void parse_FileInfoTest() {
        String json = "{\"name\":\"File1\",\"size\":1024,\"type\":\"pdf\"}";
        FileInfo fileInfo = JacksonJsonTransformer.parse(json, FileInfo.class);
        assertNotNull(fileInfo);
        assertEquals("File1", fileInfo.getName());
        assertEquals(1024L, fileInfo.getSize(), 0); // Due to float precision
        assertEquals("pdf", fileInfo.getType());
    }

    @Test
    public void parse_ImportOptionsTest() {
        String json = "{\"importFormat\":\"csv\",\"importLayout\":\"horizontal\"}";
        ImportOptions importOptions = JacksonJsonTransformer.parse(json, ImportOptions.class);
        assertNotNull(importOptions);
        assertEquals("csv", importOptions.getImportFormat());
        assertEquals("horizontal", importOptions.getImportLayout());
    }

    @Test
    public void parse_LanguageTranslationsTest() {
        String json = "{\"en\":\"English Translation\",\"ru\":\"Russian Translation\"}";
        LanguageTranslations languageTranslations = JacksonJsonTransformer.parse(json, LanguageTranslations.class);
        assertNotNull(languageTranslations);
        assertEquals("English Translation", languageTranslations.getEN());
        assertEquals("Russian Translation", languageTranslations.getRU());
    }

    @Test
    public void convert_ProjectTest() {
        Project project = new Project();
        project.setName("ProjectName");
        project.setDescription("ProjectDescription");
        String json = JacksonJsonTransformer.convert(project);
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"ProjectName\""));
        assertTrue(json.contains("\"description\":\"ProjectDescription\""));
    }

    @Test
    public void convert_ExportOptionsTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setExportFormat("pdf");
        exportOptions.setExportLayout("vertical");
        String json = JacksonJsonTransformer.convert(exportOptions);
        assertNotNull(json);
        assertTrue(json.contains("\"exportFormat\":\"pdf\""));
        assertTrue(json.contains("\"exportLayout\":\"vertical\""));
    }

    @Test
    public void convert_FileInfoTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("File1");
        fileInfo.setSize(new Date().getTime()); // Use date to avoid float precision issues
        fileInfo.setType("pdf");
        String json = JacksonJsonTransformer.convert(fileInfo);
        assertNotNull(json);
        assertTrue(json.contains("\"name\":\"File1\""));
        assertTrue(json.contains("\"size\":"));
        assertTrue(json.contains("\"type\":\"pdf\""));
    }

    @Test
    public void convert_ImportOptionsTest() {
        ImportOptions importOptions = new ImportOptions();
        importOptions.setImportFormat("csv");
        importOptions.setImportLayout("horizontal");
        String json = JacksonJsonTransformer.convert(importOptions);
        assertNotNull(json);
        assertTrue(json.contains("\"importFormat\":\"csv\""));
        assertTrue(json.contains("\"importLayout\":\"horizontal\""));
    }

    @Test
    public void convert_LanguageTranslationsTest() {
        LanguageTranslations languageTranslations = new LanguageTranslations();
        languageTranslations.setEN("English Translation");
        languageTranslations.setRU("Russian Translation");
        String json = JacksonJsonTransformer.convert(languageTranslations);
        assertNotNull(json);
        assertTrue(json.contains("\"en\":\"English Translation\""));
        assertTrue(json.contains("\"ru\":\"Russian Translation\""));
    }

    @Test
    public void convert_NullObjectTest() {
        String json = JacksonJsonTransformer.convert(null);
        assertNull(json); // Test that null is converted to an empty string
    }

}