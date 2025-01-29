package org.jsoup.helper;

public class GeneratedTestGetResponse {

    @Test
    public void testGetResponse() throws IOException {
        String url = "http://example.com";
        Document document = JsoupHelper.get(url);
        assert document != null;
    }

}