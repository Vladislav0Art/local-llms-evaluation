package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.Arrays;

public class GeneratedAppendKeyVal_givenNullKeyValue_thenThrowsUnsupportedEncodingException {

    @Test
    public void appendKeyVal_givenNullKeyValue_thenThrowsUnsupportedEncodingException() {
        // Arrange
        Connection.KeyVal kv = null;
        URL inputUrl = new URL("http://example.com/path");
        // Act & Assert
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(inputUrl).appendKeyVal(kv));
    }

}