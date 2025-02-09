package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertNullObjectTest {

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