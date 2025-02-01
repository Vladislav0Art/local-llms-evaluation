package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class GeneratedParseValidHttpExceptionJsonTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidHttpExceptionJsonTest() throws IOException {
        String json = "{\"request\":{\"method\":\"GET\",\"url\":\"https://api.crowdin.com/api/v3/string-translations\",\"headers\":{\"Authorization\":\"Bearer 1111\"},\"body\":\"{}\"},\"response\":{\"status\":200,\"headers\":{\"Content-Type\":\"application/json; charset=utf-8\"},\"body\":\"{\\\"error\\\":{}}\"}}";
        HttpException httpException = jacksonJsonTransformer.parse(json, HttpException.class);

        assertNotNull(httpException);
        assertEquals("GET", httpException.getRequest().getMethod());
        assertEquals("https://api.crowdin.com/api/v3/string-translations", httpException.getRequest().getUrl());
    }

}