package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedConvert_LanguageTranslationsTest {

    @Test
    public void convert_LanguageTranslationsTest() {
        LanguageTranslations languageTranslations = new LanguageTranslations();
        languageTranslations.setEN("English Translation");
        languageTranslations.setRU("Russian Translation");
        String json = JacksonJsonTransformer.convert(languageTranslations);
        assertNotNull(json);
        assertTrue(json.contains("\"en\":\"English Translation\""));
        assertTrue(json.contains("\"ru\":\"Russian Translation\""));
    }

}