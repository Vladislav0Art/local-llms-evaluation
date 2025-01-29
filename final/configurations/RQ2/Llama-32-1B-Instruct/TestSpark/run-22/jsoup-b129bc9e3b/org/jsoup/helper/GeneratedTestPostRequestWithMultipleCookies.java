package org.jsoup.helper;

public class GeneratedTestPostRequestWithMultipleCookies {

    @Test
    public void testPostRequestWithMultipleCookies() throws IOException {
        String url = "http://example.com";
        Request request = new Request(); // implementation
        HttpConnection connection = new HttpConnection(request);
        Connection response = connection.execute();
        assertEquals(201, response.getResponseCode());
        assertEquals("HTTP/1.1 201 Created\r\nContent-Type: application/json\r\n\r\n", response.getResponse());
    }

}