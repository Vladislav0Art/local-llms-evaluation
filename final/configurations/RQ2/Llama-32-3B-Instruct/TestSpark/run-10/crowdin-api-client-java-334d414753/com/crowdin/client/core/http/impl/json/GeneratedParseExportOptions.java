package com.crowdin.client.core.http.impl.json;

public class GeneratedParseExportOptions {

    private JacksonJsonTransformer jsonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseExportOptions() {
        String json = "{\"language\":\"en\",\"exportFormat\":\"csv\"}";
        ExportOptions expectedOptions = new ExportOptions("en", ExportOptions.ExportFormat.CSV);
        assertSame(expectedOptions, jsonJsonTransformer.parse(json, ExportOptions.class));
    }

}