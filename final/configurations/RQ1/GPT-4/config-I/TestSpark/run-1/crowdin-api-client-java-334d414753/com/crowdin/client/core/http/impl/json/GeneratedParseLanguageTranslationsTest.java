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

public class GeneratedParseLanguageTranslationsTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseLanguageTranslationsTest() throws Exception {
        LanguageTranslations translations = mock(LanguageTranslations.class);
        String json = transformer.convert(translations);
        LanguageTranslations result = transformer.parse(json, LanguageTranslations.class);
        assertEquals(translations.getClass(), result.getClass());
    }

}