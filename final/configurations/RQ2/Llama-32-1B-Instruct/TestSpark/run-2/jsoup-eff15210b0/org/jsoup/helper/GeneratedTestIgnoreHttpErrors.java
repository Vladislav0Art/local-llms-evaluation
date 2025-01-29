package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    private static final String URL = "https://example.com";

    @Test
    public void testIgnoreHttpErrors() {
        // Given
        boolean ignoreHttpErrors = true;

        // When
        HttpConnection connection = connect(new URL(URL).toString());

        // Then
        assertTrue(connection.ignoreHttpErrors(ignoreHttpErrors));
    }

}