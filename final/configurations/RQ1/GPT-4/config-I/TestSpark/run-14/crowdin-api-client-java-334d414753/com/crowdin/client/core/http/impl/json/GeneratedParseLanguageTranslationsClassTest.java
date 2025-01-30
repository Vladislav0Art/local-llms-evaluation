package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedParseLanguageTranslationsClassTest {

    @Test
    public void parseLanguageTranslationsClassTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"languageId\":1,\"translation\":\"Test Translation\"}";
        LanguageTranslations translations = transformer.parse(json, LanguageTranslations.class);
        assertNotNull(translations);
        assertEquals(1, translations.getLanguageId().intValue());
        assertEquals("Test Translation", translations.getTranslation());
    }

}