package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonStringTest {

    @Test
    public void parseValidJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"id\":1,\"name\":\"Test\"}";
        FileInfo fileInfo = transformer.parse(validJson, FileInfo.class);
        Assert.assertNotNull(fileInfo);
        Assert.assertEquals(Long.valueOf(1), fileInfo.getId());
        Assert.assertEquals("Test", fileInfo.getName());
    }

}