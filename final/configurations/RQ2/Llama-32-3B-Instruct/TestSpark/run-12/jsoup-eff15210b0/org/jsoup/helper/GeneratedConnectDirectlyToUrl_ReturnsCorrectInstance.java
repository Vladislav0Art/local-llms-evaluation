package org.jsoup.helper;

public class GeneratedConnectDirectlyToUrl_ReturnsCorrectInstance {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void connectDirectlyToUrl_ReturnsCorrectInstance() {
        Connection connection = HttpConnection.connect("https://example.com");
        assertNotNull(connection);
    }

}