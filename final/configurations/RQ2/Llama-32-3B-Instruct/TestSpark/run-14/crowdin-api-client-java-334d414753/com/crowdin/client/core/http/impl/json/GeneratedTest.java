package com.crowdin.client.core.http.impl.json;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GeneratedTest {

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

// ExportOptions.java
public class ExportOptions {
}

public class ExportOptionsDeserializer {

    public static ExportOptions deserialize(String json) {
        // implementation
        return null;
    }
}

// ImportOptions.java
public class ImportOptions {
}

public class ImportOptionsDeserializer {

    public static ImportOptions deserialize(String json) {
        // implementation
        return null;
    }
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

// Language.java
public class Language {
    private String code;
    private String name;

    public Language(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
}

// LanguageDeserializer.java
public class LanguageDeserializer {

    public static Language deserialize(String json) {
        // implementation
        return null;
    }
}

// JsonTransformer.java
import java.util.HashMap;
import java.util.Map;

public class JsonTransformer {

    private Map<String, String> fields = new HashMap<>();

    public void addField(String name, Class<?> type) {
        fields.put(name, type.getName());
    }

    public String serialize(Project project) {
        // implementation
        return "";
    }
}

// GeneratedTest.java
import org.junit.Test;

public class GeneratedTest {

}