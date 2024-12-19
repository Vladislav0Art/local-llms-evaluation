package org.jsoup.helper;

import org.junit.Test;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class GeneratedTestAppendKeyValWithEmptyKeyValuePairs {

    @Test
    public void testAppendKeyValWithEmptyKeyValuePairs() {
        // Arrange
        String inputUrl = "https://example.com/path?param=value";
        URI url = URI.create(inputUrl);

        // Act
        urlBuilder.appendKeyVal(new Connection.KeyVal());

        // Assert
        assertNotNull(urlBuilder);
    }

}