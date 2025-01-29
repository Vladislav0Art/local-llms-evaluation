package com.crowdin.client.core.http.impl.json;

public class GeneratedTestConvert_JsonArray {

    @Test
    public void testConvert_JsonArray() {
        String json = "[{\"name\":\"John\",\"age\":30},{\"name\":\"Jane\",\"age\":31}]";
        LanguageTranslations[] arrays = (LanguageTranslations[]) convert(json);
        for (int i = 0; i < arrays.length; i++) {
            assertEquals(1, arrays[i].getName().length());
            assertEquals(30, arrays[i].getAge());
            assertEquals("New York", arrays[i].getCity());
        }
    }

}