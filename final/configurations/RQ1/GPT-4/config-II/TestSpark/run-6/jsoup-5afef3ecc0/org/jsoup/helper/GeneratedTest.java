package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructorAndBuildTest() throws Exception {
        URL urlMock = mock(URL.class);
        when(urlMock.getProtocol()).thenReturn("http");
        when(urlMock.getUserInfo()).thenReturn(null);
        when(urlMock.getHost()).thenReturn("example.com");
        when(urlMock.getPort()).thenReturn(-1);
        when(urlMock.getPath()).thenReturn("/");
        when(urlMock.getQuery()).thenReturn("param1=value1");
        when(urlMock.getRef()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        URL result = urlBuilder.build();

        assertEquals("http://example.com/?param1=value1", result.toString());
    }

    @Test
    public void buildWithQueryAndRefTest() throws Exception {
        URL urlMock = mock(URL.class);
        when(urlMock.getProtocol()).thenReturn("http");
        when(urlMock.getUserInfo()).thenReturn(null);
        when(urlMock.getHost()).thenReturn("example.com");
        when(urlMock.getPort()).thenReturn(-1);
        when(urlMock.getPath()).thenReturn("/");
        when(urlMock.getQuery()).thenReturn("param1=value1");
        when(urlMock.getRef()).thenReturn("ref1");

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        URL result = urlBuilder.build();

        assertEquals("http://example.com/?param1=value1#ref1", result.toString());
    }

    @Test
    public void appendKeyValTest() throws Exception {
        URL urlMock = mock(URL.class);
        when(urlMock.getProtocol()).thenReturn("http");
        when(urlMock.getUserInfo()).thenReturn(null);
        when(urlMock.getHost()).thenReturn("example.com");
        when(urlMock.getPort()).thenReturn(-1);
        when(urlMock.getPath()).thenReturn("/");
        when(urlMock.getQuery()).thenReturn("param1=value1");
        when(urlMock.getRef()).thenReturn(null);

        Connection.KeyVal keyVal = new Connection.KeyVal("param2", "value2");

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        urlBuilder.appendKeyVal(keyVal);
        URL result = urlBuilder.build();

        assertEquals("http://example.com/?param1=value1&param2=value2", result.toString());
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws Exception {
        URL urlMock = mock(URL.class);
        when(urlMock.getProtocol()).thenReturn("http");
        when(urlMock.getUserInfo()).thenReturn(null);
        when(urlMock.getHost()).thenReturn("\uDC00");
        when(urlMock.getPort()).thenReturn(-1);
        when(urlMock.getPath()).thenReturn("/");
        when(urlMock.getQuery()).thenReturn("param1=value1");
        when(urlMock.getRef()).thenReturn(null);

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        urlBuilder.build();
    }

}