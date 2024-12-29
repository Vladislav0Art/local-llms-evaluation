package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

public class GeneratedParse_json_to_export_options {

    @Test
    public void parse_json_to_export_options() {
        String json = "{\"exportOptions\":{\"folderId\":1,\"sourceFileId\":2}}";
        ExportOptions expected = new ExportOptions(1, 2);
        assertEquals(expected, JacksonJsonTransformer.parse(json, ExportOptions.class));
    }

}