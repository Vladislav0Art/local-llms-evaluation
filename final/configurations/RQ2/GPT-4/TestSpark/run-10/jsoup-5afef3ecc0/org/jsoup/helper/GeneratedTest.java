package org.jsoup.helper;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        Assert.assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL builtUrl = urlBuilder.build();

        Assert.assertEquals(url, builtUrl);
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.toString()).thenReturn("testKey=testValue");

        urlBuilder.appendKeyVal(keyValMock);
        URL builtUrl = urlBuilder.build();

        // Check that key-value was added to url
        Assert.assertTrue(builtUrl.toString().contains(keyValMock.toString()));
    }

    @Test
    public void appendKeyValUnsupportedEncodingExceptionTest() throws Exception {
        URL url = new URL("http://test.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyValMock = mock(Connection.KeyVal.class);
        when(keyValMock.toString()).thenReturn("testKey=unsupportedEncodingValue");

        urlBuilder.appendKeyVal(keyValMock);
    }

}