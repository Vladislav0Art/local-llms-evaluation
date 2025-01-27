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

public class GeneratedWithQueryWithNonStringValueAndOtherParamAddsToUrlCorrectly {

    @Test
    public void withQueryWithNonStringValueAndOtherParamAddsToUrlCorrectly() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        Connection.KeyVal kv = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", 123);
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(kv);
        builder.appendKeyVal(kv2);
        assertEquals("http://example.com?key1=value1&key2=123", builder.build().toExternalForm());
    }

}