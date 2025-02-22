package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void build() throws MalformedURLException, UnsupportedEncodingException, URISyntaxException {
        URL inputUrl = new URL("http://www.example.com/path/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();

        assertEquals("http://www.example.com/path/", result.toString());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/path/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        builder.appendKeyVal(kv);

        assertEquals("?key=value", builder.q.toString());
    }

    @Test
    public void appendToAscii() throws UnsupportedEncodingException {
        String input = "abc";
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii(input, false, sb);

        assertEquals("abc", sb.toString());
    }

    @Test
    public void appendToAscii_withSpace() throws UnsupportedEncodingException {
        String input = "a bc";
        StringBuilder sb = new StringBuilder();

        UrlBuilder.appendToAscii(input, false, sb);

        assertEquals("a%20bc", sb.toString());
    }

}