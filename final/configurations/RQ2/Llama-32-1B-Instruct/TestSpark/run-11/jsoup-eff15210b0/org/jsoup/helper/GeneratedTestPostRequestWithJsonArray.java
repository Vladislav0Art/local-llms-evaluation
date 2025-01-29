package org.jsoup.helper;

public class GeneratedTestPostRequestWithJsonArray {

    @Test
    public void testPostRequestWithJsonArray() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        String jsonContent = "[{\"name\":\"John\",\"age\":30}]";
        response = connection.post(request, jsonContent);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}