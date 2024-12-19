package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class GeneratedTestBuildUrl_WithInvalidKeyVal {

    private final URLBuilder urlBuilder = new UrlBuilder();

    @Test
    public void testBuildUrl_WithInvalidKeyVal() {
        // Simulate an exception is thrown when appending a key-value pair
        URLBuilder.Result result = null;
        try {
            urlBuilder.appendKeyVal(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
        assertEquals("", result);
    }

}