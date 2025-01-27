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

public class GeneratedAppendKeyValAppendsKeyAndValueCorrectly {

    @Test
    public void appendKeyValAppendsKeyAndValueCorrectly() throws URISyntaxException {
        String key = "test";
        String value = "value";
        Connection.KeyVal kv = Connection.KeyVal.of(key, value);
        URL url = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(url);
        assertEquals("http://example.com?key=" + URLEncoder.encode(key, java.net.URLEncoder.UTF_8) + "&value=" + URLEncoder.encode(value, java.net.URLEncoder.UTF_8), builder.build().toString());
    }

}