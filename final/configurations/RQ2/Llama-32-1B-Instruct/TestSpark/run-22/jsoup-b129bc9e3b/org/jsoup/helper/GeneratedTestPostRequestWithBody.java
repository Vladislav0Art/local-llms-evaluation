package org.jsoup.helper;

public class GeneratedTestPostRequestWithBody {

    @Test
    public void testPostRequestWithBody() throws IOException {
        String url = "http://example.com";
        Request request = new Request(); // implementation
        HttpConnection connection = new HttpConnection(request);
        Connection response = connection.execute();
        assertEquals("HTTP/1.1 201 Created\r\nContent-Type: application/json\r\n\r\n{}", response.getResponse());
    }

}