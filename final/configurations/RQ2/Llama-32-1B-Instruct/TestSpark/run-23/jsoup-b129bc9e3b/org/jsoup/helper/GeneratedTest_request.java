package org.jsoup.helper;

public class GeneratedTest_request {

    private static final String HOST = "example.com";
    private static final int PORT = 443;

    @Test
    public void test_request() {
        Request request = new Request();
        // create content
        String body = "Hello World!";
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        request.setBody(body);
        assertEquals(body, ((HttpConnection) connection).request().getBody());
    }

}