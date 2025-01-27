package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createUrlBuilder() {
        // Arrange
        URL inputUrl = new URL("https://example.com");

        // Act
        UrlBuilder builder = new UrlBuilder(inputUrl);

        // Assert
        assert builder != null;
    }

    @Test
    public void buildUrl() {
        // Arrange
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com/path"));

        // Act
        URL url = builder.build();

        // Assert
        assertEquals("https://example.com/path", url.toString());
    }

    @Test
    public void appendKeyVal() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = Connection.KeyVal.newKeyValue("key", "value");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("https://example.com?key=value", builder.build().toString());
    }

    @Test
    public void appendKeyValWithEncodedValue() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal kv = Connection.KeyVal.newKeyValue("key", "value with spaces");
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("https://example.com?key=value%20with%20spaces", builder.build().toString());
    }

    @Test
    public void appendKeyValWithMultiValue() throws UnsupportedEncodingException {
        // Arrange
        Connection.KeyVal[] kv = {Connection.KeyVal.newKeyValue("key1", "value1"), Connection.KeyVal.newKeyValue("key2", "value2")};
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));

        // Act
        for (Connection.KeyVal keyVal : kv) {
            builder.appendKeyVal(keyVal);
        }

        // Assert
        assertEquals("https://example.com?key1=value1&key2=value2", builder.build().toString());
    }

}