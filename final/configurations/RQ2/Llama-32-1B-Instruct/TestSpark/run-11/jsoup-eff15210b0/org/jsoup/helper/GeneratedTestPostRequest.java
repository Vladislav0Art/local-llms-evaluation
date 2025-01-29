package org.jsoup.helper;

public class GeneratedTestPostRequest {

    @Test
    public void testPostRequest() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        response = connection.post(request);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}