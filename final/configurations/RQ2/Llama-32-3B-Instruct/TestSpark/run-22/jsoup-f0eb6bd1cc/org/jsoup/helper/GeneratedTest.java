package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void constructorWithInputUrl() {
        // Arrange
        try {
            URL inputUrl = new URL("https://example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            // Act
            assertEquals(inputUrl, urlBuilder.getInputUrl());
        } catch (MalformedURLException e) {
        }

        // Assert
        try {
            URL inputUrl = new URL("https://example.com?fragment=foo");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            String result = urlBuilder.buildUrl();
            assertEquals("https://example.com?fragment=foo", result);
        } catch (MalformedURLException e) {
        }

        // Assert
        try {
            URL inputUrl = new URL("https://example.com?key=value&fragment=foo");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            String result = urlBuilder.buildUrl();
            assertEquals("https://example.com?key=value&fragment=foo", result);
        } catch (MalformedURLException e) {
        }

        // Assert
        try {
            URL inputUrl = new URL("https://example.com?key=value&fragment=foo");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            String result = urlBuilder.buildUrl();
            assertEquals("https://example.com?key=value&fragment=foo", result);
        } catch (MalformedURLException e) {
        }

        // Assert
        try {
            URL inputUrl = new URL("https://example.com?key=value&fragment=äo");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            String result = urlBuilder.buildUrl();
            assertEquals("https://example.com?key=%C3%A4o&fragment=äo", result);
        } catch (MalformedURLException e) {
        }
    }

    public static class UrlBuilder {
        private URL inputUrl;

        public UrlBuilder(URL inputUrl) throws MalformedURLException {
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