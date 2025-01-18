package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseJsonToNullClassTest {

    @Test
    public void parseJsonToNullClassTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();
        String json = "{\"name\":\"test\"}";

        jtf.parse(json, null);
    }

}