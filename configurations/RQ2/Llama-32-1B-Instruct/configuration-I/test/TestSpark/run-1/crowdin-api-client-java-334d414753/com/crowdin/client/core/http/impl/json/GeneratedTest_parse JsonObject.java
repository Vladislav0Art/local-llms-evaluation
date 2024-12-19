package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformationException;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parse JsonObject {

    @Test
    public void test_parse

    JsonObject() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"key\":\"value\"}";
        Object parsedObject = jsonTransformer.parse(jsonString, String.class);
        assertEquals("value", (String) parsedObject);
    }

}