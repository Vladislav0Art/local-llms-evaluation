package org.jsoup.helper;

public class GeneratedTestPostResponse {

    @Test
    public void testPostResponse() throws IOException {
        String url = "http://example.com";
        Request request = new Request("POST", "/path/to/request");
        Document document = JsoupHelper.post(url, request);
        assertEquals(document.toString(), request.body());
    }

}