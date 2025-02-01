package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseHttpExceptionTest {

    @Test
    public void parseHttpExceptionTest() throws JsonProcessingException {
        ObjectMapper errorObjectMapper = new ObjectMapper();
        errorObjectMapper.registerModule(new AfterburnerModule());
        String json = "{\"message\" : \"Testing\"}";

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        HttpException result = jacksonJsonTransformer.parse(json, HttpException.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof HttpException);
        Assert.assertEquals("Testing", result.getMessage());
    }

}