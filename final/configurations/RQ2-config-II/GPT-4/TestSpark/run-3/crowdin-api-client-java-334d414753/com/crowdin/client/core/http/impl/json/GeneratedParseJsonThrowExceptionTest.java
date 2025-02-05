package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedParseJsonThrowExceptionTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonThrowExceptionTest() {
        String json = "{\"invalid name\":\"test.pdf\"}";
        assertThrows(CrowdinApiException.class, () -> transformer.parse(json, FileInfo.class));
    }

}