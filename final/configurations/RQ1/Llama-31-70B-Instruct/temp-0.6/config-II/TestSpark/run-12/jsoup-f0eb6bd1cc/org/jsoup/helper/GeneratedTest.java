package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void testConstructor() throws URISyntaxException, MalformedURLException, UnsupportedEncodingException {
        // Arrange
        URL url = mock(URL.class);
        when(url.getProtocol()).thenReturn("http");
        when(url.getUserInfo()).thenReturn("user");
        when(url.getHost()).thenReturn("example.com");
        when(url.getPort()).thenReturn(80);
        when(url.getPath()).thenReturn("/");
        when(url.getQuery()).thenReturn(null);
        when(url.getRef()).thenReturn(null);

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Assert
        Assert.assertEquals(url, urlBuilder.u);
        Assert.assertNull(urlBuilder.q);
    }

}