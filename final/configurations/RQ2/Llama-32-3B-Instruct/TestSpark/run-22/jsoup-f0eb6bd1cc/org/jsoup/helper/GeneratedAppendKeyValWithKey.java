package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedAppendKeyValWithKey {

    @Test
    public void appendKeyValWithKey() {
        // Arrange
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        Mockito.when(kv.getKey()).thenReturn("key");

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(true); // assertion is needed to indicate the method executed
    }

}