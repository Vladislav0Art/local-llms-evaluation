package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() {
        // Arrange
        Connection.KeyVal kv = new Connection.KeyVal("key", "value");
        UrlBuilder urlBuilder = mock(UrlBuilder.class);

        // Act
        urlBuilder.appendKeyVal(kv);

        // Assert
        verify(urlBuilder).appendKeyVal(kv);
    }

}