package com.crowdin.client.core.http.impl.json;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTest {

    @Test
    public void parseNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestClass result = transformer.parse(null, TestClass.class);

        assertNull(result);
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestClass result = transformer.parse("", TestClass.class);

        assertNull(result);
    }

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "{\"testField\":\"testValue\"}";
        TestClass result = transformer.parse(json, TestClass.class);

        assertEquals("testValue", result.getTestField());
    }

    @Test
    public void parseInvalidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String json = "Invalid json";
        transformer.parse(json, TestClass.class);
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(null);

        assertNull(result);
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        TestClass testObject = new TestClass();
        testObject.setTestField("testValue");
        String result = transformer.convert(testObject);

        assertEquals("{\"testField\":\"testValue\"}", result);
    }
}

}