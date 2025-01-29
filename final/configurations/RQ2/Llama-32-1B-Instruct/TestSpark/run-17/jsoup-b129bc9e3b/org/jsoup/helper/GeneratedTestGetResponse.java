package org.jsoup.helper;

public class GeneratedTestGetResponse {

    @Test
    public void testGetResponse() throws IOException, URISyntaxException {
        // Arrange
        URL url = new URL("http://example.com");

        // Act
        Request request = new Request(Method.HEAD, url);
        Connection connection = null;

        try {
            connection = HttpConnectionTest.connectWithCookieStore(request);

            String body = "body";
            Document doc = new Document().addText(body);
            Assert.assertEquals("200", connection.getResponseCode());
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