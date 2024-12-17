package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void build_url_no_params() {
        // Arrange
        String url = "https://example.com";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.build()).thenReturn(url);
        assertEquals(url, urlObject.toString());
    }

    @Test
    public void build_url_with_params() {
        // Arrange
        String url = "https://example.com";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.build()).thenReturn(url);
    }

    @Test
    public void append_key_val_valid_key() {
        // Arrange
        String keyVal = "key=value";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

    @Test
    public void append_key_val_invalid_key() {
        // Arrange
        String keyVal = "key=invalid";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

    @Test
    public void append_key_val_empty_hash() {
        // Arrange
        String keyVal = "key";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

    @Test
    public void append_key_val_unparseable_key() {
        // Arrange
        String keyVal = "key";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

    @Test
    public void append_key_val_empty_string() {
        // Arrange
        String keyVal = "";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

    @Test
    public void append_key_val_null() {
        // Arrange
        String keyVal = null;
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

    @Test
    public void append_key_val_invalid_type() {
        // Arrange
        String keyVal = "key";
        MockUrlBuilder mockUrlBuilder = mock(UrlBuilder.class);

        // Act
        mockUrlBuilder.appendKeyVal(new java.util.HashMap<>());
        URL urlObject = (URL) mockUrlBuilder.build();

        // Assert
        when(mockUrlBuilder.appendKeyVal(any Conn.KeyVal.class)).thenReturn(keyVal);
    }

}