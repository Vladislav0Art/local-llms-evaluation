package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection.KeyVal;

import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void buildNullUrlTest() throws URISyntaxException, MalformedURLException {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertNull(url);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException, URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        KeyVal kv = new KeyVal("key", "val", null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();
        assertEquals("http://example.com?key=val", url.toString());
    }

    @Test
    public void appendKeyValTestWithException() throws UnsupportedEncodingException, URISyntaxException, MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        KeyVal kv = new KeyVal("key", "val", null);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(kv);
    }

}