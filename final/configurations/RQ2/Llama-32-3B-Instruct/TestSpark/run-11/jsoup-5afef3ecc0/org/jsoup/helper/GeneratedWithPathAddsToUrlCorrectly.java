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

public class GeneratedWithPathAddsToUrlCorrectly {

    @Test
    public void withPathAddsToUrlCorrectly() throws MalformedURLException, URISyntaxException {
        URL inputUrl = new URL("http://example.com");
        String path = "/path/to/resource";
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(Connection.KeyVal("key", "value"));
        assertEquals("http://example.com/path/to/resource?key=value", builder.build().toExternalForm());
    }

}