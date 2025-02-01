package com.crowdin.client.core.http.impl.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;
import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.sourcefiles.model.FileInfo;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class GeneratedTest {


    JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

    @Test
    public void parseValidHttpExceptionJsonTest() throws IOException {
        String json = "{\"request\":{\"method\":\"GET\",\"url\":\"https://api.crowdin.com/api/v3/string-translations\",\"headers\":{\"Authorization\":\"Bearer 1111\"},\"body\":\"{}\"},\"response\":{\"status\":200,\"headers\":{\"Content-Type\":\"application/json; charset=utf-8\"},\"body\":\"{\\\"error\\\":{}}\"}}";
        HttpException httpException = jacksonJsonTransformer.parse(json, HttpException.class);

        assertNotNull(httpException);
        assertEquals("GET", httpException.getRequest().getMethod());
        assertEquals("https://api.crowdin.com/api/v3/string-translations", httpException.getRequest().getUrl());
    }

    @Test
    public void parseInvalidHttpExceptionJsonTest() throws IOException {
        String invalidJson = "{\"request\":{\"message\":\"Not a valid HTTP Exception\"}}";
        jacksonJsonTransformer.parse(invalidJson, HttpException.class);
    }

    @Test
    public void parseValidHttpBadRequestExceptionJsonTest() throws IOException {
        String json = "{\"request\":{\"method\":\"GET\",\"url\":\"https://api.crowdin.com/api/v3/string-translations\",\"headers\":{\"Authorization\":\"Bearer 1111\"},\"body\":\"{}\"},\"response\":{\"status\":400,\"headers\":{\"Content-Type\":\"application/json; charset=utf-8\"},\"body\":\"{\\\"error\\\":{}}\"}}";
        HttpBadRequestException exception = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);

        assertNotNull(exception);
        assertEquals("GET", exception.getRequest().getMethod());
        assertEquals("https://api.crowdin.com/api/v3/string-translations", exception.getRequest().getUrl());
    }

    @Test
    public void parseInvalidHttpBadRequestExceptionJsonTest() throws IOException {
        String invalidJson = "{\"request\":{\"message\":\"Not a valid HTTP Bad Request Exception\"}}";
        jacksonJsonTransformer.parse(invalidJson, HttpBadRequestException.class);
    }

    @Test
    public void parseValidJsonWithOtherClassTest() throws IOException {
        String json = "{\"id\":\"123\",\"path\":\"/test.txt\",\"project_id\":\"1234\",\"branch_id\":null,\"directory_id\":\"4321\",\"name\":\"test\",\"title\":\"Test File\",\"created_at\":\"2021-08-26T09:18:21+00:00\",\"updated_at\":\"2021-08-26T09:18:21+00:00\"}";
        FileInfo fileInfo = jacksonJsonTransformer.parse(json, FileInfo.class);

        assertNotNull(fileInfo);
        assertEquals("123", fileInfo.getId());
        assertEquals("/test.txt", fileInfo.getPath());
    }

    @Test
    public void parseInvalidJsonWithOtherClassTest() throws IOException {
        String invalidJson = "{\"message\":\"Not a valid FileInfo\"}";
        jacksonJsonTransformer.parse(invalidJson, FileInfo.class);
    }

    @Test
    public void convertTest() throws IOException {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setId("123");
        fileInfo.setPath("/test.txt");
        fileInfo.setProject_id("1234");
        String json = jacksonJsonTransformer.convert(fileInfo);

        assertNotNull(json);
        assertEquals("{\"id\":\"123\",\"path\":\"/test.txt\",\"project_id\":\"1234\"}", json);
    }

}