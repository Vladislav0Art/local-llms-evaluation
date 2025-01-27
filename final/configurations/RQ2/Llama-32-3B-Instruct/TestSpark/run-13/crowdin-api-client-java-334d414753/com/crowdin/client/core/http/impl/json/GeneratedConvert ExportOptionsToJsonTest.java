package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedConvert ExportOptionsToJsonTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void convert

    ExportOptionsToJsonTest() {
        ExportOptions exportOptions = new ExportOptions();
        exportOptions.setExportPath("/my/export");
        exportOptions.getFileFilter(".txt");

        String json = objectMapper.writeValueAsString(exportOptions);
        assertEquals("{\"exportPath\":\"/my/export\",\"fileFilter\":\".txt\"}", json);
    }

}