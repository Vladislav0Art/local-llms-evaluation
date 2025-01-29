package org.jsoup.helper;

public class GeneratedTestUserAgent {

    private static final String URL = "https://example.com";

    @Test
    public void testUserAgent() {
        // Given
        String userAgent = "My Java Application";

        // When
        Connection.Request request = new Request();
        request.setUserAgent(userAgent);

        HttpConnection connection = HttpConnection.connect(request);

        // Then
        assertNotNull(connection);
    }

}