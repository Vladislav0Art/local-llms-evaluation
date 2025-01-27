package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedConvertFileInfoToJson_Test {

    @org.junit.Before
    public void setUp() {
        // Setup necessary variables and objects for the test
    }

    @Test
    public void convertFileInfoToJson_Test() {
        // Arrange
        FileInfo file = new FileInfo();
        file.setId(1);
        file.setPath("path");

        String json = JacksonJsonTransformer.convert(file);
        assertEquals("{\"id\":1,\"path\":\"path\"}", json);
    }

}