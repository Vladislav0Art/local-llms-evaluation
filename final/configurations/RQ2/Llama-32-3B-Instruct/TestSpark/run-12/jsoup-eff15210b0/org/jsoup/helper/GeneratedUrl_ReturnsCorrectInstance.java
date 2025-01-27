package org.jsoup.helper;

public class GeneratedUrl_ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void url_ReturnsCorrectInstance() {
        URL url = new URL("https://example.com");
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
    }

}