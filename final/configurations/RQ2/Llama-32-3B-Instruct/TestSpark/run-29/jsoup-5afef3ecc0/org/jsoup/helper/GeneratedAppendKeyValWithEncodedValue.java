package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyValWithEncodedValue {

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

}