package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testBuild_ReturnsCorrectUrl() {
        // Arrange
        URL inputUrl = new URL("https://example.com/path?param=value");

        // Act
        URL actualUrl = UrlBuilder.build(inputUrl);

        // Assert
        assertTrue(actualUrl.getScheme().equals("https"));
        assertTrue(actualUrl.getHost().equals("example.com"));
        assertTrue(actualUrl.getPath().contains("/path?param=value"));
    }

    @Test
    public void testAppendKeyVal_SetsCorrectValues() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?param=value"));
        urlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value));

        // Assert
        assertEquals(key, urlBuilder.getKey());
        assertEquals(value, urlBuilder.getValue());
    }

    @Test
    public void testAppendKeyVal_MalformedUrl_ThrowsException() {
        // Arrange
        String key = "key";
        String value = "value";

        // Act and Assert
        assertThrows(MalformedURLException.class, () -> UrlBuilder.build(new URL("invalid_url")));
    }

    @Test
    public void testAppendKeyVal_NegativeValue_ThrowsException() {
        // Arrange
        String key = "key";
        int value = -1;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

    @Test
    public void testAppendKeyVal_EmptyValue_ThrowsException() {
        // Arrange
        String key = "key";
        int value = 0;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

    @Test
    public void testAppendKeyVal_NonStringValue_ThrowsException() {
        // Arrange
        String key = "key";
        Object value = null;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

    @Test
    public void testAppendKeyVal_MalformedValue_ThrowsException() {
        // Arrange
        String key = "key";
        int value = 123;

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendKeyVal(new org.jsoup.KeyVal(key, value)));
    }

}