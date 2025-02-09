package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedTest {

    @Test
    public void UrlBuilderInputURLTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThat(urlBuilder.build(), is(inputUrl));
    }

    @Test
    public void UrlBuilderInvalidURLTest() throws MalformedURLException {
        URL inputUrl = new URL("htt://www.example.com");
        new UrlBuilder(inputUrl);
    }

    @Test
    public void buildSimpleURLTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertThat(urlBuilder.build(), is(inputUrl));
    }

    @Test
    public void buildInvalidURLTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.example.com?param");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(kv);
        URL expectedUrl = new URL("https://www.example.com?key=value");
        assertThat(urlBuilder.build(), is(expectedUrl));
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = Connection.KeyVal.create("key", "\u60a8");
        urlBuilder.appendKeyVal(kv);
    }

}