package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        assertNotNull(urlBuilder);
    }

    @Test
    public void buildBasicUrlTest() throws MalformedURLException {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals(testUrl, outputUrl);
    }

    @Test
    public void appendKeyValTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("Key");
        Mockito.when(mockKeyVal.value()).thenReturn("Value");
        urlBuilder.appendKeyVal(mockKeyVal);
        URL outputUrl = urlBuilder.build();
        assertTrue(outputUrl.toString().contains("Key=Value"));
    }

    @Test
    public void appendKeyValUnsupportedEncodingTest() throws MalformedURLException, UnsupportedEncodingException {
        URL testUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(testUrl);
        Connection.KeyVal mockKeyVal = mock(Connection.KeyVal.class);
        Mockito.when(mockKeyVal.key()).thenReturn("unsupported_encoding_key");
        urlBuilder.appendKeyVal(mockKeyVal);
    }

}