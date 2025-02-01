package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class GeneratedParseInvalidHttpBadRequestExceptionJsonTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseInvalidHttpBadRequestExceptionJsonTest() throws IOException {
        String invalidJson = "{\"request\":{\"message\":\"Not a valid HTTP Bad Request Exception\"}}";
        jacksonJsonTransformer.parse(invalidJson, HttpBadRequestException.class);
    }

}