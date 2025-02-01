package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseExceptionTest {

    @Test
    public void parseExceptionTest() throws JsonProcessingException {
        ObjectMapper errorObjectMapper = Mockito.mock(ObjectMapper.class);
        Mockito.when(errorObjectMapper.readValue(Mockito.anyString(), Mockito.any())).thenThrow(new JsonProcessingException("Test") {
        });

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        jacksonJsonTransformer.setErrorObjectMapper(errorObjectMapper);
        try {
            jacksonJsonTransformer.parse("{}", HttpException.class);
            Assert.fail("Exception was not thrown.");
        } catch (RuntimeException e) {
            Assert.assertEquals("java.io.IOException: Test", e.getMessage());
        }
    }

}