package org.jsoup.helper;

public class GeneratedTestSetsSslSocketFactory {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    public static Connection setsUserAgentOnConnection(Connection connection, String userAgent) {
        connection.set UserAgent (userAgent);
        return connection;
    }

    public static Connection setsTimeoutOnConnection(Connection connection, int millis) {
        connection.setTimeout(millis);
        return connection;
    }

    public static Connection setsMaxBodySizeOnConnection(Connection connection, int bytes) {
        connection.setMaxBodySize(bytes);
        return connection;
    }

    public static Connection setsFollowRedirectsOnConnection(Connection connection, boolean followRedirects) {
        connection.setFollowRedirects(followRedirects);
        return connection;
    }

    public static Connection setsReferrerOnConnection(Connection connection, String referrer) {
        connection.setReferer(referrer);
        return connection;
    }

    public static Connection setsMethodOnConnection(Connection connection, Method method) {
        connection.setMethod(method);
        return connection;
    }

    public static Connection setsIgnoreHttpErrorsOnConnection(Connection connection, boolean ignoreHttpErrors) {
        connection.setIgnoreHttpErrors(ignoreHttpErrors);
        return connection;
    }

    public static Connection setsIgnoreContentTypeOnConnection(Connection connection, boolean ignoreContentType) {
        connection.setIgnoreContentType(ignoreContentType);
        return connection;
    }

    public static Connection setsDataOnConnection(Connection connection, Map<String, String> data) {
        connection.setData(data);
        return connection;
    }

    public static Connection setsSslSocketFactoryOnConnection(Connection connection, SSLSocketFactory sslSocketFactory) {
        connection.setSslSocketFactory(sslSocketFactory);
        return connection;
    }

    @Test
    public void testSetsSslSocketFactory() throws IOException, InterruptedException {
        SSLSocketFactory sslSocketFactory = createSSLsocketFactory();
        Connection connection = setsSslSocketFactoryOnConnection(createConnection(), sslSocketFactory);
        assertEquals(sslSocketFactory, getCookie(connection));
    }

    private Connection createConnection() throws IOException, InterruptedException {
        // implement the logic to create a connection
        return null; // replace with your implementation
    }

    private SSLSocketFactory createSSLsocketFactory() throws Exception {
        // implement the logic to create an SSL socket factory
        return null; // replace with your implementation
    }

    private String getCookie(Connection connection) {
        // implement the logic to extract the cookie from the connection
        return null; // replace with your implementation
    }

}