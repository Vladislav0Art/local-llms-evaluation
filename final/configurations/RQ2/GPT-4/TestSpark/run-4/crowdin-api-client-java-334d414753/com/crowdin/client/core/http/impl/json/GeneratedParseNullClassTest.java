package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseNullClassTest {

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

}