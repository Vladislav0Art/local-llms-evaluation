package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedJsonToExportOptions {

    @Test
    public void jsonToExportOptions() {
        JacksonJsonToFileInfo jacksonJsonToFileInfo = new JacksonJsonToFileInfo();
        JacksonJson jacksonJson = new JacksonJson();
        assertEquals("{\"fileFilter\":\"txt\",\"importPath\":\"/my/import\"}", jacksonJson.toExportOptions("txt", "/my/import"));
    }

}