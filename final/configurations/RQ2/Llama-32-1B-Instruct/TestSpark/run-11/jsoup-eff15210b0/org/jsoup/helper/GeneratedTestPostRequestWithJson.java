package org.jsoup.helper;

public class GeneratedTestPostRequestWithJson {

    @Test
    public void testPostRequestWithJson() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        String jsonContent = "{\"name\":\"John\",\"age\":30}";
        response = connection.post(request, jsonContent);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}