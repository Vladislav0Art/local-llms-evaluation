package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.core.JsonParseException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.crowdin.client.core.http.impl.json.JsonTransformer;

public class GeneratedParseBadJsonTest {

    @Test
    public void parseBadJsonTest() throws Exception {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "not a json";
        transformer.parse(json, TestObject.class);
    }

}