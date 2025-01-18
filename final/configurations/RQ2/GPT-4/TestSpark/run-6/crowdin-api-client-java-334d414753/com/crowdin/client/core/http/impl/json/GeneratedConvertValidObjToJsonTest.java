package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedConvertValidObjToJsonTest {

    @Test
    public void convertValidObjToJsonTest() {
        JacksonJsonTransformer jtf = new JacksonJsonTransformer();
        TestClass testClass = new TestClass();
        testClass.name = "test";

        String json = jtf.convert(testClass);

        Assert.assertNotNull(json);
        Assert.assertEquals("{\"name\":\"test\"}", json);
    }

}