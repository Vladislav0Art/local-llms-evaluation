package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildReturnsUrlWithDecodedHost() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://www.somehost.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("http://www.somehost.com/", result.toString());
    }

    @Test
    public void buildReturnsUrlWithPunyCodedHost() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://www.somehost.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        when(urlBuilder.decodePart(inputUrl.getHost())).thenReturn("www.somehost.com");

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("http://www.somehost.com/", result.toString());
    }

    @Test
    public void buildReturnsUrlWithDecodedPath() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://www.somehost.com/");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        when(urlBuilder.decodePart(inputUrl.getPath())).thenReturn("/");

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("http://www.somehost.com/", result.toString());
    }

}