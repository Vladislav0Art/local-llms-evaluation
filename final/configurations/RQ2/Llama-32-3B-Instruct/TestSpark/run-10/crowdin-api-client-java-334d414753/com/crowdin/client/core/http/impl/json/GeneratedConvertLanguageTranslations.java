package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertLanguageTranslations {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertLanguageTranslations() {
        LanguageTranslations translations = new LanguageTranslations("en", "en");
        String expectedJson = "{\"language\":\"en\",\"translations\":{\"en\":\"This is a test language\"}}";
        assertSame(expectedJson, jsonJsonTransformer.convert(translations));
    }

}