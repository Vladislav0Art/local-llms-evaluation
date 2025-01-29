package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;

public class GeneratedTestConvert_JsonString {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void testConvert_JsonString() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        LanguageTranslations translations = convert(json, null);
        assertEquals("John", translations.getName());
        assertEquals(30, translations.getAge());
        assertEquals("New York", translations.getCity());
    }

}