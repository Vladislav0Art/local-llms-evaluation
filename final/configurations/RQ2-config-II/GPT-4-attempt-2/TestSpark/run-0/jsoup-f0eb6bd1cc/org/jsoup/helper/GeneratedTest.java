package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void UrlBuilderInputUrlTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderNullInputUrlTest() {
        new UrlBuilder(null);
    }

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL builtURL = urlBuilder.build();
        assertEquals(builtURL, inputUrl);
    }

    @Test
    public void buildNullUrlTest() throws Exception {
        URL inputUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL builtURL = urlBuilder.build();
        assertEquals(builtURL.toString(), "http://example.com?key=value");
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", new String(new byte[]{(byte) 0xC3, (byte) 0x28}, StandardCharsets.UTF_8));
        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValNullKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(null);
    }

}