package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValEmptyKVAndNull {

    @Test
    public void testAppendKeyValEmptyKVAndNull() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertFalse(urlBuilder.appendKeyVal("param1", "").equals("https://example.com/path"));
        assertTrue(urlBuilder.appendKeyVal(null, "").equals(""));
        assertTrue(urlBuilder.appendKeyVal("", null).equals(""));
        assertNull(urlBuilder.appendKeyVal(null));
    }

}