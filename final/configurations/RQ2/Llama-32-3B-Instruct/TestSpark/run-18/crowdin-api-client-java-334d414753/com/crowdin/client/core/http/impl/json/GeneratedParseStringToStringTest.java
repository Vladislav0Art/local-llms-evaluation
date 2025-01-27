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

public class GeneratedParseStringToStringTest {

    @Spy
    private ObjectMapper objectMapper;

    public static void main(String[] args) {
        org.junit4.JUnit4ClassRunner.main(args);
    }

    protected void setup() {
        MockitoAnnotations.initMocks(this);
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