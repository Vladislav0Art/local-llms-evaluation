package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Project project;

    @Mock
    private LanguageTranslations languageTranslations;

    @Mock
    private ExportOptions exportOptions;

    @Mock
    private ImportOptions importOptions;

    @Mock
    private ObjectMapper objectMapper;

    private JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parse_ProjectTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        String json = "{\"name\":\"test project\",\"id\":123,\"languages\":[\"en\"]}";
        Project result = (Project) jsonTransformer.parse(json, Project.class);
        assertEquals("test project", result.getName());
    }

    @Test
    public void parse_ProjectIdTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        String json = "{\"name\":\"test project\",\"id\":123,\"languages\":[\"en\"]}";
        Project result = (Project) jsonTransformer.parse(json, Project.class);
        assertEquals(123L, result.getId());
    }

    @Test
    public void parse_LanguageTranslationsTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        String json = "{\"name\":\"test project\",\"id\":123,\"languages\":[\"en\"]}";
        LanguageTranslations languageTranslations = (LanguageTranslations) jsonTransformer.parse(json, LanguageTranslations.class);
        assertEquals("en", languageTranslations.getLanguages().get(0));
    }

    @Test
    public void parse_InvalidJsonTest() {
        String json = "{\"name\":\"test project\",\"id\":123,\"languages\":[\"en\"]}";
        assertThrows(CrowdinApiException.class, () -> jsonTransformer.parse(json, Project.class));
    }

    @Test
    public void convert_ProjectTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        Project project = new JacksonJsonTransformer().convert(project);
        assertEquals("test project", project.getName());
    }

    @Test
    public void convert_ProjectIdTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        Project project = new JacksonJsonTransformer().convert(project);
        assertEquals(123L, project.getId());
    }

    @Test
    public void convert_LanguageTranslationsTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        LanguageTranslations languageTranslations = (LanguageTranslations) jsonTransformer.convert(languageTranslations);
        assertEquals("en", languageTranslations.getLanguages().get(0));
    }

}