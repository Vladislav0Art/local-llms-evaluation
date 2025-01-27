package com.crowdin.client.core.http.impl.json;

public class GeneratedTestClassLanguageTranslations {

    @Test
    public void testClassLanguageTranslations() {
        LanguageTranslations translations = new LanguageTranslations();
        Translation translation = new Translation("key1", "value1");
        translations.setEn(translation);
        assertEquals("value1", translations.getEn().getKey());
    }

}