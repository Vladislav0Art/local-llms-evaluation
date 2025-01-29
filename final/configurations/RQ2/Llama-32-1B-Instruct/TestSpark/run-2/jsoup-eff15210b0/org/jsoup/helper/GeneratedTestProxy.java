package org.jsoup.helper;

public class GeneratedTestProxy {

    private static final String URL = "https://example.com";

    @Test
    public void testProxy() {
        // Given
        String proxyUrl = "http://proxy:8080";

        // When
        HttpConnection connection = connect(proxyUrl);

        // Then
        assertNotNull(connection);
    }

}