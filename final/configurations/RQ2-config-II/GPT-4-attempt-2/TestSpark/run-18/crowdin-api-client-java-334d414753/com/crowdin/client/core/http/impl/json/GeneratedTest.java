package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"test\"}";
        TestEntity entity = transformer.parse(json, TestEntity.class);

        assertEquals("test", entity.getName());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "invalid json";
        transformer.parse(json, TestEntity.class);
    }

    @Test
    public void parseNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = null;
        transformer.parse(json, TestEntity.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestEntity entity = new TestEntity("test");
        String json = transformer.convert(entity);

        assertTrue(json.contains("\"name\":\"test\""));
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestEntity entity = null;
        transformer.convert(entity);
    }
}

class TestEntity {
    private String name;

    public TestEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}