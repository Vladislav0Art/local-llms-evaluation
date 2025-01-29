package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    private static final String URL = "https://example.com";
    private static final String USER_AGENT = "Mozilla/5.0";

    @Test
    public void testConnectWithProxy() throws IOException {
        HttpConnection connection = HttpConnection.connect(new URL("http://proxy.example.com:8080"));
        assert connection.getProxy() != null;
    }

}