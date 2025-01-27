package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

import java.io.IOException;
import java.util.Date;

public class GeneratedConvertExportOptions_ExportOptionsTest {

    @Test
    public void convertExportOptions_ExportOptionsTest() throws IOException {
        ExportOptions options = new ExportOptions();
        options.setFormat("json");
        String json = JacksonJsonTransformer.convert(options);
        assertNotNull(json);
        assertTrue(json.contains("\"format\":\"json\""));
    }

}