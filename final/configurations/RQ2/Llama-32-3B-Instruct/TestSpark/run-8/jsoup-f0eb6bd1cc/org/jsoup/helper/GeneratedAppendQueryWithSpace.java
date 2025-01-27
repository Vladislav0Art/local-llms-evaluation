package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAppendQueryWithSpace {

    @Mock
    private Connection connection;

    @Test
    public void appendQueryWithSpace() {
        // Arrange
        String url = "http://example.com";
        Connection.KeyVal kv = new org.jsoup.internal.StringUtil.KeyVal("key", "value with space");
        when(connection.getScheme()).thenReturn("http");

        UrlBuilder builder = new UrlBuilder(new URL(url));

        // Act
        builder.appendKeyVal(kv);

        // Assert
        assertEquals("http://example.com?key=value%20with%20space", connection.toString());
    }

}