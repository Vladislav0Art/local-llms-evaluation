package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedConvert_ExportOptionsTest {

    @Test
    public void convert_ExportOptionsTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setExportFormat("pdf");
        exportOptions.setExportLayout("vertical");
        String json = JacksonJsonTransformer.convert(exportOptions);
        assertNotNull(json);
        assertTrue(json.contains("\"exportFormat\":\"pdf\""));
        assertTrue(json.contains("\"exportLayout\":\"vertical\""));
    }

}