package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedAppendKeyVal {

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

}