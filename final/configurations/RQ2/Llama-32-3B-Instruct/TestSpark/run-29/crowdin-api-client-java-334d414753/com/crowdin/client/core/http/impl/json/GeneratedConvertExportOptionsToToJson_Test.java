package com.crowdin.client.core.http.impl.json;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedConvertExportOptionsToToJson_Test {

    @org.junit.Before
    public void setUp() {
        // Setup necessary variables and objects for the test
    }

    @Test
    public void convertExportOptionsToToJson_Test() {
        // Arrange
        ExportOptions options = new ExportOptions();
        options.setFileInfo(new FileInfo());
        options.setLanguage("en");

        String json = JacksonJsonTransformer.convert(options);
        assertEquals("{\"fileInfo\":{\"id\":0,\"name\":\"\"},\"language\":\"en\"}", json);
    }

}