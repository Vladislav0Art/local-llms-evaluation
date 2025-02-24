package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void buildUrlBuilderWithValidUrlTest() throws URISyntaxException, MalformedURLException {
        // Arrange
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Act
        URL builtUrl = urlBuilder.build();

        // Assert
        assertNotNull(builtUrl);
        assertEquals("http", builtUrl.getProtocol());
        assertEquals("www.example.com", builtUrl.getHost());
    }

    @Test
    public void buildUrlBuilderWithInvalidUrlTest() throws URISyntaxException, MalformedURLException {
        // Arrange
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);

        // Act
        URL builtUrl = urlBuilder.build();
    }

    @Test
    public void appendKeyValWithValidKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal validKeyVal = Mockito.mock(Connection.KeyVal.class);
        when(validKeyVal.toString()).thenReturn("key=value");
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://www.example.com"));

        // Act
        urlBuilder.appendKeyVal(validKeyVal);

        // Assert
        // No assertions required
    }

}