package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderInvalidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("htt://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void UrlBuilderValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        final String expectedUrl = "http://www.google.com";
        UrlBuilder builder = new UrlBuilder(new URL(expectedUrl));
        URL actualUrl = builder.build();
        Assert.assertEquals(expectedUrl, actualUrl.toString());
    }

    @Test
    public void buildNullUrlTest() {
        UrlBuilder builder = new UrlBuilder(null);
        builder.build();
    }

    @Test
    public void appendKeyValValidTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(Connection.KeyVal.create("key", "value"));
        URL actualUrl = builder.build();
        Assert.assertTrue(actualUrl.toString().contains("key=value"));
    }

    @Test
    public void appendKeyValNullTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.google.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(null);
    }

}