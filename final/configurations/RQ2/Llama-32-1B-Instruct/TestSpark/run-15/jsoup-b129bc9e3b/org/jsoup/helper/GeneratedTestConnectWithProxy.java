package org.jsoup.helper;

public class GeneratedTestConnectWithProxy {

    @Test
    public void testConnectWithProxy() {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection(true);
        assert connection.connect(url) != null;
    }

}