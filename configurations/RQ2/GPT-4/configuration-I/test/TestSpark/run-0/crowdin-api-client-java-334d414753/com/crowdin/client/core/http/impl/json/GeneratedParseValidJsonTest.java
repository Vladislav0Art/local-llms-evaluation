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

public class GeneratedParseValidJsonTest {

    @Test
    public void parseValidJsonTest() throws Exception {
        String json = "{\"key\":\"value\"}";
        Class<HashMap> clazz = HashMap.class;

        JacksonJsonTransformer jacksonJsonTransformer = new JacksonJsonTransformer();
        HashMap<String, String> map = jacksonJsonTransformer.parse(json, clazz);

        assertTrue(map.containsKey("key"));
        assertEquals("value", map.get("key"));
    }

}