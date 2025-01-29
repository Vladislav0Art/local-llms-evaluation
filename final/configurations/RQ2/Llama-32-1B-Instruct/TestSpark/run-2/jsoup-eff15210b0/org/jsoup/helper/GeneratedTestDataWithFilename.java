package org.jsoup.helper;

public class GeneratedTestDataWithFilename {

    private static final String URL = "https://example.com";

    @Test
    public void testDataWithFilename() {
        // Given
        String key = "example_key";
        String filename = "example_filename";
        InputStream inputStream = new ByteArrayInputStream("example_data".getBytes());

        // When
        Connection data = connection.data(key, filename, inputStream);

        // Then
        assertNotNull(data);
    }

}