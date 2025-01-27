package org.jsoup.helper;

public class GeneratedConnectToURL_ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void connectToURL_ReturnsCorrectInstance() {
        URL url = new URL("https://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}