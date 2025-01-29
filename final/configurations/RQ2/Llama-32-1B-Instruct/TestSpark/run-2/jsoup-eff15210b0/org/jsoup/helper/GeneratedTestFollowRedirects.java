package org.jsoup.helper;

public class GeneratedTestFollowRedirects {

    private static final String URL = "https://example.com";

    @Test
    public void testFollowRedirects() {
        // Given
        boolean followRedirects = true;

        // When
        HttpConnection connection = connect(new URL(URL).toString());

        // Then
        assertTrue(connection.followRedirects(followRedirects));
    }

}