package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildUrlEncodingTest {

    private UrlBuilder urlBuilder;

    @Test
    public void buildUrlEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/");
        urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("UTF-8", "key", "value with space", false);
        urlBuilder.appendKeyVal(kv);
        URL actualUrl = urlBuilder.build();
        URL expectedUrl = new URL("http://www.example.com/?key=value%20with%20space");
        assertEquals(expectedUrl, actualUrl);
    }

}