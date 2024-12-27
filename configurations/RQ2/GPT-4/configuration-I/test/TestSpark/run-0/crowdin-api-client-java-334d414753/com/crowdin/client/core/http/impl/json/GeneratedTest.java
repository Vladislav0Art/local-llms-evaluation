package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void parseValidJsonTest() throws Exception {
        String json = "{\"key\":\"value\"}";
        Class<HashMap> clazz = HashMap.class;

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HashMap<String, String> map = jacksonJsonTransformer.parse(json, clazz);

        assertTrue(map.containsKey("key"));
        assertEquals("value", map.get("key"));
    }

    @Test
    public void parseInvalidJsonTest() {
        String json = "invalid json";
        Class<HashMap> clazz = HashMap.class;

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        jacksonJsonTransformer.parse(json, clazz);
    }

    @Test
    public void convertNotNullObjectTest() throws JsonProcessingException {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");

        ObjectMapper mapper = new ObjectMapper();
        String expectedJson = mapper.writeValueAsString(map);

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        String json = jacksonJsonTransformer.convert(map);

        assertEquals(expectedJson, json);
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        jacksonJsonTransformer.convert(null);
    }

}