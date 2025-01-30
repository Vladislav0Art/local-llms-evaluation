package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseCrowdinApiExceptionClassTest {

    private final JacksonJsonTransformer underTest = new JacksonJsonTransformer();

    @Test
    public void parseCrowdinApiExceptionClassTest() throws Exception {
        String json = "{\"message\":\"Test\"}";

        CrowdinApiException result = underTest.parse(json, CrowdinApiException.class);

        assertTrue(result instanceof CrowdinApiException);
        assertEquals("Test", result.getMessage());
    }

}