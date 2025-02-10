package org.jsoup.helper;

public class GeneratedTestConnect_MocksConnect_ReturnsHttpConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private CookieManager cookieManager;

    public Connection connect() {
        return new HttpConnection();
    }

    @Test
    public void testConnect_MocksConnect_ReturnsHttpConnection() throws MalformedURLException, IOException {
        Connection connection = connect();
        Mockito.when(HttpConnection.connect(Mockito.anyString())).thenReturn(connection);
    }

}