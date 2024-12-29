package com.crowdin.client.core.http.impl.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class GeneratedTest {

    private int id1;
    private int id2;

    public ExportOptions(int id1, int id2) {
        this.id1 = id1;
        this.id2 = id2;
    }

    @Override
    public String toString() {
        return "ExportOptions{" +
                "id1=" + id1 +
                ", id2=" + id2 +
                '}';
    }
}

public class FileInfo {
    private String name;
    private long size;

    public FileInfo(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

public class Project {
    private int id;

    public Project(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                '}';
    }
}

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonJsonTransformer {

}