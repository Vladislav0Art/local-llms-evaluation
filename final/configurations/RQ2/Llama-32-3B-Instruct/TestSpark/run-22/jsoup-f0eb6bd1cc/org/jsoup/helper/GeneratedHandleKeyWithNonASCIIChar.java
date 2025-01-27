package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

import org.mockito.Mockito;

public class GeneratedHandleKeyWithNonASCIIChar {

    @Test
    public void handleKeyWithNonASCIIChar() {
        // Arrange
        URL inputUrl = new URL("https://example.com?key=value&fragment=äo");

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        String result = urlBuilder.buildUrl();

        // Assert
        assertEquals("https://example.com?key=%C3%A4o&fragment=äo", result);
    }

    public static class UrlBuilder {
        private URL inputUrl;

        public UrlBuilder(URL inputUrl) {
            this.inputUrl = inputUrl;
        }

        public String buildUrl() {
            return inputUrl.toString();
        }

        public URL getInputUrl() {
            return inputUrl;
        }
    }

}