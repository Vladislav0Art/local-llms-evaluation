package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestAppendKeyValThrowsUnsupportedEncodingException {

    @Test
    public void testAppendKeyValThrowsUnsupportedEncodingException() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";
        URL url = URI.create(inputUrl);

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(new Connection.KeyVal()));
    }

}