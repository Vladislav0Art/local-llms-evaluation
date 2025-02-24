package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    private UrlBuilder urlBuilder;

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        // Arrange
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");

        // Act
        urlBuilder.appendKeyVal(keyVal);

        // Assert
        assertEquals("value", urlBuilder.build().getQueryParameter("key"));
    }

}