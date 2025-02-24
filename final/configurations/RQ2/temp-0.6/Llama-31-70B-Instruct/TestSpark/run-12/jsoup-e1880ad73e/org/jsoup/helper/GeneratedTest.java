package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void buildNoEncodedQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertNotNull(builtUrl);
        assertEquals("http://www.example.com/", builtUrl.toString());
    }

    @Test
    public void buildEncodedQueryTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.example.com/?a=123&b=456");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
        assertNotNull(builtUrl);
        assertEquals("http://www.example.com/?a=123&b=456", builtUrl.toString());
    }

    @Test
    public void buildInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL builtUrl = builder.build();
    }

}