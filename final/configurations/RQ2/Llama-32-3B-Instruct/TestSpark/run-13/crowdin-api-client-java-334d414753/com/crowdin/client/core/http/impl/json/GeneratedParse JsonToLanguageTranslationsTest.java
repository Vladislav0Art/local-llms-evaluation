package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParse JsonToLanguageTranslationsTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void parse

    JsonToLanguageTranslationsTest() {
        String json = "{\"en\":{\"translations\":\"Hello World\"},\"fr\":{\"translations\":\"Bonjour le monde\"}}";
        LanguageTranslations languageTranslations = objectMapper.readValue(json, LanguageTranslations.class);
        assertEquals("Hello World", languageTranslations.getEn().getTranslations());
        assertEquals("Bonjour le monde", languageTranslations.getFr().getTranslations());
    }

}