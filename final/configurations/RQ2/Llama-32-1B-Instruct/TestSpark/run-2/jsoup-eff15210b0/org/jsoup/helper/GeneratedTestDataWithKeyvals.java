package org.jsoup.helper;

public class GeneratedTestDataWithKeyvals {

    private static final String URL = "https://example.com";

    @Test
    public void testDataWithKeyvals() {
        // Given
        List<String> keyvals = Arrays.asList("key1", "key2");

        // When
        Connection data = connection.data(keyvals.toArray(new String[0]));

        // Then
        assertNotNull(data);
    }

}