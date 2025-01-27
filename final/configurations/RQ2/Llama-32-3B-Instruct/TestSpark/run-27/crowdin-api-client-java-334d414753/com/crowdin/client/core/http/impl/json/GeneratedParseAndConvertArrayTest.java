package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GeneratedParseAndConvertArrayTest {

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