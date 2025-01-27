package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedParse JsonToImportOptionsTest {

    private ObjectMapper objectMapper = new ObjectMapper();
    private SimpleModule simpleModule = new SimpleModule();

    @Test
    public void parse

    JsonToImportOptionsTest() {
        String json = "{\"importPath\":\"/my/import\",\"fileFilter\":\".txt\"}";
        ImportOptions importOptions = objectMapper.readValue(json, ImportOptions.class);
        assertEquals("/my/import", importOptions.getImportPath());
        assertEquals(".txt", importOptions.getFileFilter());
    }

}