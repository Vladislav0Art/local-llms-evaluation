package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedParse_ImportOptionsTest {

    @Test
    public void parse_ImportOptionsTest() {
        String json = "{\"importFormat\":\"csv\",\"importLayout\":\"horizontal\"}";
        ImportOptions importOptions = JacksonJsonTransformer.parse(json, ImportOptions.class);
        assertNotNull(importOptions);
        assertEquals("csv", importOptions.getImportFormat());
        assertEquals("horizontal", importOptions.getImportLayout());
    }

}