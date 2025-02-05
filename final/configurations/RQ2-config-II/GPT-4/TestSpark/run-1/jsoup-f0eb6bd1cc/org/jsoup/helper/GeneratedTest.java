package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Assert.assertNotNull(builder);
    }

    @Test
    public void urlBuilderConstructorInvalidUrlTest() {
        URL inputUrl = new URL("invalid-url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
    }

    @Test
    public void buildTest() {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        Assert.assertEquals("https://www.example.com", url.toString());
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value", "unsupported_encoding");
        builder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value", "UTF-8");
        builder.appendKeyVal(kv);

        URL url = builder.build();
        Assert.assertEquals("https://www.example.com?key=value", url.toString());
    }

}