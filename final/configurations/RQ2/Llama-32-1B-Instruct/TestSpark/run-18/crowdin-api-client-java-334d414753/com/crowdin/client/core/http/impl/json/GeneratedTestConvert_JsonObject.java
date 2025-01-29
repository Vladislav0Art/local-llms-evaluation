package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvert_JsonObject {

    @Test
    public void testConvert_JsonObject() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        LanguageTranslations translations = (LanguageTranslations) convert(json);
        assertEquals("John", translations.getName());
        assertEquals(30, translations.getAge());
        assertEquals("New York", translations.getCity());
    }

}