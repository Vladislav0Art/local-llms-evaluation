package com.crowdin.client.core.http.impl.json;

import com.crowdin.client.core.http.exceptions.CrowdinApiException;
import com.crowdin.client.core.http.impl.json.JacksonJsonTransformer;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseNullJsonTest {

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

}