package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private static final String TEST_URL = "http://example.com/path?key1=val1&key2=val2";

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL(TEST_URL);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        URL actualUrl = builder.build();
        assertEquals(TEST_URL, actualUrl.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL inputUrl = new URL(TEST_URL);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key3", "val3");
        builder.appendKeyVal(kv);

        URL actualUrl = builder.build();
        assertEquals("http://example.com/path?key1=val1&key2=val2&key3=val3", actualUrl.toString());
    }

    @Test
    public void appendKeyValExceptionTest() throws Exception {
        URL inputUrl = new URL(TEST_URL);
        UrlBuilder builder = new UrlBuilder(inputUrl);

        Connection.KeyVal kv = new Connection.KeyVal("key3", "val3");
        builder.appendKeyVal(kv);

        // This should throw an UnsupportedEncodingException
        builder.appendKeyVal(null);
    }

}