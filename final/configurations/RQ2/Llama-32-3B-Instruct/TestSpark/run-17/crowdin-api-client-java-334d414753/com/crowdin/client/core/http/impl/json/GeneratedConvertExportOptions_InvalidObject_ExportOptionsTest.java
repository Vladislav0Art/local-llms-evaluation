package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;

import java.io.IOException;
import java.util.Date;

public class GeneratedConvertExportOptions_InvalidObject_ExportOptionsTest {

    @Test
    public void convertExportOptions_InvalidObject_ExportOptionsTest() throws IOException {
        assertThrows(CrowdinApiException.class, () -> JacksonJsonTransformer.convert(new Object()));
    }

}