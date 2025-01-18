package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonStringTest {

    @Test
    public void parseInvalidJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidJson = "{\"id\":\"invalid\",\"name\":123}";
        transformer.parse(invalidJson, FileInfo.class);
    }

}