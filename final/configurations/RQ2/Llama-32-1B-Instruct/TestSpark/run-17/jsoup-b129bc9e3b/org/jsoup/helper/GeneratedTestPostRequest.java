package org.jsoup.helper;

public class GeneratedTestPostRequest {

    @Test
    public void testPostRequest() throws IOException, URISyntaxException {
        // Arrange
        Request request = new Request(Method.POST, new URL("http://example.com"));

        // Act
        Connection connection = null;

        try {
            connection = HttpConnectionTest.connectWithCookieStore(request);

            String body = "body";
            byte[] bytes = connection.readAllBytes();
            Assert.assertEquals("POST", request.getMethod().toString());
            Document doc = new Document().addText(new String(bytes));
            Assert.assertEquals("201", connection.getResponseCode());
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