package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAppendKeyValEmptyKV {

    @Test
    public void testAppendKeyValEmptyKV() {
        String inputUrl = "https://example.com/path";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        assertFalse(urlBuilder.appendKeyVal("param1", "").equals(""));
        assertTrue(urlBuilder.appendKeyVal("", "").equals(""));
        assertTrue(urlBuilder.appendKeyVal(null, "").equals(""));
        assertNull(urlBuilder.appendKeyVal(null));
    }

}