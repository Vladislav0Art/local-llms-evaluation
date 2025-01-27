package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValWithNonEmptyValue {

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

}