package org.jsoup.helper;

public class GeneratedSslSocketFactory SetsSslSocketFactoryOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void sslSocketFactory

    SetsSslSocketFactoryOnConnection() {
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);
        Connection connection = HttpConnection.sslSocketFactory(sslSocketFactory);
        assertEquals(sslSocketFactory, connection.getSslSocketFactory());
    }

}