package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseValidJsonTest() {
        String json = "{\"key\": \"valid\"}";
        TestClass parsedObj = transformer.parse(json, TestClass.class);
        Assert.assertNotNull(parsedObj);
        Assert.assertEquals("valid", parsedObj.getKey());
    }

}