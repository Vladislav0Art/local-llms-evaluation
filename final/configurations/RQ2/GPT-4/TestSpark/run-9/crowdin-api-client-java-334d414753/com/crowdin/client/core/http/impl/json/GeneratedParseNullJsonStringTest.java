package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseNullJsonStringTest {

    @Test
    public void parseNullJsonStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse(null, FileInfo.class);
    }

}