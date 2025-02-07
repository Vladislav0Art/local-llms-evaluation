package org.jsoup.helper;

public class GeneratedTestDataPost {

    @Test
    public void testDataPost() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").post().execute();
        assertEquals(200, response.getResponseCode());
    }

}