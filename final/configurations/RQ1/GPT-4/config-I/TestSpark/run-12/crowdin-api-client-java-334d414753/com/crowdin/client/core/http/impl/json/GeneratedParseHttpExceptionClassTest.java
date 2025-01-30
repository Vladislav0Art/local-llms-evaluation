package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseHttpExceptionClassTest {

    private final JacksonJsonTransformer underTest = new JacksonJsonTransformer();

    private final Random rand = new Random();

    @Test
    public void parseHttpExceptionClassTest() throws Exception {
        String json = "{}";

        HttpException result = underTest.parse(json, HttpException.class);

        assertTrue(result instanceof HttpException);
    }

}