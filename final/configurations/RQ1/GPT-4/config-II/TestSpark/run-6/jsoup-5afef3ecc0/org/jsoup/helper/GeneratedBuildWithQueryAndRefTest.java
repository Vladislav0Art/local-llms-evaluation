package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedBuildWithQueryAndRefTest {

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

}