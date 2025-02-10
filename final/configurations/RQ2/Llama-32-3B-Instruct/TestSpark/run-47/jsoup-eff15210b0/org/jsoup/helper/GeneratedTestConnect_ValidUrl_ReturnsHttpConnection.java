package org.jsoup.helper;

public class GeneratedTestConnect_ValidUrl_ReturnsHttpConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    public Connection connect() {
        return new HttpConnection();
    }

    @Test
    public void testConnect_ValidUrl_ReturnsHttpConnection() throws MalformedURLException, IOException {
        URL url = new URL("http://example.com");
        Connection connection = connect().url(url);
        assert connection != null;
    }

}