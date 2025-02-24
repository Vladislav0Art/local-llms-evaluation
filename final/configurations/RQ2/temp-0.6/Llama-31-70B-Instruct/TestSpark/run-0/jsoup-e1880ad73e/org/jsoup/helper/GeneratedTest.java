package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    private static final String URL_STRING = "https://www.example.com";
    private static final String KEY = "key";
    private static final String VALUE = "value";

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL resultUrl = urlBuilder.build();
        Assert.assertEquals(inputUrl.toExternalForm(), resultUrl.toExternalForm());
    }

    @Test
    public void buildWithInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("invalid url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal(KEY, VALUE);
        urlBuilder.appendKeyVal(kv);
        Assert.assertTrue(urlBuilder.toString().contains(KEY));
        Assert.assertTrue(urlBuilder.toString().contains(VALUE));
    }

    @Test
    public void appendKeyValWithInvalidKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL(URL_STRING);
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = new Connection.KeyVal("invalid key", "invalid value");
        urlBuilder.appendKeyVal(kv);
    }

}