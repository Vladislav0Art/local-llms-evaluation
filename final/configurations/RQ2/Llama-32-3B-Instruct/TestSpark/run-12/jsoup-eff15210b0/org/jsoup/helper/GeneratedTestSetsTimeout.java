package org.jsoup.helper;

public class GeneratedTestSetsTimeout {

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
    public void testSetsTimeout() throws IOException, InterruptedException {
        int millis = 10000;
        Connection connection = setsTimeoutOnConnection(createConnection(), millis);
        assertEquals(millis, getCookie(connection));
    }

}