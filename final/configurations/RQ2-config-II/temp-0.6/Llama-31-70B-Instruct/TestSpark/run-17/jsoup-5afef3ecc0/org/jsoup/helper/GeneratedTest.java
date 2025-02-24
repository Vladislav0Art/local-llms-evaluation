package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    // Tests for the build() method

    @Test
    public void build_ValidUrl() throws Exception {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL actualUrl = urlBuilder.build();
        assertEquals("https://www.example.com", actualUrl.toString());
    }

    @Test
    public void build_InvalidUrl() throws Exception {
        URL inputUrl = new URL("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build(); // throws MalformedURLException
    }

    @Test
    public void appendKeyVal_ValidKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        KeyVal keyVal = new KeyVal("key", "value", false);
        urlBuilder.appendKeyVal(keyVal);
        assertEquals("https://www.example.com?key=value", urlBuilder.build().toString());
    }

}