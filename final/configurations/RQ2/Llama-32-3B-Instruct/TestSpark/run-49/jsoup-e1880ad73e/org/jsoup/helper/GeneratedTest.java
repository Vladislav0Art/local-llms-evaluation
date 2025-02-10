package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void constructor_givenInputUrl_thenCorrect() {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        // Act & Assert
        assertSame(inputUrl, new UrlBuilder(inputUrl).inputUrl);
    }

    @Test
    public void build_urlWithoutParams_thenCorrect() throws URISyntaxException {
        // Arrange
        Connection.KeyVal[] params = {};
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        URI uri = new UrlBuilder(inputUrl, params).build();
        assertEquals("http://example.com/path", uri.toString());
    }

    @Test
    public void build_urlWithParams_thenCorrect() throws URISyntaxException {
        // Arrange
        Connection.KeyVal[] params = {new Connection.KeyVal("key1", "value1")};
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        URI uri = new UrlBuilder(inputUrl, params).build();
        assertEquals("http://example.com/path?key1=value1", uri.toString());
    }

    @Test
    public void appendKeyVal_givenKeyValue_thenCorrect() throws UnsupportedEncodingException {
        // Arrange
        String keyValueStr = "key1=value1";
        Connection.KeyVal kv = new Connection.KeyVal("key1", keyValueStr);
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        assertSame(keyValueStr, new UrlBuilder(inputUrl).appendKeyVal(kv));
    }

    @Test
    public void appendKeyVal_givenEmptyKeyValue_thenCorrect() throws UnsupportedEncodingException {
        // Arrange
        String keyValueStr = "";
        Connection.KeyVal kv = new Connection.KeyVal("key1", keyValueStr);
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        assertEquals("", new UrlBuilder(inputUrl).appendKeyVal(kv));
    }

    @Test
    public void appendKeyVal_givenNullKeyValue_thenThrowsUnsupportedEncodingException() {
        // Arrange
        Connection.KeyVal kv = null;
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(inputUrl).appendKeyVal(kv));
    }

}