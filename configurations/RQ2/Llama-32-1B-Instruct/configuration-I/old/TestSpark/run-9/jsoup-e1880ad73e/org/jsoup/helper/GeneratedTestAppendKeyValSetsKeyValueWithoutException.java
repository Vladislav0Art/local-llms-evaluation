package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestAppendKeyValSetsKeyValueWithoutException {

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

}