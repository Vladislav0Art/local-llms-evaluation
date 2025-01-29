package org.jsoup.helper;

public class GeneratedTestDataWithContentType {

    private static final String URL = "https://example.com";

    @Test
    public void testDataWithContentType() {
        // Given
        String key = "example_key";
        String contentType = "application/json";

        // When
        Connection data = connection.data(key, null, null, contentType);

        // Then
        assertNotNull(data);
    }

}