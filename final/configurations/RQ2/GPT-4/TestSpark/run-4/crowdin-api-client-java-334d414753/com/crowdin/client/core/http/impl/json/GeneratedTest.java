package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void parseNullJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        try {
            transformer.parse(null, Object.class);
            fail("Expected CrowdinApiException to be thrown");
        } catch (CrowdinApiException e) {
            assertTrue(e.getMessage().contains("Argument 'json' is null"));
        }
    }

    @Test
    public void parseEmptyJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        try {
            transformer.parse("", Object.class);
            fail("Expected CrowdinApiException to be thrown");
        } catch (CrowdinApiException e) {
            assertTrue(e.getMessage().contains("Failed to parse JSON"));
        }
    }

    @Test
    public void parseValidJsonTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        Object result = transformer.parse("{}", Object.class);
        assertNotNull(result);
    }

    @Test
    public void parseNullClassTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        try {
            transformer.parse("{}", null);
            fail("Expected CrowdinApiException to be thrown");
        } catch (CrowdinApiException e) {
            assertTrue(e.getMessage().contains("Argument 'clazz' is null"));
        }
    }

    @Test
    public void convertNullObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        try {
            transformer.convert(null);
            fail("Expected CrowdinApiException to be thrown");
        } catch (CrowdinApiException e) {
            assertTrue(e.getMessage().contains("Argument 'obj' is null"));
        }
    }

    @Test
    public void convertValidObjectTest() {
        JacksonJsonTransformer transformer = new JacksonJsonTransformer();
        String result = transformer.convert(new Object());
        assertNotNull(result);
    }

}