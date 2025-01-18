package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertNullObjToJsonTest {

    @Test
    public void convertNullObjToJsonTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();

        jtf.convert(null);
    }

    private static class TestClass {
        public String name;
    }

}