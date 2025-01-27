package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void jsonToProject() {
        JacksonJson jacksonJson = new JacksonJson();
        assertEquals("{\"name\":\"My Project\"}", jacksonJson.toProject("My Project"));
    }

    @Test
    public void jsonToExportOptions() {
        JacksonJsonToFileInfo jacksonJsonToFileInfo = new JacksonJsonToFileInfo();
        JacksonJson jacksonJson = new JacksonJson();
        assertEquals("{\"fileFilter\":\"txt\",\"importPath\":\"/my/import\"}", jacksonJson.toExportOptions("txt", "/my/import"));
    }

    @Test
    public void jsonToFileInfo() {
        JacksonJsonFromFileInfo jacksonJsonFromFileInfo = new JacksonJsonFromFileInfo();
        JacksonJsonToFileInfo jacksonJsonToFileInfo1 = new JacksonJsonToFileInfo();
        assertEquals("{\"name\":\"My File\",\"size\":123,\"path\":\"/my/file\"}", jacksonJsonToFileInfo.toFileInfo("My File", 123, "/my/file"));
    }

    @Test
    public void jsonToImportOptions() {
        JacksonJsonToImportOptions jacksonJsonToImportOptions = new JacksonJsonToImportOptions();
        JacksonJsonFromFileInfo jacksonJsonFromFileInfo = new JacksonJsonFromFileInfo();
        assertEquals("{\"fileFilter\":\"txt\",\"importPath\":\"/my/import\"}", jacksonJsonToImportOptions.toImportOptions("txt", "/my/import"));
    }

    @Test
    public void jsonToLanguageTranslations() {
        JacksonJsonToLanguageTranslations jacksonJsonToLanguageTranslations = new JacksonJsonToLanguageTranslations();
        assertEquals("{\"en\":{\"translations\":\"Hello World\",\"fr\":\"Bonjour le monde\"}},", jacksonJsonToLanguageTranslations.toLanguageTranslations("Hello World", "Bonjour le monde"));
    }
}

public class JacksonJson {

    public String toProject(String projectName) {
        return "{\"name\":\"" + projectName + "\"}";
    }

    public static String toExportOptions(String fileFilter, String importPath) {
        return "{\"fileFilter\":\"" + fileFilter + "\",\"importPath\":\"" + importPath + "\"}";
    }
}

public class JacksonJsonFromFileInfo {

    public String toFileInfo(String name, int size, String path) {
        return "{\"name\":\"" + name + "\",\"size\": " + size + ",\"path\":\"" + path + "\"}";
    }
}

public class JacksonJsonToFileInfo {

    public static String toFileInfo(String name, int size, String path) {
        return "{\"name\":\"" + name + "\",\"size\": " + size + ",\"path\":\"" + path + "\"}";
    }
}

public class JacksonJsonToImportOptions {

    public static String toImportOptions(String fileFilter, String importPath) {
        return "{\"fileFilter\":\"" + fileFilter + "\",\"importPath\":\"" + importPath + "\"}";
    }
}

public class JacksonJsonToLanguageTranslations {

    public static String toLanguageTranslations(String enTranslation, String frTranslation) {
        return "{\"en\":{\"translations\":\"" + enTranslation + "\"},\"fr\":{\"translations\":\"" + frTranslation + "\"}}";
    }

}