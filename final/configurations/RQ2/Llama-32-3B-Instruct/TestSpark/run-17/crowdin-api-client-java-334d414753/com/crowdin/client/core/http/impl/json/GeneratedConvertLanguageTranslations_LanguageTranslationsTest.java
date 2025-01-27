package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

import java.io.IOException;
import java.util.Date;

public class GeneratedConvertLanguageTranslations_LanguageTranslationsTest {

    @Test
    public void convertLanguageTranslations_LanguageTranslationsTest() throws IOException {
        LanguageTranslations translations = new LanguageTranslations();
        translations.add("en", "hello");
        translations.add("fr", "bonjour");
        String json = JacksonJsonTransformer.convert(translations);
        assertNotNull(json);
        assertTrue(json.contains("\"en\":\"hello\""));
        assertTrue(json.contains("\"fr\":\"bonjour\""));
    }

}