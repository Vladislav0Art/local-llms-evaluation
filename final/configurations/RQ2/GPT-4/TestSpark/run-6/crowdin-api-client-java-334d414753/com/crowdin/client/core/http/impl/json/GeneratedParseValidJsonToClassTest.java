package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseValidJsonToClassTest {

    @Test
    public void parseValidJsonToClassTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();
        String json = "{\"name\":\"test\"}";

        TestClass testClass = jtf.parse(json, TestClass.class);

        Assert.assertNotNull(testClass);
        Assert.assertEquals("test", testClass.name);
    }

}