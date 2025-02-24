package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.jsoup.Connection.KeyVal;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL actualUrl = builder.build();
        assertEquals("http://www.example.com", actualUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        KeyVal kv = new KeyVal("key", "value");
        builder.appendKeyVal(kv);
        URL actualUrl = builder.build();
        assertEquals("http://www.example.com?key=value", actualUrl.toString());
    }

}