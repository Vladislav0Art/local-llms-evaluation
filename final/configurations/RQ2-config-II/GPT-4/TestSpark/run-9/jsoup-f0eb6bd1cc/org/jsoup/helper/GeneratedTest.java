package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        URL url = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void UrlBuilderConstructorInvalidUrlTest() throws MalformedURLException {
        URL url = new URL("invalid.url");
        UrlBuilder urlBuilder = new UrlBuilder(url);
    }

    @Test
    public void buildValidUrlTest() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();
        Assert.assertEquals(url, builtUrl);
    }

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("key");
        Mockito.when(mockKeyVal.value()).thenReturn("value");

        urlBuilder.appendKeyVal(mockKeyVal);
        URL builtUrl = urlBuilder.build();

        Assert.assertEquals("https://www.google.com?key=value", builtUrl.toString());
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws UnsupportedEncodingException {
        URL url = new URL("https://www.google.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Connection.KeyVal mockKeyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("unsupported+key");
        Mockito.when(mockKeyVal.value()).thenReturn("unsupported+value");

        urlBuilder.appendKeyVal(mockKeyVal);
    }

}