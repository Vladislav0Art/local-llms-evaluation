package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionTest() throws JsonProcessingException {
        HttpException exception = transformer.parse("{\"message\":\"Test exception\"}", HttpException.class);
        assertNotNull(exception);
    }

    @Test
    public void parseProjectTest() throws JsonProcessingException {
        Project project = transformer.parse("{\"id\":1, \"name\":\"Test project\"}", Project.class);
        assertNotNull(project);
        assertEquals("Test project", project.getName());
    }

    @Test
    public void parseFileInfoTest() throws JsonProcessingException {
        FileInfo fileInfo = transformer.parse("{\"name\":\"file.txt\"}", FileInfo.class);
        assertNotNull(fileInfo);
        assertEquals("file.txt", fileInfo.getName());
    }

    @Test
    public void parseLanguageTranslationsTest() throws JsonProcessingException {
        LanguageTranslations translations = transformer.parse("{\"languageId\":\"en\", \"stringId\":1, \"translation\":{\"content\":\"Testing\"}}", LanguageTranslations.class);
        assertNotNull(translations);
    }

    @Test
    public void convertProjectToJSONTest() throws JsonProcessingException {
        Project project = new Project();
        project.setName("Test project");
        String json = transformer.convert(project);
        assertNotNull(json);
        assertEquals("{\"name\":\"Test project\"}", json);
    }

}