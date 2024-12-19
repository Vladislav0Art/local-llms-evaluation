package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAppend_key_val_empty_hash {

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

}