package org.jsoup.helper;

public class GeneratedTestReferrer {

    private static final String URL = "https://example.com";

    @Test
    public void testReferrer() {
        // Given
        String referrer = "http://example.com";

        // When
        Connection.Request request = new Request();
        request.setReferrer(referrer);

        HttpConnection connection = HttpConnection.connect(request);

        // Then
        assertNotNull(connection);
    }

}