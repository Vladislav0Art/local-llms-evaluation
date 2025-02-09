package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonTest() {
        String json = "{\"id\":1, \"name\":\"foo.txt\"}";
        FileInfo result = transformer.parse(json, FileInfo.class);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.getId().intValue());
        Assert.assertEquals("foo.txt", result.getName());
    }

}