package org.jsoup.helper;

public class GeneratedTestRequest {

    @Test
    public void testRequest() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("GET", "http://example.com");
        response = connection.request(request);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}