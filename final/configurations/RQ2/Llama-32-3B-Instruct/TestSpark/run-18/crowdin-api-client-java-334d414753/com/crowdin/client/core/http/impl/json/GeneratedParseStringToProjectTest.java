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

public class GeneratedParseStringToProjectTest {

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

}