package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseJsonValidInputTest() {
        String json = "{\"name\":\"test.pdf\"}";
        FileInfo fileInfo = transformer.parse(json, FileInfo.class);
        assertEquals("test.pdf", fileInfo.getName());
    }

    @Test
    public void parseJsonThrowExceptionTest() {
        String json = "{\"invalid name\":\"test.pdf\"}";
        assertThrows(CrowdinApiException.class, () -> transformer.parse(json, FileInfo.class));
    }

    @Test
    public void convertObjectValidInputTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName("test.pdf");
        String expectedJson = "{\"name\":\"test.pdf\"}";
        String actualJson = transformer.convert(fileInfo);
        assertEquals(expectedJson, actualJson);
    }

    @Test
    public void convertObjectRaiseExceptionTest() {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName(null);
        assertThrows(HttpException.class, () -> transformer.convert(fileInfo));
    }

}