package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedParse_LanguageTranslationsTest {

    @Test
    public void parse_LanguageTranslationsTest() {
        String json = "{\"en\":\"English Translation\",\"ru\":\"Russian Translation\"}";
        LanguageTranslations languageTranslations = JacksonJsonTransformer.parse(json, LanguageTranslations.class);
        assertNotNull(languageTranslations);
        assertEquals("English Translation", languageTranslations.getEN());
        assertEquals("Russian Translation", languageTranslations.getRU());
    }

}