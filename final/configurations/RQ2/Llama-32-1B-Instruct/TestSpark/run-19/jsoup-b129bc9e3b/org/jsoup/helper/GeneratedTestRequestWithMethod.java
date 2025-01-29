package org.jsoup.helper;

public class GeneratedTestRequestWithMethod {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testRequestWithMethod() throws IOException {
        Request request = new Request();
        Request response = new Request();
        request.setMethod(Method.HEAD);
        HttpConnection connection = HttpConnection.connect(new URL("https://example.com"));
        assert connection.request(request) == response;
    }

}