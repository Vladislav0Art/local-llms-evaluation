package org.jsoup.helper;

public class GeneratedUrlWithHostAndPort_ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void urlWithHostAndPort_ReturnsCorrectInstance() {
        String host = "localhost";
        int port = 8080;
        URL url = new URL(host + ":" + port);
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
    }

}