package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.Locale;

public class GeneratedTestAppendKeyValEmpty {

    @Test
    public void testAppendKeyValEmpty() {
        String inputString = "";
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        assertEquals("", urlBuilder.appendKeyVal(""));
    }

}