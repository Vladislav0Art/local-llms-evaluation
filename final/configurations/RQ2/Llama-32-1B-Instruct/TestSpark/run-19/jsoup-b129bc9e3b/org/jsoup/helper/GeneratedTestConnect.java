package org.jsoup.helper;

public class GeneratedTestConnect {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testConnect() throws IOException {
        HttpConnection connection = HttpConnection.connect(URL);
        assert connection != null;
    }

}