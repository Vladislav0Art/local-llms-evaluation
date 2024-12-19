package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformationException;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parse JsonObjectWithNullValues {

    @Test
    public void test_parse

    JsonObjectWithNullValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "{\"key\":null,\"other\":[1, 2]}";
        Object parsedObject = jsonTransformer.parse(jsonString, String.class);
        assertEquals("value", (String) parsedObject);
    }

}