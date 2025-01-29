package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValNoSpaces {

    @Test
    public void testAppendKeyValNoSpaces() {
        String key = "";
        String value = "value";
        assertEquals("?!" + key + "=" + value, new UrlBuilder(key, value).appendKeyVal(key, value));
    }

}