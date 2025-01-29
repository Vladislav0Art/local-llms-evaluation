package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    private static final String URL = "https://example.com";

    @Test
    public void testMaxBodySize() {
        // Given
        int bytes = 1024 * 1024; // 1MB

        // When
        HttpConnection connection = connect(new URL(URL).toString());

        // Then
        assertNotEquals(0, connection.maxBodySize(bytes));
    }

}