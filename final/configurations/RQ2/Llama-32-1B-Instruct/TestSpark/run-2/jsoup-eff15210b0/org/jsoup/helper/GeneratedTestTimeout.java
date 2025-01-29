package org.jsoup.helper;

public class GeneratedTestTimeout {

    private static final String URL = "https://example.com";

    @Test
    public void testTimeout() {
        // Given
        int timeoutMs = 1000;

        // When
        HttpConnection connection = connect(new URL(URL).toString());

        // Then
        assertNotEquals(0, connection.timeout(timeoutMs));
    }

}