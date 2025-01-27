package org.jsoup.helper;

public class GeneratedReferrer SetsReferrerOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void referrer

    SetsReferrerOnConnection() {
        String referrer = "https://example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertEquals(referrer, connection.getReferer());
    }

}