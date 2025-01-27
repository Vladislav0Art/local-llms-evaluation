package org.jsoup.helper;

public class GeneratedUrlURL_DirectCallReturnsInstance {

    public MalformedURLException() {
    }
}

public class HttpConnection {

    private Connection connection;

    public Connection connect(URL url) throws MalformedURLException {
        if (url.getProtocol() == null || !url.toString().startsWith("http")) {
            throw new MalformedURLException();
        }
        this.connection = mock(Connection.class);
        return this.connection;
    }

    public String url(String s) {
        return s;
    }

    public Connection proxy(Object o) {
        return connection;
    }

    public Connection request() {
        return connection;
    }

    public Connection.Response execute() {
        return connection;
    }
}

public class HttpConnectionTest {

    @Test
    public void urlURL_DirectCallReturnsInstance() {
        when(HttpConnection.connect(any(URL.class))).thenReturn(mock(Connection.class));
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
        assertTrue(connection instanceof Connection);
    }

}