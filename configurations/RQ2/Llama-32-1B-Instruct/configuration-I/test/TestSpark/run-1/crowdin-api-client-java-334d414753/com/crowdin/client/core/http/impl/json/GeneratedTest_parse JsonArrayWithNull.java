package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformationException;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parse JsonArrayWithNull {

    @Test
    public void test_parse

    JsonArrayWithNull() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(3, (int) parsedObject);
    }

}