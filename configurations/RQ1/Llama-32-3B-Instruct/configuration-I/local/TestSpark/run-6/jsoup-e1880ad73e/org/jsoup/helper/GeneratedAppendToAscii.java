package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GeneratedAppendToAscii {

    @Test
    public void appendToAscii() {
        StringBuilder sb = new StringBuilder();
        String s = "äoth";
        UrlBuilder.builder.appendToAscii(s, true, sb);
        assertEquals("%e0th", sb.toString());
    }

}