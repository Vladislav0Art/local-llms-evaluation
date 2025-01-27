package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

    @Test
    public void testClassProject() {
        Project project = new Project("test-name", 1);
        assertEquals("test-name", project.getName());
    }

    @Test
    public void testClassLanguageTranslations() {
        LanguageTranslations translations = new LanguageTranslations();
        Translation translation = new Translation("key1", "value1");
        translations.setEn(translation);
        assertEquals("value1", translations.getEn().getKey());
    }

    @Test
    public void testClassFileInfo() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setFileName("test-file-name");
        assertEquals("test-file-name", fileInfo.getFileName());
    }

}