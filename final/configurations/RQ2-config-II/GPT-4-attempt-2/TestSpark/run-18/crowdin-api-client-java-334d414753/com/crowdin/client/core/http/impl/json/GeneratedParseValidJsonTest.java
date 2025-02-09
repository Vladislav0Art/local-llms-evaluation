package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"name\":\"test\"}";
        TestEntity entity = transformer.parse(json, TestEntity.class);

        assertEquals("test", entity.getName());
    }

}