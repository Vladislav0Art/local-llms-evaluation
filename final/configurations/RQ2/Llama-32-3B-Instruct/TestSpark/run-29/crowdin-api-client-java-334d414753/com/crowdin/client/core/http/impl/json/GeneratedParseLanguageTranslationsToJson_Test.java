package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedParseLanguageTranslationsToJson_Test {

    @org.junit.Before
    public void setUp() {
        // Setup necessary variables and objects for the test
    }

    @Test
    public void parseLanguageTranslationsToJson_Test() {
        // Arrange
        LanguageTranslations translations = new LanguageTranslations();
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind ObjectMapper();
        com.fasterxml.jackson.databind.module.SimpleModule module = new com.fasterxml.jackson.databind.module.SimpleModule();
        when(mapper.findAndRegisterModules()).thenReturn(module);
        when(module.getFactory()).thenReturn(mapper);

        String json = JacksonJsonTransformer.toJson(translations);
        assertEquals(json, translations.toString());
    }

}