package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedConvert ImportOptionsToJsonTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void convert

    ImportOptionsToJsonTest() {
        ImportOptions importOptions = new ImportOptions();
        importOptions.setImportPath("/my/import");
        importOptions.getFileFilter(".txt");

        String json = objectMapper.writeValueAsString(importOptions);
        assertEquals("{\"importPath\":\"/my/import\",\"fileFilter\":\".txt\"}", json);
    }

}