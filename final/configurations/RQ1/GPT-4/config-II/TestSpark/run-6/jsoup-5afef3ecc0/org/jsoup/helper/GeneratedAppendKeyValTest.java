package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

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

}