package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void parseValidJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"id\":1,\"name\":\"Test\"}";
        FileInfo fileInfo = transformer.parse(validJson, FileInfo.class);
        Assert.assertNotNull(fileInfo);
        Assert.assertEquals(Long.valueOf(1), fileInfo.getId());
        Assert.assertEquals("Test", fileInfo.getName());
    }

    @Test
    public void parseInvalidJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{\"id\":\"invalid\",\"name\":123}";
        transformer.parse(invalidJson, FileInfo.class);
    }

    @Test
    public void parseEmptyJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String emptyJson = "";
        transformer.parse(emptyJson, FileInfo.class);
    }

    @Test
    public void parseNullJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse(null, FileInfo.class);
    }

    @Test
    public void convertValidObjectToStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId(Long.valueOf(1));
        fileInfo.setName("Test");
        String json = transformer.convert(fileInfo);
        Assert.assertEquals("{\"id\":1,\"name\":\"Test\"}", json);
    }

    @Test
    public void convertInvalidObjectToStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidObject = "invalidObject";
        transformer.convert(invalidObject);
    }

    @Test
    public void convertNullObjectToStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.convert(null);
    }

}