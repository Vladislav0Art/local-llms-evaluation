package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderCorrectUrlInputTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderNullUrlInputTest() {
        URL testUrl = null;
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
    }

    @Test
    public void buildWithValidUrlTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Assert.assertEquals(testUrl, urlBuilder.build());
    }

    @Test
    public void buildWithInValidUrlTest() throws MalformedURLException {
        URL testUrl = new URL("");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);

        Assert.assertEquals(testUrl, urlBuilder.build());
    }

    @Test
    public void appendKeyValWithValidInputTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("testKey");
        Mockito.when(kv.value()).thenReturn("testValue");

        urlBuilder.appendKeyVal(kv);

        Assert.assertTrue(urlBuilder.build().getQuery().contains("testKey=testValue"));
    }

    @Test
    public void appendKeyValWithInvalidKeyTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("");
        Mockito.when(kv.value()).thenReturn("testValue");

        urlBuilder.appendKeyVal(kv);
    }

    @Test
    public void appendKeyValWithInvalidValTest() throws UnsupportedEncodingException, MalformedURLException {
        URL testUrl = new URL("https://www.google.com/");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.key()).thenReturn("testKey");
        Mockito.when(kv.value()).thenReturn("");

        urlBuilder.appendKeyVal(kv);
    }

}