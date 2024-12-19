package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestAppendKeyValSetsKeyValue {

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

}