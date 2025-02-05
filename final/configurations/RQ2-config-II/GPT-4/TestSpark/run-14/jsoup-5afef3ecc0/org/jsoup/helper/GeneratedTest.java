package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildWithValidURLTest() throws Exception {
        URL testUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);
        URL resultUrl = builder.build();

        assertEquals(testUrl, resultUrl);
    }

    @Test
    public void buildWithNullURLTest() {
        UrlBuilder builder = new UrlBuilder(null);
        builder.build();
    }

    @Test
    public void appendKeyValWithValidKeyValTest() throws Exception {
        URL testUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal testKeyVal = mock(Connection.KeyVal.class);
        when(testKeyVal.key()).thenReturn("testKey");
        when(testKeyVal.value()).thenReturn("testValue");

        builder.appendKeyVal(testKeyVal);

        URL expected = new URL("http://test.com?testKey=testValue");
        assertEquals(expected, builder.build());
    }

    @Test
    public void appendKeyValWithUnsupportedEncodingKeyValTest() throws Exception {
        URL testUrl = new URL("http://test.com");
        UrlBuilder builder = new UrlBuilder(testUrl);

        Connection.KeyVal testKeyVal = mock(Connection.KeyVal.class);
        when(testKeyVal.key()).thenReturn("testKey");
        when(testKeyVal.value()).thenReturn("\ud800");  // invalid utf8

        builder.appendKeyVal(testKeyVal);
    }

}