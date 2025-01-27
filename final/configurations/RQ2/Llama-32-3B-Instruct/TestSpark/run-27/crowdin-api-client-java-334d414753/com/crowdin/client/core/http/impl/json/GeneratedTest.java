package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        new JacksonJsonTransformer();
    }

    @Test
    public void parseNullJson() {
        JacksonJsonTransformer instance = new JacksonJsonTransformer();
        instance.parse(null, null);
    }

    @Test
    public void convertToEmptyObjectTest() throws Exception {
        JsonConverter<Object> instance = new JsonConverter<>();
        instance.convertToEmptyObject(null);
    }

    @Test
    public void parseAndConvertTest() throws Exception {
        String jsonStr = "{\"project\":{\"id\":1,\"name\":\"crowdin\",\"created_at\":\"2010-10-29\"}}";
        JsonConverter<Project> instance = new JsonConverter<>();
        Project obj = instance.parse(jsonStr);
        assertNotNull(obj);
    }

    @Test
    public void convertTest() throws Exception {
        String jsonStr = "{\"language\":\"en\"}";
        JsonConverter<Language> instance = new JsonConverter<>();
        Language obj = instance.convert(jsonStr);
        assertNotNull(obj);
    }

    @Test
    public void parseAndConvertArrayTest() throws Exception {
        String jsonStr = "[{\"id\":1,\"name\":\"project1\"},{\"id\":2,\"name\":\"project2\"}]";
        JsonConverter<FileInfo[]> instance = new JsonConverter<>();
        FileInfo[] obj = instance.parse(jsonStr);
        assertNotNull(obj);
    }
}

public class Project {
    public int id;
    public String name;

    public Project(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Language {
    public String language;

    public Language(String language) {
        this.language = language;
    }
}

public class FileInfo {
    public int id;
    public String name;

    public FileInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        FileInfo info = (FileInfo) obj;
        return id == info.id && name.equals(info.name);
    }
}

}