package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws MalformedURLException, java.io.UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path?param1=value1");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("param2", "value2");
        urlBuilder.appendKeyVal(kv);
        assertEquals("Query should append new key-value pair.", "param1=value1&param2=value2", urlBuilder.q.toString());
    }

}