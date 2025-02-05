package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderMalformedURLTest() throws MalformedURLException {
        new UrlBuilder(new URL("htp://malformed.com"));
    }

    @Test
    public void UrlBuilderValidURLTest() throws MalformedURLException {
        URL url = new URL("http://validurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertEquals(urlBuilder.build(), url);
    }

    @Test
    public void buildFromInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("htp://malformed.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        urlBuilder.build();
    }

    @Test
    public void buildFromValidUrlTest() throws MalformedURLException {
        URL url = new URL("http://validurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals(url, builtUrl);
    }

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://validurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        String builtUrl = urlBuilder.build().toString();
        Assert.assertTrue(builtUrl.contains("key=value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL url = new URL("http://validurl.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\uD800\uDC00");
        urlBuilder.appendKeyVal(kv);
    }

}