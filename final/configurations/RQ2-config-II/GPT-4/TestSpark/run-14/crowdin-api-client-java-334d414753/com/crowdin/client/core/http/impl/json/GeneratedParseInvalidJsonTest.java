package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.crowdin.client.stringtranslations.model.LanguageTranslations;
import com.crowdin.client.sourcefiles.model.FileInfo;

public class GeneratedParseInvalidJsonTest {

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{\"translationID\":invalid,\"languageId\":\"ja\",\"text\":\"こんにちは\"}";
        transformer.parse(invalidJson, LanguageTranslations.class);
    }

}