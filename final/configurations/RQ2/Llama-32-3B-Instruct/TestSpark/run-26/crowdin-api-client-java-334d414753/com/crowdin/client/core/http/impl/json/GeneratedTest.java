package com.crowdin.client.core.http.impl.json;

public class GeneratedTest {

    // No-arg constructor
}

public class HttpBadRequestException extends Exception {
    // No-arg constructor
}

public class Project {
    private int id;
    private String name;
    private int age;

    public Project() {
    }

    public Project(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class JacksonJsonTransformerTest {

    private JacksonJsonTransformer jsonJsonTransformer;

    @Before
    public void setup() {
        jsonJsonTransformer = new JacksonJsonTransformer();
    }

}