package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedWithQueryWithSameKeyAddsToUrlCorrectly {

    @Test
    public void withQueryWithSameKeyAddsToUrlCorrectly() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key1", "value2");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(kv1);
        builder.appendKeyVal(kv2);
        assertEquals("http://example.com?key1=value1&key1=value2", builder.build().toExternalForm());
    }

}