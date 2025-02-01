package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedConvertTestObjectTest {

    @Test
    public void convertTestObjectTest() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new AfterburnerModule());
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        TestObject obj = new TestObject("Test", 123);

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();

        String result = jacksonJsonTransformer.convert(obj);

        Assert.assertNotNull(result);
        Assert.assertEquals("{\"name\":\"Test\",\"id\":123}", result);
    }

}