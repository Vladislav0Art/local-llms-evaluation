package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertHttpExceptionTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void convertHttpExceptionTest() throws JsonProcessingException {
        HttpException exception = new HttpException("Exception message");
        String json = transformer.convert(exception);

        Assert.assertEquals("{\"message\":\"Exception message\"}", json);
    }

}