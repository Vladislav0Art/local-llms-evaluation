package org.jsoup.helper;

public class GeneratedTest_response_with_jar {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_response_with_jar() {
        Request request = new Request();
        // create content
        String body = "Hello World!";
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        request.setBody(body);
        Connection response = ((HttpConnection) connection).request(request);
        assertEquals(body, ((HttpConnection) response).response().getValue());
    }

}