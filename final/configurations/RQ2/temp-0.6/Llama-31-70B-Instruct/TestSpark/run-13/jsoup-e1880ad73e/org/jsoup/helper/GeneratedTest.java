package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.net.URL;
import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildWithValidUrl() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com/path?query=value&query2=value2#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.example.com/path?query%3Dvalue%26query2%3Dvalue2#fragment");
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

    @Test
    public void appendKeyValWithValidKeyVal() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com/path");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL expectedUrl = new URL("https://www.example.com/path?key%3Dvalue");
        URL actualUrl = urlBuilder.build();
        assertEquals(expectedUrl, actualUrl);
    }

}