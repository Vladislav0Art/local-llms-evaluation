package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyValReturnsCorrectUrl {

    @Test
    public void appendKeyValReturnsCorrectUrl() {
        String key = "test";
        String value = "value";
        Connection.KeyVal kv = Connection.KeyVal.of(key, value);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertEquals("http://example.com?key=" + URLEncoder.encode(key, java.net.URLEncoder.UTF_8) + "&value=" + URLEncoder.encode(value, java.net.URLEncoder.UTF_8), builder.build().toString());
    }

}