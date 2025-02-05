package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorTest() throws MalformedURLException {
        URL testUrl = new URL("http://example.com");
        new UrlBuilder(testUrl);
    }

    @Test
    public void urlBuilderConstructorNullTest() throws MalformedURLException {
        URL testUrl = null;
        new UrlBuilder(testUrl);
    }

    @Test
    public void buildTest() throws MalformedURLException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        urlBuilder.build();
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal testKv = Connection.KeyVal.create("key", "value");
        urlBuilder.appendKeyVal(testKv);
    }

    @Test
    public void appendKeyValNullTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal testKv = null;
        urlBuilder.appendKeyVal(testKv);
    }

}