package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedJsonToImportOptions {

    @Test
    public void jsonToImportOptions() {
        JacksonJsonToImportOptions jacksonJsonToImportOptions = new JacksonJsonToImportOptions();
        JacksonJsonFromFileInfo jacksonJsonFromFileInfo = new JacksonJsonFromFileInfo();
        assertEquals("{\"fileFilter\":\"txt\",\"importPath\":\"/my/import\"}", jacksonJsonToImportOptions.toImportOptions("txt", "/my/import"));
    }

}