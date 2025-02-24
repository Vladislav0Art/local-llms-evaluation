package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void buildUrlWithInputUrlTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("http://www.example.com");

        assertEquals(expectedUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyValWithValidKeyValTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        String expectedValue = "value";

        urlBuilder.appendKeyVal(kv);

        assertEquals(expectedValue, kv.getValue());
    }

    @Test
    public void appendKeyValWithInvalidKeyValTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("key", "");

        urlBuilder.appendKeyVal(kv);
    }

}