package org.jsoup.helper;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.Connection;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.UnsupportedEncodingException;

import static org.mockito.Mockito.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws MalformedURLException {
        URL urlMock = mock(URL.class);
        when(urlMock.getProtocol()).thenReturn("http");
        when(urlMock.getUserInfo()).thenReturn("userInfo");
        when(urlMock.getHost()).thenReturn("host");
        when(urlMock.getPort()).thenReturn(80);
        when(urlMock.getPath()).thenReturn("/path");
        when(urlMock.getQuery()).thenReturn("query");
        when(urlMock.getRef()).thenReturn("ref");

        UrlBuilder urlBuilder = new UrlBuilder(urlMock);
        URL resultUrl = urlBuilder.build();

        Assert.assertNotNull(resultUrl);
    }

}