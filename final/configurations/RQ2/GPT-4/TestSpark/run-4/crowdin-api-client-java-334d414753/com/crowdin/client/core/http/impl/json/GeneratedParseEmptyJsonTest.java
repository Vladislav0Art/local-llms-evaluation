package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseEmptyJsonTest {

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

}