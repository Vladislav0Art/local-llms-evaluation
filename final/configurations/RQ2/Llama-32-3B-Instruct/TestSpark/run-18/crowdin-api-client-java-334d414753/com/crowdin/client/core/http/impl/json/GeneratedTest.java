package com.crowdin.client.core.http.impl.json;

import org.junit4.JUnit4ClassRunner;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.ExportOptions;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.sourcefiles.model.ImportOptions;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;

public class GeneratedTest {

    @Spy
    private ObjectMapper objectMapper;

    public static void main(String[] args) {
        org.junit4.JUnit4ClassRunner.main(args);
    }

    protected void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void parseStringToProjectTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"my-project\",\"description\":\"This is my project\"}";
        Project project = transformer.parse(json, Project.class);

        // Assert
        org.junit.Assert.assertEquals("my-project", project.getName());
    }

    @Test
    public void parseStringToExportOptionsTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"folder\":\"/path/to/export\",\"fileCount\":10}";
        ExportOptions exportOptions = transformer.parse(json, ExportOptions.class);

        // Assert
        org.junit.Assert.assertEquals("/path/to/export", exportOptions.getFolder());
    }

    @Test
    public void parseStringToFileInfoTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"filename\":\"file.txt\",\"size\":1024}";
        FileInfo fileInfo = transformer.parse(json, FileInfo.class);

        // Assert
        org.junit.Assert.assertEquals("file.txt", fileInfo.getName());
    }

    @Test
    public void parseStringToImportOptionsTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"folder\":\"/path/to/import\",\"fileCount\":10}";
        ImportOptions importOptions = transformer.parse(json, ImportOptions.class);

        // Assert
        org.junit.Assert.assertEquals("/path/to/import", importOptions.getFolder());
    }

    @Test
    public void parseStringToStringTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"key\":\"value\"}";
        String result = transformer.parse(json, String.class);

        // Assert
        org.junit.Assert.assertEquals("value", result);
    }

}