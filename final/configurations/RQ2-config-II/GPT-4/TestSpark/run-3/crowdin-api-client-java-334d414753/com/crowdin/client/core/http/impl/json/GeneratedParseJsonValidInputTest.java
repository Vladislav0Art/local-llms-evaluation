package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedParseJsonValidInputTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonValidInputTest() {
        String json = "{\"name\":\"test.pdf\"}";
        FileInfo fileInfo = transformer.parse(json, FileInfo.class);
        assertEquals("test.pdf", fileInfo.getName());
    }

}