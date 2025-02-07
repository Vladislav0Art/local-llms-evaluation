package org.jsoup.helper;

public class GeneratedTestPostDataCharset {

    @Test
    public void testPostDataCharset() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.postCharset("utf-8").execute();
        assertEquals(200, response.getResponseCode());
    }

}