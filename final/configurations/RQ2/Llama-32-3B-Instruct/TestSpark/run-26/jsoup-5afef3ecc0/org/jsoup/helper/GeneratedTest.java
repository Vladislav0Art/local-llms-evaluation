package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void buildUrlFromInputUrl() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL result = builder.build();

        // Assert
        assertEquals(inputUrl, result);
    }

    @Test
    public void buildUrlFromInputUrlWithQuery() throws Exception {
        // Arrange
        URL inputUrl = new URL("http://example.com?query=value");
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Act
        URL result = builder.build();

        // Assert
        assertEquals(inputUrl, result);
    }

    @Test
    public void appendKeyValWithNullValue() throws Exception {
        // Arrange
        Connection.KeyVal kv = null;
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertNull(kv.getValue());
    }

    @Test
    public void appendKeyValWithEmptyValue() throws Exception {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertNotNull(kv.getValue());
        assertEquals("", kv.getValue());
    }

    @Test
    public void appendKeyValWithNonEmptyValue() throws Exception {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertNotNull(kv.getValue());
        assertEquals("value", kv.getValue());
    }

    @Test
    public void appendQueryWithNonEmptyValue() throws Exception {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();
        query.put("query", "value");

        // Act
        builder.appendKeyVal(builder.getQueryParams().add("query", "value"));

        // Assert
        assertNotNull(query);
        assertEquals(1, query.size());
        assertEquals("value", query.values().iterator().next());
    }

    @Test
    public void buildUrlFromNullInputUrl() throws Exception {
        new UrlBuilder(null).build();
    }

    @Test
    public void getParamsString() throws Exception {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        Map<String, String> query = new HashMap<>();
        query.put("key", "value");

        // Act
        String result = builder.getParamsString(query);

        // Assert
        assertEquals("key=value", result);
    }

    @Test
    public void getParamsStringNullQuery() throws Exception {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.getParamsString(null);
    }

}