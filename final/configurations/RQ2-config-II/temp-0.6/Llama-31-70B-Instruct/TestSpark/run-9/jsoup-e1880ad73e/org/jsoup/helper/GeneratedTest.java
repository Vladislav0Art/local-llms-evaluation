package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL result = urlBuilder.build();
        assertEquals("http://example.com/", result.toString());
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=value", urlBuilder.query());
    }

    @Test
    public void appendKeyValWithNullTest() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com/");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = new Connection.KeyVal("key", null);
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("key=", urlBuilder.query());
    }

}