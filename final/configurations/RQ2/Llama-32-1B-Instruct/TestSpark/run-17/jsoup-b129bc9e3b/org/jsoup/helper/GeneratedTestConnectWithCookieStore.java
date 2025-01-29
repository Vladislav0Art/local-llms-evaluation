package org.jsoup.helper;

public class GeneratedTestConnectWithCookieStore {

    @Test
    public void testConnectWithCookieStore() throws IOException, URISyntaxException {
        // Arrange
        CookieManager cookieManager = new CustomCookieManager();
        Request request = new Request(Method.HEAD, new URL("http://example.com"));

        // Act
        try {
            Connection connection = HttpConnectionTest.connectWithCookieStore(request);

            // Assert
            assertNotNull(connection.getCookieStore());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (IOException e) {
                    // Ignore
                }
            }
        }
    }

}