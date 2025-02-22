package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuildUrlShouldReturnUrlWithDecodedPath {

    @Mock
    URL url;

    @Test
    public void buildUrlShouldReturnUrlWithDecodedPath() throws MalformedURLException {
        // Arrange
        when(url.getProtocol()).thenReturn("http");
        when(url.getUserInfo()).thenReturn(null);
        when(url.getHost()).thenReturn("host");
        when(url.getPort()).thenReturn(-1);
        when(url.getPath()).thenReturn(UrlBuilder.decodePart("/path"));

        UrlBuilder builder = new UrlBuilder(url);

        // Act
        URL actualUrl = builder.build();

        // Assert
        assertEquals("http://host/path", actualUrl.toExternalForm());
    }

}