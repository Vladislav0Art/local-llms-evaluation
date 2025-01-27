package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConvert_LanguageTranslationsTest {

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
    public void convert_LanguageTranslationsTest() {
        when(objectMapper.findAndRegisterModules()).thenReturn(new SimpleModule());
        LanguageTranslations languageTranslations = (LanguageTranslations) jsonTransformer.convert(languageTranslations);
        assertEquals("en", languageTranslations.getLanguages().get(0));
    }

}