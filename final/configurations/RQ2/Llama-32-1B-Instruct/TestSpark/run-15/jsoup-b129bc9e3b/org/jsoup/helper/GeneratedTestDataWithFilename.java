package org.jsoup.helper;

public class GeneratedTestDataWithFilename {

    @Test
    public void testDataWithFilename() throws IOException {
        String url = "https://example.com";
        HttpConnection connection = new HttpConnection();
        assert connection.data("key", "value", "filename.txt", null) != null;
    }

}