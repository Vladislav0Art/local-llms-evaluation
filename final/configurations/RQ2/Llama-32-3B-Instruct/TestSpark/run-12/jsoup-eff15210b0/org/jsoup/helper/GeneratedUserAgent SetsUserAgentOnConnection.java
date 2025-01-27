package org.jsoup.helper;

public class GeneratedUserAgent SetsUserAgentOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void userAgent

    SetsUserAgentOnConnection() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertEquals(userAgent, connection.getUserAgent());
    }

}