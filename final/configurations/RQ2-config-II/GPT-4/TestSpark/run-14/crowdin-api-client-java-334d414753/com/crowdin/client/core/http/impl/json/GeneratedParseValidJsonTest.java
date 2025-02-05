package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.sourcefiles.model.FileInfo;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"translationId\":1,\"languageId\":\"ja\",\"text\":\"こんにちは\"}";
        LanguageTranslations translations = transformer.parse(validJson, LanguageTranslations.class);

        assertNotNull(translations);
        assertTrue(translations.getLanguageId().equals("ja"));
    }

}