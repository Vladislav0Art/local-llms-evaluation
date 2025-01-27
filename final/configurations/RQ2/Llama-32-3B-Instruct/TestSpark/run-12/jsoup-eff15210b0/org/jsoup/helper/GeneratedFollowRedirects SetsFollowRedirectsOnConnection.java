package org.jsoup.helper;

public class GeneratedFollowRedirects SetsFollowRedirectsOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void followRedirects

    SetsFollowRedirectsOnConnection() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertTrue(connection.isFollowRedirects());
    }

}