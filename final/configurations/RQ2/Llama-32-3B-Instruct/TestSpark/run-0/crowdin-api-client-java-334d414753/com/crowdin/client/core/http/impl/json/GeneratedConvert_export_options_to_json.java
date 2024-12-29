package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedConvert_export_options_to_json {

    @Test
    public void convert_export_options_to_json() {
        ExportOptions exportOptions = new ExportOptions(1, 2);
        String expected = "{\"exportOptions\":{\"folderId\":" + 1 + ",\"sourceFileId\":" + 2 + "}}";
        assertEquals(expected, JacksonJsonTransformer.convert(exportOptions).toString());
    }

}