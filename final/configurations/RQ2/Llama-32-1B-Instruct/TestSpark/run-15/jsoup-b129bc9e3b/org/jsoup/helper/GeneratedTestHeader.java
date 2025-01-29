package org.jsoup.helper;

public class GeneratedTestHeader {

    @Test
    public void testHeader() throws InterruptedException {
        String url = "https://example.com";
        Connection response = connection.request("GET", url);
        assert response instanceof HttpURLConnection;
        ((HttpURLConnection) response).connect(url);
        assertEquals(200, response.status());
    }

}