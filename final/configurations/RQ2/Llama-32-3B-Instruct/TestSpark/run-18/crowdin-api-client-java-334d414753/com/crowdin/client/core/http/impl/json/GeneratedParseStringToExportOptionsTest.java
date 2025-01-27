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

public class GeneratedParseStringToExportOptionsTest {

    @Spy
    private ObjectMapper objectMapper;

    public static void main(String[] args) {
        org.junit4.JUnit4ClassRunner.main(args);
    }

    protected void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void parseStringToExportOptionsTest() throws IOException {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"folder\":\"/path/to/export\",\"fileCount\":10}";
        ExportOptions exportOptions = transformer.parse(json, ExportOptions.class);

        // Assert
        org.junit.Assert.assertEquals("/path/to/export", exportOptions.getFolder());
    }

}