package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParse JsonToExportOptionsTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void parse

    JsonToExportOptionsTest() {
        String json = "{\"exportPath\":\"/my/export\",\"fileFilter\":\".txt\"}";
        ExportOptions exportOptions = objectMapper.readValue(json, ExportOptions.class);
        assertEquals("/my/export", exportOptions.getExportPath());
        assertEquals(".txt", exportOptions.getFileFilter());
    }

}