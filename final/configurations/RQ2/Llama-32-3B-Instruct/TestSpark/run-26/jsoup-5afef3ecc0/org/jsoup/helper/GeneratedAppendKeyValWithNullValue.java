package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class GeneratedAppendKeyValWithNullValue {

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

}