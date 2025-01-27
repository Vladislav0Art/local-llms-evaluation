package org.jsoup.helper;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTestGetAcceptableResponse_ReturnsResponse {

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
        return conn;
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

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class TestHttpConnection {

    @Mock
    private Connection conn;

    @Test
    public void testGetAcceptableResponse_ReturnsResponse() throws IOException, SQLException {
        HttpConnection httpConn = new HttpConnection();
        httpConn.setUrl("https://example.com");
        httpConn.conn = mock(Connection.class);
        when(httpConn.conn.openConnection()).thenReturn(mock(OutputStream.class));
        when((Response) httpConn.execute()).thenReturn(new Response("data"));

        Response response = (Response) httpConn.execute();

        assertNotNull(response);
    }

}