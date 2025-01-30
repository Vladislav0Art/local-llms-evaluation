package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.HttpBadRequestException;
import com.crowdin.client.core.http.exceptions.HttpException;
import com.crowdin.client.projectsgroups.model.Project;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    private final JacksonJsonTransformer transformer = new JacksonJsonTransformer();

    @Test
    public void parseHttpExceptionClassTest() {
        String json = "{\"message\": \"Bad Request\"}";
        HttpException parsedObj = transformer.parse(json, HttpException.class);
        Assert.assertNotNull(parsedObj);
        Assert.assertEquals("Bad Request", parsedObj.getMessage());
    }

    @Test
    public void parseHttpBadRequestExceptionClassTest() {
        String json = "{\"message\": \"Bad Request\"}";
        HttpBadRequestException parsedObj = transformer.parse(json, HttpBadRequestException.class);
        Assert.assertNotNull(parsedObj);
        Assert.assertEquals("Bad Request", parsedObj.getMessage());
    }

    @Test
    public void parseInvalidJsonTest() {
        String json = "{\"key\": \"invalid date\"}";
        transformer.parse(json, Project.class);
    }

    @Test
    public void parseValidJsonTest() {
        String json = "{\"key\": \"valid\"}";
        TestClass parsedObj = transformer.parse(json, TestClass.class);
        Assert.assertNotNull(parsedObj);
        Assert.assertEquals("valid", parsedObj.getKey());
    }

    @Test
    public void convertTest() {
        TestClass object = new TestClass();
        object.setKey("valid");
        String convertedString = transformer.convert(object);
        Assert.assertTrue(convertedString.contains("\"key\":\"valid\""));
    }

    public static class TestClass {

        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

}