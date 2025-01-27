package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestConvertProjectToToJson {

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
    public void testConvertProjectToToJson() {
        Project project = new Project();
        String json = JacksonJsonTransformer.convert(project);
        String expectedJson = "{\"projectId\":0,\"name\":\"\"}";
        assertEquals(expectedJson, json);
    }

}