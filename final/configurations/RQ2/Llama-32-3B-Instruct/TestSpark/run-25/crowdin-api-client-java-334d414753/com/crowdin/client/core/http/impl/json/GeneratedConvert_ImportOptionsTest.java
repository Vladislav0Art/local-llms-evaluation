package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedConvert_ImportOptionsTest {

    @Test
    public void convert_ImportOptionsTest() {
        ImportOptions importOptions = new ImportOptions();
        importOptions.setImportFormat("csv");
        importOptions.setImportLayout("horizontal");
        String json = JacksonJsonTransformer.convert(importOptions);
        assertNotNull(json);
        assertTrue(json.contains("\"importFormat\":\"csv\""));
        assertTrue(json.contains("\"importLayout\":\"horizontal\""));
    }

}