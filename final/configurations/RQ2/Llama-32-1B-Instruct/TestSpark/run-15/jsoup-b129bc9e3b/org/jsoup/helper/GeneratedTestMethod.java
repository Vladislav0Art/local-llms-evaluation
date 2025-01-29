package org.jsoup.helper;

public class GeneratedTestMethod {

    @Test
    public void testMethod() throws InterruptedException {
        String url = "http://example.com";
        Connection response = connection.request("GET", url);
        assert response instanceof HttpURLConnection;
        ((HttpURLConnection) response).connect(url);
        assert (response instanceof Response);
        Response response2 = connection.response(response);
        assert response2 instanceof Response;
    }

}