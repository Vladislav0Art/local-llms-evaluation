package org.jsoup.helper;

public class GeneratedTest {

    public String data = "";
}

public class OutputStream {
}

public class HttpConnection {
    private String url;
    private Connection conn;

    public void setUrl(String url) {
        this.url = url;
    }

    public Response get() throws IOException, SQLException {
        // Simulate a malformed response
        throw new IOException("Malformed response");
    }

    public Response post() throws IOException, SQLException {
        // Simulate a malformed response
        throw new IOException("Malformed response");
    }

    public Connection execute() throws IOException, SQLException {
        // Simulate an acceptable response
        return this.conn;
    }
}

public class Response {
    private String data;

    public Response(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

public class TestHttpConnection {

    public Connection createConn() {
        Connection conn = new Connection();
        return conn;
    }

    @Test
    public void get_MalformedResponse_ThrowsIOException() {
        assertThrows(IOException.class, () -> new HttpConnection().get());
    }

    @Test
    public void execute_MalformedResponse_ThrowsIOException() {
        assertThrows(IOException.class, () -> new HttpConnection().execute());
    }

}