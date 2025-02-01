package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParseNonHttpExceptionTest {

    @Test
    public void parseNonHttpExceptionTest() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new AfterburnerModule());
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        String json = "{\"name\" : \"Testing Object\", \"id\" : 123}";

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        TestObject result = jacksonJsonTransformer.parse(json, TestObject.class);

        Assert.assertNotNull(result);
        Assert.assertTrue(result instanceof TestObject);
        Assert.assertEquals("Testing Object", result.getName());
        Assert.assertEquals(123, result.getId());
    }

}