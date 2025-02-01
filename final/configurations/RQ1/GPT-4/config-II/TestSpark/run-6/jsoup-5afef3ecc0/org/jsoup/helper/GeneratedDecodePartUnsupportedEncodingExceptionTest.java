package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedDecodePartUnsupportedEncodingExceptionTest {

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