package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertExportOptionsToJsonString {

    @Test
    public void convertExportOptionsToJsonString() {
        ExportOptions options = new ExportOptions();
        options.setFormat("JSON");
        options.setEncoding("UTF-8");

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(options);
        assertEquals("{\"format\":\"JSON\",\"encoding\":\"UTF-8\"}", result);
    }

}