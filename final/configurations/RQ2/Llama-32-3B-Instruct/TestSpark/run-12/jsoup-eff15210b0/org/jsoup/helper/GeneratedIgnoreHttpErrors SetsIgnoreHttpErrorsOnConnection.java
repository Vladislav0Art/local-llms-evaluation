package org.jsoup.helper;

public class GeneratedIgnoreHttpErrors SetsIgnoreHttpErrorsOnConnection {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Test
    public void ignoreHttpErrors

    SetsIgnoreHttpErrorsOnConnection() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertTrue(connection.isIgnoreHttpErrors());
    }

}