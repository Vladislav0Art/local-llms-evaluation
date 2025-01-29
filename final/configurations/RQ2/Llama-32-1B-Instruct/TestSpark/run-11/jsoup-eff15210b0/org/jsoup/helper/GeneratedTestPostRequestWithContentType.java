package org.jsoup.helper;

public class GeneratedTestPostRequestWithContentType {

    @Test
    public void testPostRequestWithContentType() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        String contentType = "application/json";
        response = connection.post(request, contentType);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}