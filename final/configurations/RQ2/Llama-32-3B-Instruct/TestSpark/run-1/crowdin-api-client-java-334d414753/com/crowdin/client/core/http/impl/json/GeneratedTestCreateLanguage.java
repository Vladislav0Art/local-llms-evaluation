package com.crowdin.client.core.http.impl.json;

public class GeneratedTestCreateLanguage {

    private int id;
    private String name;
    private String languageType;

    public Language() {
        this.id = 0;
        this.name = "";
        this.languageType = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguageType() {
        return languageType;
    }

    public void setLanguageType(String languageType) {
        this.languageType = languageType;
    }
}

public class LanguageTest {

    @Test
    public void testCreateLanguage() {
        Language language = new Language();
        assertNotNull(language);
    }

}