package com.crowdin.client.core.http.impl.json;

public class GeneratedConvertExportOptions {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void convertExportOptions() {
        ExportOptions options = new ExportOptions("en", ExportOptions.ExportFormat.CSV);
        String expectedJson = "{\"language\":\"en\",\"exportFormat\":\"csv\"}";
        assertSame(expectedJson, jsonJsonTransformer.convert(options));
    }

}