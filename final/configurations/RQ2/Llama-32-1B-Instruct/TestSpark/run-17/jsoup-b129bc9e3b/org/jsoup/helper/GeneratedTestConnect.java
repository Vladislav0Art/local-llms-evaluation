package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() throws IOException, URISyntaxException {
        // Arrange
        Request request = new Request(Method.HEAD, new URL("http://example.com"));
        Connection connection = null;

        // Act
        try {
            connection = HttpConnectionTest.connect(request);

            // Assert
            assertNotNull(connection);
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