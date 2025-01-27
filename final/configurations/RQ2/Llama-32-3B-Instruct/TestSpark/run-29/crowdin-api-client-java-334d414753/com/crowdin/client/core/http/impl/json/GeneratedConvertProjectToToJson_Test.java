package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedConvertProjectToToJson_Test {

    @org.junit.Before
    public void setUp() {
        // Setup necessary variables and objects for the test
    }

    @Test
    public void convertProjectToToJson_Test() {
        // Arrange
        Project project = new Project();

        String json = JacksonJsonTransformer.convert(project);
        String expectedJson = "{\"projectId\":0,\"name\":\"\"}";
        assertEquals(expectedJson, json);
    }

}