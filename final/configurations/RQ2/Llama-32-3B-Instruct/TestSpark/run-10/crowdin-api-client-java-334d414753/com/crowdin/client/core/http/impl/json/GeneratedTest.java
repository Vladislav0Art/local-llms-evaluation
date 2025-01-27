package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseProject() {
        String json = "{\"name\":\"Project 1\",\"id\":1,\"description\":\"This is a test project\"}";
        Project expectedProject = new Project("Project 1", 1, "This is a test project");
        assertSame(expectedProject, jsonJsonTransformer.parse(json, Project.class));
    }

    @Test
    public void parseExportOptions() {
        String json = "{\"language\":\"en\",\"exportFormat\":\"csv\"}";
        ExportOptions expectedOptions = new ExportOptions("en", ExportOptions.ExportFormat.CSV);
        assertSame(expectedOptions, jsonJsonTransformer.parse(json, ExportOptions.class));
    }

    @Test
    public void parseFileInfo() {
        String json = "{\"name\":\"file1.txt\",\"size\":1024,\"path\":\"/path/to/file1.txt\"}";
        FileInfo expectedFileInfo = new FileInfo("file1.txt", 1024, "/path/to/file1.txt");
        assertSame(expectedFileInfo, jsonJsonTransformer.parse(json, FileInfo.class));
    }

    @Test
    public void convertProject() {
        Project project = new Project("Project 1", 1, "This is a test project");
        String expectedJson = "{\"name\":\"Project 1\",\"id\":1,\"description\":\"This is a test project\"}";
        assertSame(expectedJson, jsonJsonTransformer.convert(project));
    }

    @Test
    public void convertExportOptions() {
        ExportOptions options = new ExportOptions("en", ExportOptions.ExportFormat.CSV);
        String expectedJson = "{\"language\":\"en\",\"exportFormat\":\"csv\"}";
        assertSame(expectedJson, jsonJsonTransformer.convert(options));
    }

    @Test
    public void convertFileInfo() {
        FileInfo fileInfo = new FileInfo("file1.txt", 1024, "/path/to/file1.txt");
        String expectedJson = "{\"name\":\"file1.txt\",\"size\":1024,\"path\":\"/path/to/file1.txt\"}";
        assertSame(expectedJson, jsonJsonTransformer.convert(fileInfo));
    }

    @Test
    public void convertLanguageTranslations() {
        LanguageTranslations translations = new LanguageTranslations("en", "en");
        String expectedJson = "{\"language\":\"en\",\"translations\":{\"en\":\"This is a test language\"}}";
        assertSame(expectedJson, jsonJsonTransformer.convert(translations));
    }

}