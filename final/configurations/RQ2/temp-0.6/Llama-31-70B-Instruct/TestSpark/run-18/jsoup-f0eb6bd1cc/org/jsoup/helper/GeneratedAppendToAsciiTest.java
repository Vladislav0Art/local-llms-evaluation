package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;

public class GeneratedAppendToAsciiTest {

    // Test for build() method

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("test", false, sb);
        assertEquals("test", sb.toString());
        sb = new StringBuilder();
        UrlBuilder.appendToAscii("test", true, sb);
        assertEquals("test", sb.toString());
        sb = new StringBuilder();
        UrlBuilder.appendToAscii("test", false, sb);
        assertEquals("test", sb.toString());
    }

}