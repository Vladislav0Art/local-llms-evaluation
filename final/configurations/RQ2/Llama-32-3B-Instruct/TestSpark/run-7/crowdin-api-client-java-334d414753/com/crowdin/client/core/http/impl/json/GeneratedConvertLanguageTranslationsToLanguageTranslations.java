package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertLanguageTranslationsToLanguageTranslations {

    @Test
    public void convertLanguageTranslationsToLanguageTranslations() {
        LanguageTranslations translations = new LanguageTranslations();
        translations.setTranslation("English", "Hello World");
        translations.setTranslation("Spanish", "Hola Mundo");

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        LanguageTranslations result = transformer.convert(translations);
        assertEquals(translations.getTranslation("English"), result.getTranslation("English"));
        assertEquals(translations.getTranslation("Spanish"), result.getTranslation("Spanish"));
    }

}