package org.jsoup.helper;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderConstructorNullUrlTest() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL buildUrl = urlBuilder.build();

        Assert.assertEquals(inputUrl, buildUrl);
    }

    @Test
    public void appendKeyValNullTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        urlBuilder.appendKeyVal(null);

        URL buildUrl = urlBuilder.build();

        Assert.assertEquals(inputUrl, buildUrl);
    }

    @Test
    public void appendKeyValValidKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        Connection.KeyVal keyVal = new Connection.KeyVal("key", "val");
        urlBuilder.appendKeyVal(keyVal);

        URL buildUrl = urlBuilder.build();

        Assert.assertEquals(new URL("http://example.com?key=val"), buildUrl);
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Testing with key value pair that throws UnsupportedEncodingException
        Connection.KeyVal keyVal = new Connection.KeyVal("\u0000", "\u0000");
        urlBuilder.appendKeyVal(keyVal);
    }

}