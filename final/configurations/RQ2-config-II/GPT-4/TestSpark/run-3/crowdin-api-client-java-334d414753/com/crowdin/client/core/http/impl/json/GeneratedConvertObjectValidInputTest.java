package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedConvertObjectValidInputTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertObjectValidInputTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("test.pdf");
        String expectedJson = "{\"name\":\"test.pdf\"}";
        String actualJson = transformer.convert(fileInfo);
        assertEquals(expectedJson, actualJson);
    }

}