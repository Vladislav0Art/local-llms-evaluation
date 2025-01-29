package org.jsoup.helper;

public class GeneratedTestConnect {

    private static final String URL = "https://example.com";

    @Test
    public void testConnect() {
        // Given
        String url = new URL(URL).toString();

        // When
        HttpConnection connection = connect(url);

        // Then
        assertNotNull(connection);
    }

}