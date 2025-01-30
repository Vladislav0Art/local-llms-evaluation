package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private final JacksonJsonTransformer underTest = new JacksonJsonTransformer();

    private final Random rand = new Random();

    @Test
    public void parseHttpExceptionClassTest() throws Exception {
        String json = "{}";

        HttpException result = underTest.parse(json, HttpException.class);

        assertTrue(result instanceof HttpException);
    }

    @Test
    public void parseHttpBadRequestExceptionClassTest() throws Exception {
        String json = "{}";

        HttpBadRequestException result = underTest.parse(json, HttpBadRequestException.class);

        assertTrue(result instanceof HttpBadRequestException);
    }

    @Test
    public void parseInvalidJsonTest() throws Exception {
        String json = "Invalid json";

        underTest.parse(json, HttpException.class);
    }

    @Test
    public void convertHttpExceptionTest() throws Exception {
        HttpException exception = new HttpException();

        String result = underTest.convert(exception);

        assertNotEquals("{}", result.replaceAll("\\s", ""));
    }

    @Test
    public void convertHttpBadRequestExceptionTest() throws Exception {
        HttpBadRequestException exception = new HttpBadRequestException();

        String result = underTest.convert(exception);

        assertNotEquals("{}", result.replaceAll("\\s", ""));
    }

}