package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_withValidUrl_returnsUrl {

    @Test
    public void build_withValidUrl_returnsUrl() throws MalformedURLException {
        // Arrange
        URL inputUrl = mock(URL.class);
        when(inputUrl.getProtocol()).thenReturn("http");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
        when(inputUrl.getQuery()).thenReturn("key1=value1&key2=value2");
        when(inputUrl.getRef()).thenReturn("anchor");

        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL builtUrl = urlBuilder.build();

        // Assert
        assertEquals("http://example.com/path?key1=value1&key2=value2#anchor", builtUrl.toExternalForm());
    }

}