package org.jsoup.helper;

public class GeneratedTestDataRequest {

    @Test
    public void testDataRequest() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new LinkedHashMap<>();
        data.put("key", "value");
        Connection response = connection.data("key", "value").execute();
        assertEquals(200, response.getResponseCode());
    }

}