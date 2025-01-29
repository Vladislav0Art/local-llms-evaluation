package org.jsoup.helper;

public class GeneratedTestConnectWithRequest {

    private static final String URL = "http://example.com";
    private static final String COOKIE_NAME = "cookie";

    @Test
    public void testConnectWithRequest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Request request = new Request();
        connection.setRequest(request);
        assertEquals(URL, connection.connect(URL).getUri().toString());
    }

}