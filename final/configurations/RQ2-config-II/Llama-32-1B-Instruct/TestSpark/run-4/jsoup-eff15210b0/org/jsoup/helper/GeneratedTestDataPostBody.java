package org.jsoup.helper;

public class GeneratedTestDataPostBody {

    @Test
    public void testDataPostBody() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").post().execute();
        assertEquals(200, response.getResponseCode());
    }

}