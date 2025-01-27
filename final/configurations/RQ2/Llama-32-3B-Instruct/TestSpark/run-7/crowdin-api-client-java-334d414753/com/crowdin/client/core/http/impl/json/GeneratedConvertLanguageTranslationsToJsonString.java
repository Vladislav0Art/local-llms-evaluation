package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertLanguageTranslationsToJsonString {

    @Test
    public void convertLanguageTranslationsToJsonString() {
        LanguageTranslations translations = new LanguageTranslations();
        translations.setTranslation("English", "Hello World");
        translations.setTranslation("Spanish", "Hola Mundo");

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(translations);
        assertEquals("{\"English\":\"Hello World\",\"Spanish\":\"Hola Mundo\"}", result);
    }

}