package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedConvertTest {

    private final JacksonJsonTransformer underTest = new JacksonJsonTransformer();

    @Test
    public void convertTest() throws Exception {
        CrowdinApiException exception = new CrowdinApiException("Test");

        String result = underTest.convert(exception);

        assertEquals("{\"message\":\"Test\"}", result.replaceAll("\\s", ""));
    }

}