package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class GeneratedTestLanguageTranslationsDeserializer {

    private int id;
    private String name;

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
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
}

// ExportOptionsDeserializer.java
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = com.crowdin.client.core.http.impl.json.ExportOptionsDeserializer.class)
public class ExportOptions {
}

// ImportOptionsDeserializer.java
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = com.crowdin.client.core.http.impl.json.ImportOptionsDeserializer.class)
public class ImportOptions {
}

// FileInfo.java
public class FileInfo {
    private int id;
    private String name;

    public FileInfo(int id, String name) {
        this.id = id;
        this.name = name;
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
}

// LanguageTranslations.java
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = com.crowdin.client.sourcefiles.model.LanguageTranslationsDeserializer.class)
public class LanguageTranslations {
}

// JsonTransformer.java
public class JsonTransformer {
    public String serialize(Project project) {
        // implementation
        return "";
    }
}

// GeneratedTest.java
public class GeneratedTest {

    @Test
    public void testLanguageTranslationsDeserializer() {
        LanguageTranslations languageTranslations = new LanguageTranslations();
        // set some values for the class
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        LanguageTranslations deserialized = mapper.readValue(mapper.toString(languageTranslations), LanguageTranslations.class);
        assertNotNull(deserialized);
    }

}