package org.jsoup.helper;

public class GeneratedTimeout SetsTimeoutOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void timeout

    SetsTimeoutOnConnection() {
        int millis = 1000;
        Connection connection = HttpConnection.timeout(millis);
        assertEquals(millis, connection.getTimeout());
    }

}