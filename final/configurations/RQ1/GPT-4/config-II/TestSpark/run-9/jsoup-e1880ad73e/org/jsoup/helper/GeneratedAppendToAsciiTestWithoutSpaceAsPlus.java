package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendToAsciiTestWithoutSpaceAsPlus {

    @Test
    public void appendToAsciiTestWithoutSpaceAsPlus() throws Exception {
        URL inputUrl = new URL("http://test.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("test + char", false, sb);
        assertEquals("test%20+%20char", sb.toString());
    }

}