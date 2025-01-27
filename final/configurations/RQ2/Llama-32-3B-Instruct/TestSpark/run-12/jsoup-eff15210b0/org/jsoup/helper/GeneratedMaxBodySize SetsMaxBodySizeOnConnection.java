package org.jsoup.helper;

public class GeneratedMaxBodySize SetsMaxBodySizeOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void maxBodySize

    SetsMaxBodySizeOnConnection() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertEquals(bytes, connection.getMaxBodySize());
    }

}