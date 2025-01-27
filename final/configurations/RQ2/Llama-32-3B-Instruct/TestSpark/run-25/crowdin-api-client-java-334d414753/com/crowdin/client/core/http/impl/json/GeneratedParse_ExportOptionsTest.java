package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedParse_ExportOptionsTest {

    @Test
    public void parse_ExportOptionsTest() {
        String json = "{\"exportFormat\":\"pdf\",\"exportLayout\":\"vertical\"}";
        ExportOptions exportOptions = JacksonJsonTransformer.parse(json, ExportOptions.class);
        assertNotNull(exportOptions);
        assertEquals("pdf", exportOptions.getExportFormat());
        assertEquals("vertical", exportOptions.getExportLayout());
    }

}