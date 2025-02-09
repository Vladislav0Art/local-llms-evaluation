package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void buildWhenUrlHasAllParametersTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com?page=2"));

        URL builtUrl = urlBuilder.build();

        Assert.assertNotNull(builtUrl);
        Assert.assertEquals("http://www.example.com?page=2", builtUrl.toString());
    }

    @Test
    public void buildWhenUrlIsEmptyTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL(""));

        URL builtUrl = urlBuilder.build();

        Assert.assertNotNull(builtUrl);
        Assert.assertEquals("", builtUrl.toString());
    }

    @Test
    public void buildWhenUrlIsNullTest() throws MalformedURLException {
        UrlBuilder urlBuilder = new UrlBuilder(null);

        URL builtUrl = urlBuilder.build();
    }

    @Test
    public void appendKeyValWhenKeyAndValueArePresentTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(Connection.KeyVal.create("page", "2"));

        Assert.assertEquals("http://www.example.com?page=2", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValWhenKeyIsEmptyTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(Connection.KeyVal.create("", "2"));

        Assert.assertEquals("http://www.example.com?2", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValWhenValueIsEmptyTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(Connection.KeyVal.create("page", ""));

        Assert.assertEquals("http://www.example.com?page=", urlBuilder.build().toString());
    }

    @Test
    public void appendKeyValWhenKeyValIsNullTest() throws MalformedURLException, UnsupportedEncodingException {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        urlBuilder.appendKeyVal(null);
    }

}