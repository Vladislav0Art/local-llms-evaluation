package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.nio.charset.CharsetEncoder;
import java.nio.charset.CharsetEncoderCompat;

public class GeneratedTestConnection {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testConnection() {
        // Arrange
        String uri = BASE_URI + "/example.html";

        // Act
        Connection connection = document.connection();

        // Assert
        assertNotNull(connection);
        assertEquals(BASE_URI, connection.getBaseUri());
    }

}