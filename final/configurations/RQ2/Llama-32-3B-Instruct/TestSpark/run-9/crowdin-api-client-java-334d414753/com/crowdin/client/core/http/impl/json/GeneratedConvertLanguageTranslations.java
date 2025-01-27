package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertLanguageTranslations {

    @Test
    public void convertLanguageTranslations() {
        // Arrange
        LanguageTranslations translations = new LanguageTranslations();
        translations.setEn(new Translation("key1", "value1"));

        // Act
        String result = new JacksonJsonTransformer().convert(translations);

        // Assert
        assertNotNull(result);
        assertTrue(result.contains("\"en\":{\"key1\":\"value1\"}}"));
    }

}