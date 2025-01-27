package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestConvertFileInfoToJson {

    @org.junit.Before
    public void setUp() {
        // Setup necessary variables and objects for the test
    }

    public static com.fasterxml.jackson.databind.ObjectMapper createMapper() {
        return new com.fasterxml.jackson.databind.ObjectMapper();
    }

    public static com.fasterxml.jackson.databind.module.SimpleModule createModule() {
        return new com.fasterxml.jackson.databind.module.SimpleModule();
    }

    @Test
    public void testConvertFileInfoToJson() {
        FileInfo file = new FileInfo();
        file.setId(1);
        file.setPath("path");

        String json = JacksonJsonTransformer.convert(file);
        assertEquals("{\"id\":1,\"path\":\"path\"}", json);
    }

}