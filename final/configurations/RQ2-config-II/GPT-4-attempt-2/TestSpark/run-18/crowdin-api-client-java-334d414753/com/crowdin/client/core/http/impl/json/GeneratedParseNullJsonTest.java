package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseNullJsonTest {

    @Test
    public void parseNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = null;
        transformer.parse(json, TestEntity.class);
    }

}