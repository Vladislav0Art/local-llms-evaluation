package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionTest() throws Exception {
        HttpException exception = mock(HttpException.class);
        String json = transformer.convert(exception);
        HttpException result = transformer.parse(json, HttpException.class);
        assertEquals(exception.getClass(), result.getClass());
    }

    @Test
    public void parseHttpBadRequestExceptionTest() throws Exception {
        HttpBadRequestException exception = mock(HttpBadRequestException.class);
        String json = transformer.convert(exception);
        HttpBadRequestException result = transformer.parse(json, HttpBadRequestException.class);
        assertEquals(exception.getClass(), result.getClass());
    }

    @Test
    public void parseCrowdinApiExceptionTest() throws Exception {
        CrowdinApiException exception = mock(CrowdinApiException.class);
        String json = transformer.convert(exception);
        CrowdinApiException result = transformer.parse(json, CrowdinApiException.class);
        assertEquals(exception.getClass(), result.getClass());
    }

    @Test
    public void parseProjectTest() throws Exception {
        Project project = mock(Project.class);
        String json = transformer.convert(project);
        Project result = transformer.parse(json, Project.class);
        assertEquals(project.getClass(), result.getClass());
    }

    @Test
    public void parseFileInfoTest() throws Exception {
        FileInfo fileInfo = mock(FileInfo.class);
        String json = transformer.convert(fileInfo);
        FileInfo result = transformer.parse(json, FileInfo.class);
        assertEquals(fileInfo.getClass(), result.getClass());
    }

    @Test
    public void parseLanguageTranslationsTest() throws Exception {
        LanguageTranslations translations = mock(LanguageTranslations.class);
        String json = transformer.convert(translations);
        LanguageTranslations result = transformer.parse(json, LanguageTranslations.class);
        assertEquals(translations.getClass(), result.getClass());
    }

    @Test
    public void convertTest() throws Exception {
        Project project = mock(Project.class);
        String json = transformer.convert(project);
        assertNotNull(json);
    }

}