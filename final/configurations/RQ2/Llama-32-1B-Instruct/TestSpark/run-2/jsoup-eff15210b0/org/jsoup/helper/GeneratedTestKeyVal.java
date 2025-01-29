package org.jsoup.helper;

public class GeneratedTestKeyVal {

    private static final String URL = "https://example.com";

    @Test
    public void testKeyVal() {
        // Given
        Request request = new Request();

        // When
        HttpConnection connection = connect(request);

        // Then
        assertNotNull(connection);
    }

}