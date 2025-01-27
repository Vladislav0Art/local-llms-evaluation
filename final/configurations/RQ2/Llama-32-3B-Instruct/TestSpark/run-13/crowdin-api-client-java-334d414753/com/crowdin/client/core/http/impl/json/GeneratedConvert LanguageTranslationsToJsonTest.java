package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedConvert LanguageTranslationsToJsonTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void convert

    LanguageTranslationsToJsonTest() {
        LanguageTranslations languageTranslations = new LanguageTranslations();
        languageTranslations.getEn().getTranslations("Hello World");
        languageTranslations.getFr().getTranslations("Bonjour le monde");

        String json = objectMapper.writeValueAsString(languageTranslations);
        assertEquals("{\"en\":{\"translations\":\"Hello World\"},\"fr\":{\"translations\":\"Bonjour le monde\"}}", json);
    }

}