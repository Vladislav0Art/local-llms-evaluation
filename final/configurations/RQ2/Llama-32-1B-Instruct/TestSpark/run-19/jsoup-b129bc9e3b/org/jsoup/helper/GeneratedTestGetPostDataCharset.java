package org.jsoup.helper;

public class GeneratedTestGetPostDataCharset {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testGetPostDataCharset() throws IOException {
        HttpConnection connection = HttpConnection.post(URL, "data", "charset=utf-8");
        assert connection.getDataCharset() == "utf-8";
    }

}