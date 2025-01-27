package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseLanguageTranslationsJson {

    @Test
    public void parseLanguageTranslationsJson() {
        // Arrange
        String json = "{\"en\":{\"key1\":\"value1\"}}";
        Class<LanguageTranslations> clazz = LanguageTranslations.class;

        // Act
        Object result = new JacksonJsonTransformer().parse(json, clazz);

        // Assert
        assertNotNull(result);
        assertTrue(result instanceof LanguageTranslations);
    }

}