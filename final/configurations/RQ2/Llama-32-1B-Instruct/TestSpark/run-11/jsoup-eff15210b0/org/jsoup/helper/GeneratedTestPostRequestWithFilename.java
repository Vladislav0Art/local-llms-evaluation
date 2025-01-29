package org.jsoup.helper;

public class GeneratedTestPostRequestWithFilename {

    @Test
    public void testPostRequestWithFilename() throws Exception {
        HttpConnection connection = new HttpConnection(Request.empty());
        Request request = new Request("POST", "http://example.com");
        String filename = "file.txt";
        String content = new String(new File(filename).readAllBytes());
        response = connection.post(request, content);
        assert response != null;

        String content = response.getContent();
        System.out.println(content);
    }

}