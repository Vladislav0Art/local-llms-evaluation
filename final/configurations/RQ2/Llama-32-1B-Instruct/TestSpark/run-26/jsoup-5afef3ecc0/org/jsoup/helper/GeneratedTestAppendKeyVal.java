package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyVal {

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String inputUrl = "https://example.com";
        URL parsedUrl = new URL(inputUrl);
        assertEquals("https://example.com", UrlBuilder.build(parsedUrl).toString());

        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertTrue(urlBuilder.appendKeyVal(null) == null);

        String key = "key";
        String value = "value";
        assertNull(urlBuilder.appendKeyVal(java.util.Map.Entry.<String, String>of(key, value)));
    }

}