package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvert_SimpleString {

    @Test
    public void testConvert_SimpleString() {
        String json = "{\"name\":\"John\",\"age\":30}";
        LanguageTranslations translations = (LanguageTranslations) convert(json);
        assertEquals("John", translations.getName());
        assertEquals(30, translations.getAge());
    }

}