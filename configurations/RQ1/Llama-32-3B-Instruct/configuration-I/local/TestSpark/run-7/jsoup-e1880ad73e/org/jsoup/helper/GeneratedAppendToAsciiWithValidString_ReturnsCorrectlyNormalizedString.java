package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedAppendToAsciiWithValidString_ReturnsCorrectlyNormalizedString {

    @Test
    public void appendToAsciiWithValidString_ReturnsCorrectlyNormalizedString() {
        String s = "Hello World!";
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii(s, true, sb);
        assertEquals("%20", sb.toString());
    }

}