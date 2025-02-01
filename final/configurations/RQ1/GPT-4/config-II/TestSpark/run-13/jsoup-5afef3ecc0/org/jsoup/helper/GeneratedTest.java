package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;

public class GeneratedTest {

    @Test
    public void buildProperURLTest() throws MalformedURLException, URISyntaxException {
        URL url = new URL("http://abc.com?query=value");
        UrlBuilder builder = new UrlBuilder(url);

        URL resultURL = builder.build();

        Assert.assertEquals(new URL("http://abc.com/?query=value"), resultURL);
    }

    @Test
    public void buildImproperURLTest() throws MalformedURLException {
        URL url = new URL("http:/abc.com?query=value");
        UrlBuilder builder = new UrlBuilder(url);

        URL resultURL = builder.build();

        Assert.assertEquals(url, resultURL);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://abc.com?query=value");
        UrlBuilder builder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Connection.KeyVal.create("test_key", "test_value");

        builder.appendKeyVal(keyVal);

        Assert.assertEquals("http://abc.com/?query=value&test_key=test_value", builder.build().toString());
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws MalformedURLException {
        URL url = new URL("http://abc.com?query=value%E5");
        new UrlBuilder(url).build();
    }

    @Test
    public void normalizeQueryTest() throws MalformedURLException {
        URL url = new URL("http://abc.com?query=value+encoded");
        UrlBuilder builder = new UrlBuilder(url);

        Assert.assertEquals("http://abc.com/?query=value%2Bencoded", builder.build().toString());
    }

    @Test
    public void normalizeRefTest() throws MalformedURLException {
        URL url = new URL("http://abc.com?query=value#reference");
        UrlBuilder builder = new UrlBuilder(url);

        Assert.assertEquals("http://abc.com/?query=value#reference", builder.build().toString());
    }

}