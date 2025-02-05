package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildTest() throws Exception {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        URL resultingUrl = urlBuilder.build();
        assertNotNull(resultingUrl);
        assertEquals(url, resultingUrl);
    }

    @Test
    public void appendKeyValTestInvalidCharacterEncoding() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("\uD800");
        urlBuilder.appendKeyVal(keyVal);
    }

    @Test
    public void appendKeyValTestValidKeyVal() throws UnsupportedEncodingException {
        URL url = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(keyVal.key()).thenReturn("testKey");
        Mockito.when(keyVal.value()).thenReturn("testValue");
        urlBuilder.appendKeyVal(keyVal);
        assertTrue(urlBuilder.toString().contains("testKey=testValue"));
    }

}