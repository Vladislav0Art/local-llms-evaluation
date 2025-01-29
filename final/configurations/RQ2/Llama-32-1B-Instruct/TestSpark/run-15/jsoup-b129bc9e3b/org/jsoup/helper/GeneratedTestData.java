package org.jsoup.helper;

public class GeneratedTestData {

    @Test
    public void testData() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        String content = data.toString();
        assert connection.data("key", "value") instanceof Data;
    }

}