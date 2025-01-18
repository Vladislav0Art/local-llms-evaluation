package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseInvalidJsonToClassTest {

    @Test
    public void parseInvalidJsonToClassTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();
        String json = "{\"unrecognized\":\"test\"}";

        jtf.parse(json, TestClass.class);
    }

}