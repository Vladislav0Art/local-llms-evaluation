package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assert connection != null;
    }

}