package org.jsoup.helper;

public class GeneratedSslSocketFactoryTest {

    @Test
    public void sslSocketFactoryTest() throws UncheckedIOException, UncheckedIOException {
        SSLSocketFactory sslSocketFactory = new SSLSocketFactory();
        Connection connection = HttpConnection.connect("https://example.com");
        Connection sslSocketFactoryConn = connection.sslSocketFactory(sslSocketFactory);
        assertNotNull(sslSocketFactoryConn);
    }

}