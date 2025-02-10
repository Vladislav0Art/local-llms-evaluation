package org.jsoup.helper;

public class GeneratedTest {

    private String body;

    public HttpConnectionRequest(String body) {
        this.body = body;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HttpConnectionRequest that = (HttpConnectionRequest) o;
        return body != null ? body.equals(that.body) : that.body == null;
    }

    public int hashCode() {
        return body != null ? body.hashCode() : 0;
    }
}

public class HttpConnectionResponse {
    private String body;

    public HttpConnectionResponse(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
}

public class HttpConnectionTest {

    @Test
    public void newRequest() throws Exception {
        // given
        Connection connection = null;

        // when and then
        Connection result = connection.newRequest();
        assertNotNull(result);
    }

    @Test
    public void url() throws Exception {
        // given
        String url = "http://example.com";
        Connection connection = null;
        URL u = null;

        // when
        connection.url(url);

        // then
        assertEquals(u, connection.url(u));
    }

    @Test
    public void connect() throws Exception {
        // given
        String url = "http://example.com";

        // when and then
        Connection result = HttpConnection.connect(url);
        assertNotNull(result);
    }

    @Test
    public void encodeUrl() throws Exception {
        // given
        URL u = new URL("http://example.com");

        // when and then
        String encoded = HttpConnection.encodeUrl(u);
        assertNotEquals(u.toString(), encoded);
    }

    @Test
    public void connectRequest() throws Exception {
        // given
        Request request = null;
        Connection connection = null;

        // when
        connection.connect(request);

        // then
        assertNotNull(connection.request());
    }

    @Test
    public void urlURL() throws Exception {
        // given
        URL u = new URL("http://example.com");
        Connection connection = null;

        // when and then
        connection.url(u);

        // then
        assertEquals(u, connection.url(u));
    }
}

public class Main {
    public static Connection newRequest(Connection connection) {
        return connection.newRequest();
    }

    public static Connection url(Connection connection, String url) {
        return connection.url(url);
    }

    public static Connection connect(String url) {
        return HttpConnection.connect(url);
    }

    public static String encodeUrl(URL u) {
        return HttpConnection.encodeUrl(u);
    }

    public static void connect(Request request, Connection connection) {
        connection.connect(request);
    }

    public static Connection request(Connection connection) {
        return connection.request();
    }

    public static Connection url(Connection connection, URL url) {
        return connection.url(url);
    }

}