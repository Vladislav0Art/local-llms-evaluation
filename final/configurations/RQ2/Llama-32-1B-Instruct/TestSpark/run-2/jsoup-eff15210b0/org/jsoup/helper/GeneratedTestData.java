package org.jsoup.helper;

public class GeneratedTestData {

    private static final String URL = "https://example.com";

    @Test
    public void testData() {
        // Given
        String key = "example_key";
        String value = "example_value";

        // When
        Connection data = connection.data(key, value);

        // Then
        assertNotNull(data);
    }

}