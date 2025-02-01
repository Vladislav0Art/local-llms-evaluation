package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.StringUtil;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildNormalUrlTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/search?q=test");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.google.com/search?q=test");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

    @Test
    public void buildUrlWithRefTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/search?q=test#value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.google.com/search?q=test#value");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

    @Test
    public void buildUrlWithUnicodeTest() throws MalformedURLException {
        URL inputUrl = new URL("https://www.google.com/search?q=tést");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL expectedUrl = new URL("https://www.google.com/search?q=t%C3%A9st");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL inputUrl = new URL("https://www.google.com/search");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.key()).thenReturn("k");
        when(kv.value()).thenReturn("v");
        urlBuilder.appendKeyVal(kv);
        URL expectedUrl = new URL("https://www.google.com/search?q=k%3Dv");
        Assert.assertEquals(urlBuilder.build(), expectedUrl);
    }

}