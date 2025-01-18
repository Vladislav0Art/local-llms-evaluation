package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertInvalidObjectToStringTest {

    @Test
    public void convertInvalidObjectToStringTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String invalidObject = "invalidObject";
        transformer.convert(invalidObject);
    }

}