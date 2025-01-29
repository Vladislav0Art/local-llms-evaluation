package org.jsoup.helper;

public class GeneratedTestSslSocketFactory {

    private static final String URL = "https://example.com";

    @Test
    public void testSslSocketFactory() {
        // Given
        SSLSocketFactory sslSocketFactory = new SSLSocketFactory();

        // When
        HttpConnection connection = connect(new URL(URL).toString());

        // Then
        assertNotNull(connection);
    }

}