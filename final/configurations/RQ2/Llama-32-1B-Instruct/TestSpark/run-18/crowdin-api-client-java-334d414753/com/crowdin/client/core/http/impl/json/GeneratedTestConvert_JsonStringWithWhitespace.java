package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvert_JsonStringWithWhitespace {

    @Test
    public void testConvert_JsonStringWithWhitespace() {
        String json = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\\  ,\"test\":\"value\"}";
        LanguageTranslations translations = (LanguageTranslations) convert(json);
        assertEquals("John", translations.getName());
        assertEquals(30, translations.getAge());
        assertEquals("New York", translations.getCity());
    }

}