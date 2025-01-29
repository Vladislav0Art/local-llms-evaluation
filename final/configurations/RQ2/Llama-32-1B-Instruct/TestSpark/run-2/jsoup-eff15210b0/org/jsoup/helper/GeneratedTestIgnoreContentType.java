package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    private static final String URL = "https://example.com";

    @Test
    public void testIgnoreContentType() {
        // Given
        boolean ignoreContentType = false;

        // When
        HttpConnection connection = connect(new URL(URL).toString());

        // Then
        assertFalse(connection.ignoreContentType(ignoreContentType));
    }

}