package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws Exception {
        URL inputUrl = new URL("http://test.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("test + char", true, sb);
        assertEquals("test+%20char", sb.toString());
    }

}