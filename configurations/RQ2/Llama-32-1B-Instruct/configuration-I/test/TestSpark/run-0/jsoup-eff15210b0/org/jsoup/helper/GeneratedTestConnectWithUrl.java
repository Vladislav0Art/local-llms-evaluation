package org.jsoup.helper;

public class GeneratedTestConnectWithUrl {

    private Connection connection;
    private URL url;

    @Test
    public void testConnectWithUrl() {
        url = new URL("https://example.com");
        connection = org.jsoup.helper.HttpConnection.connect(url);
    }

}