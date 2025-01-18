package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void parseJsonToNullClassTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();
        String json = "{\"name\":\"test\"}";

        jtf.parse(json, null);
    }

    @Test
    public void convertNullObjToJsonTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();

        jtf.convert(null);
    }

    private static class TestClass {
        public String name;
    }

}