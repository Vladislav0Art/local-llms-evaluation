package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void connect_url_isNotNullTest() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void connect_url_isNotNullTest() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertFalse(connection == null);
    }

    @Test
    public void connect_url_withNullUrl_ThrowsExceptionTest() {
        try {
            String url = null;
            HttpConnection.connect(url);
            fail();
        } catch (UncheckedIOException e) {
            assertEquals("url", e.getMessage());
        }
    }

    @Test
    public void post_request_isNotNullTest() {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.POST);
        Connection.Request request = connection.request();
        assertNotNull(request);
    }

    @Test
    public void get_request_isNotNullTest() {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        Connection.Request request = connection.request();
        assertNotNull(request);
    }

    @Test
    public void execute_response_isNotNullTest() throws IOException {
        Connection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

    @Test
    public void headers_isNotNullTest() {
        Connection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        connection.headers(headers);
        assertNotNull(connection.request().headers());
    }

}