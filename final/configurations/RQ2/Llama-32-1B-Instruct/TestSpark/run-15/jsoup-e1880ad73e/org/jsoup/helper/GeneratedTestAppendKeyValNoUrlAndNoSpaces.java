package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestAppendKeyValNoUrlAndNoSpaces {

    @Test
    public void testAppendKeyValNoUrlAndNoSpaces() {
        String key = "";
        String value = "value";
        assertEquals("?!" + key + "=" + value, new UrlBuilder(key, value).appendKeyVal(key, value));
    }

}