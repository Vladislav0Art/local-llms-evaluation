package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyValWithMultiValue {

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