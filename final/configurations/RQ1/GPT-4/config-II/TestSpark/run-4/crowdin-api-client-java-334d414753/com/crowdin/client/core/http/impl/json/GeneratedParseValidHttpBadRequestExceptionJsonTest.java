package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class GeneratedParseValidHttpBadRequestExceptionJsonTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidHttpBadRequestExceptionJsonTest() throws IOException {
        String json = "{\"request\":{\"method\":\"GET\",\"url\":\"https://api.crowdin.com/api/v3/string-translations\",\"headers\":{\"Authorization\":\"Bearer 1111\"},\"body\":\"{}\"},\"response\":{\"status\":400,\"headers\":{\"Content-Type\":\"application/json; charset=utf-8\"},\"body\":\"{\\\"error\\\":{}}\"}}";
        HttpBadRequestException exception = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);

        assertNotNull(exception);
        assertEquals("GET", exception.getRequest().getMethod());
        assertEquals("https://api.crowdin.com/api/v3/string-translations", exception.getRequest().getUrl());
    }

}