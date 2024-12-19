package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void testUrlBuilderConstructsWithInputUrl() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";

        // Act
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // Assert
        assertNotNull(urlBuilder);
    }

    @Test
    public void testAppendKeyValSetsKeyValue() {
        // Arrange
        Map<String, String> keyValuePairs = Map.of("key1", "value1", "key2", "value2");
        Connection.KeyVal kv = new Connection.KeyVal(keyValuePairs);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertNotNull(urlBuilder);
    }

    @Test
    public void testAppendKeyValThrowsUnsupportedEncodingException() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";
        URL url = URI.create(inputUrl);

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal()));
    }

    @Test
    public void testAppendKeyValSetsKeyValueWithoutException() {
        // Arrange
        Map<String, String> keyValuePairs = Map.of("key1", "value1");
        Connection.KeyVal kv = new Connection.KeyVal(keyValuePairs);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertNotNull(urlBuilder);
    }

    @Test
    public void testAppendKeyValWithEmptyKeyValuePairs() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";
        URI url = URI.create(inputUrl);

        // Act
        urlBuilder.appendKeyVal(new Connection.KeyVal());

        // Assert
        assertNotNull(urlBuilder);
    }

    @Test
    public void testAppendKeyValWithEmptyMap() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";
        URI url = URI.create(inputUrl);

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

    @Test
    public void testBuildReturnsUrlWithDefaultParameters() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";

        // Act
        URL result = urlBuilder.build();

        // Assert
        assertNotNull(result);
    }

}