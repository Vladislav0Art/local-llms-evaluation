package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseHttpExceptionClassTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionClassTest() {
        String json = "{\"message\": \"Bad Request\"}";
        HttpException parsedObj = transformer.parse(json, HttpException.class);
        Assert.assertNotNull(parsedObj);
        Assert.assertEquals("Bad Request", parsedObj.getMessage());
    }

}