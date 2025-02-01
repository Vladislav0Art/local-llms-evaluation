package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvertExceptionTest {

    @Test
    public void convertExceptionTest() throws JsonProcessingException {
        ObjectMapper objectMapper = Mockito.mock(ObjectMapper.class);
        Mockito.when(objectMapper.writeValueAsString(Mockito.any())).thenThrow(new JsonProcessingException("Test") {
        });
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        jacksonJsonTransformer.setObjectMapper(objectMapper);
        try {
            jacksonJsonTransformer.convert(new TestObject());
            Assert.fail("Exception was not thrown.");
        } catch (RuntimeException e) {
            Assert.assertEquals("java.io.IOException: Test", e.getMessage());
        }
    }
}

}