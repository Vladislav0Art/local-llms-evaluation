package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.assertEquals;

public class GeneratedAppendToAsciiTest {

    @Test
    public void appendToAsciiTest() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        String s = "http://example.com/";
        boolean spaceAsPlus = false;
        UrlBuilder.appendToAscii(s, spaceAsPlus, sb);
        assertEquals("http%3A%2F%2Fexample.com%2F", sb.toString());
    }

}