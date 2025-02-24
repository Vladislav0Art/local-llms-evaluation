package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void buildTest() {
        // Arrange
        URL inputUrl = new URL("https://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertEquals("https", result.getProtocol());
        assertEquals("www.example.com", result.getHost());
        assertEquals(443, result.getPort());
    }

    @Test
    public void appendKeyValTest() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = mock(UrlBuilder.class);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        verify(urlBuilder).appendKeyVal(kv);
    }

}