package org.jsoup.helper;

public class GeneratedTestRequestWithUrl {

    @Test
    public void testRequestWithUrl() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("GET", "https://example.com");
        response = connection.request(request);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}