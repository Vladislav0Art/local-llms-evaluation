package org.jsoup.helper;

public class GeneratedTestPostDataCharsetResponse {

    @Test
    public void testPostDataCharsetResponse() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.postCharset("utf-8").post().execute();
        assertEquals(200, response.getResponseCode());
    }

}