package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_NoException_UrlIsReturned {

    @Mock
    private Connection.KeyVal kv;

    private final UrlBuilder urlBuilder = new UrlBuilder("https://example.com");

    @Test
    public void build_NoException_UrlIsReturned() {
        // Arrange
        when(urlBuilder.build()).thenReturn("https://example.com");

        // Act and Assert
        assertEquals("https://example.com", urlBuilder.build());
    }
}

class ConnectionKeyVal {
    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}