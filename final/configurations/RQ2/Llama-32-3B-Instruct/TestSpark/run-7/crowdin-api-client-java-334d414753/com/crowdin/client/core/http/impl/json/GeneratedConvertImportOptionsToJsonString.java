package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedConvertImportOptionsToJsonString {

    @Test
    public void convertImportOptionsToJsonString() {
        ImportOptions options = new ImportOptions();
        options.setFormat("CSV");
        options.setEncoding("ISO-8859-1");

        ObjectMapper mapper = new ObjectMapper();

        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(options);
        assertEquals("{\"format\":\"CSV\",\"encoding\":\"ISO-8859-1\"}", result);
    }

}