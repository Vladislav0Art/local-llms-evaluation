package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String validJson = "{\"key\":\"value\"}";
        HashMap<String, String> result = transformer.parse(validJson, HashMap.class);
        Assert.assertEquals("value", result.get("key"));
    }

    @Test
    public void parseNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse(null, HashMap.class);
    }

    @Test
    public void parseNullClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse("{\"key\":\"value\"}", null);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap result = transformer.parse("{}", HashMap.class);
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        transformer.parse("{\"key\":\"value\"}", String.class);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap<String, String> validObject = new HashMap<>();
        validObject.put("key", "value");
        String result = transformer.convert(validObject);
        Assert.assertEquals("{\"key\":\"value\"}", result);
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(null);
        Assert.assertEquals("null", result);
    }

    @Test
    public void convertEmptyObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        HashMap emptyObject = new HashMap();
        String result = transformer.convert(emptyObject);
        Assert.assertEquals("{}", result);
    }

}