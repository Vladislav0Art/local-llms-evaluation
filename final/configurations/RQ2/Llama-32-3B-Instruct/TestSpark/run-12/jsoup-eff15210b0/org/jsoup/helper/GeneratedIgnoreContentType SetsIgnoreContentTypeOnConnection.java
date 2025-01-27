package org.jsoup.helper;

public class GeneratedIgnoreContentType SetsIgnoreContentTypeOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void ignoreContentType

    SetsIgnoreContentTypeOnConnection() {
        boolean ignoreContentType = true;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertTrue(connection.isIgnoreContentType());
    }

}