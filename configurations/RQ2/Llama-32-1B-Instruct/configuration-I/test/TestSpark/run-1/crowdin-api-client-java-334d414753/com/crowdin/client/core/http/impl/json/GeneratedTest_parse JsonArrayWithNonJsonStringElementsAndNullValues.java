package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.crowdin.client.core.http.impl.json.JsonTransformationException;
import org.junit.jupiter.api.Test;

public class GeneratedTest_parse JsonArrayWithNonJsonStringElementsAndNullValues {

    @Test
    public void test_parse

    JsonArrayWithNonJsonStringElementsAndNullValues() {
        JacksonJsonTransformer jsonTransformer = new JacksonJsonTransformer();
        String jsonString = "[1, 2, null, [3, 4]]";
        Object parsedObject = jsonTransformer.parse(jsonString, int.class);
        assertEquals(4, (int) parsedObject);
    }

}