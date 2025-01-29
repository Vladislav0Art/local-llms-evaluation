package org.jsoup.helper;

public class GeneratedTestConnectWithUrlParams {

    @Test
    public void testConnectWithUrlParams() {
        URL url = new URL("http://example.com?param=value");
        Connection connection = HttpConnection.connect(url);
        assert connection != null;
    }

}