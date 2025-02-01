package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseHttpBadRequestExceptionTest {

    @Test
    public void parseHttpBadRequestExceptionTest() throws JsonProcessingException {
        ObjectMapper errorObjectMapper = new ObjectMapper();
        errorObjectMapper.registerModule(new AfterburnerModule());
        String json = "{\"message\" : \"Testing Bad Request\"}";

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        HttpBadRequestException result = jacksonJsonTransformer.parse(json, HttpBadRequestException.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HttpBadRequestException);
        Assert.assertEquals("Testing Bad Request", result.getMessage());
    }

}