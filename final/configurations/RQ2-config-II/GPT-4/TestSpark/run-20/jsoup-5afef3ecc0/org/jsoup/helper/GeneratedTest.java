package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildNullTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();

        assertNotNull(url);
        assertEquals("http://example.com", url.toString());
    }

    @Test
    public void buildMalformedTest() throws Exception {
        URL inputUrl = new URL("http:/example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();

        assertEquals("http:/example.com", url.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");

        urlBuilder.appendKeyVal(kv);
        URL url = urlBuilder.build();

        assertEquals("http://example.com?key=value", url.toString());
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\u0021");

        urlBuilder.appendKeyVal(kv);
    }

}