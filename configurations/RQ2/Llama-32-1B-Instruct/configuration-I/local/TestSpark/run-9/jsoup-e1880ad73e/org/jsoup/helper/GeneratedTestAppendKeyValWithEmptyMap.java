package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestAppendKeyValWithEmptyMap {

    @Test
    public void testAppendKeyValWithEmptyMap() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";
        URI url = URI.create(inputUrl);

        // Act and Assert
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

}