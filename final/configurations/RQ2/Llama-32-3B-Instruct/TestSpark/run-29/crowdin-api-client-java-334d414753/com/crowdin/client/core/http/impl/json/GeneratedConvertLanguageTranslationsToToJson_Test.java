package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedConvertLanguageTranslationsToToJson_Test {

    @org.junit.Before
    public void setUp() {
        // Setup necessary variables and objects for the test
    }

    @Test
    public void convertLanguageTranslationsToToJson_Test() {
        // Arrange
        LanguageTranslations translations = new LanguageTranslations();
        translations.setLanguage("en");
        translations.setTranslators(new Translators());

        String json = JacksonJsonTransformer.convert(translations);
        assertEquals("{\"language\":\"en\",\"translators\":[\"\"]}", json);
    }

}