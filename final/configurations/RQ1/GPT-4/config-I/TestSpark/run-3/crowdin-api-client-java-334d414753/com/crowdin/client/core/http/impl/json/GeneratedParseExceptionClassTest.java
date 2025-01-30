package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseExceptionClassTest {

    private JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseExceptionClassTest() throws JsonProcessingException {
        String json = "{\"message\":\"Exception message\"}";
        HttpException exception = transformer.parse(json, HttpException.class);

        Assert.assertEquals("Exception message", exception.getMessage());
    }

}