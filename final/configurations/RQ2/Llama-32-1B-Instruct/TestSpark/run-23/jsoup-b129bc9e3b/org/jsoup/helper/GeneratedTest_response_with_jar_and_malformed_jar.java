package org.jsoup.helper;

public class GeneratedTest_response_with_jar_and_malformed_jar {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_response_with_jar_and_malformed_jar() {
        Request request = new Request();
        // create content
        String body = "Hello World!";
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        request.setBody(body);
        try {
            ((HttpConnection) connection).request(request);
            fail("Expected IOException: Malformed jar cookie string");
        } catch (IOException e) {
            assertEquals(403, e.getStatusCode());
        }
    }

}