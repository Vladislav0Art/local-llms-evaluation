package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_NullKeys {

    @Test
    public void testAppendKeyVal_NullKeys() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?"));
        assertNull(urlBuilder.appendKeyVal(null).get());
        assertNull(urlBuilder.appendKeyVal(new org.jsoup.KeyVal()).get());
    }

}