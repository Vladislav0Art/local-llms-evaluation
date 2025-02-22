package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("test value", true, sb);
        assertEquals("test+value", sb.toString());
    }

}