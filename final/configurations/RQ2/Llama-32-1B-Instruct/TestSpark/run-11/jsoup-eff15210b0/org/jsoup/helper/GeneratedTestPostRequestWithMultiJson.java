package org.jsoup.helper;

public class GeneratedTestPostRequestWithMultiJson {

    @Test
    public void testPostRequestWithMultiJson() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        List<String> jsonContent = Arrays.asList(
                "{\"name\":\"John\",\"age\":30}",
                "{\"name\":\"Jane\",\"age\":25}"
        );
        response = connection.post(request, jsonContent);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}