package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private HttpURLConnection connection;

    @InjectMocks
    private Connection httpConnection;

    @Test
    public void connect_URL_test() throws IOException {
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url(connection)) {
            assert c.getURL().toString().equals("http://example.com");
        }
    }

    @Test
    public void connect_string_url_test() throws IOException {
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url("http://example.com")) {
            assert c.getURL().toString().equals("http://example.com");
        }
    }

    @Test
    public void connectProxy_test() throws IOException {
        when(connection.getProxy()).thenReturn(new Proxy(Proxy.Type.HTTP, "proxy.example.com", 8080));
        try (Connection c = httpConnection.proxy(connection)) {
            assert c.getProxy().toString().equals("proxy.example.com:8080");
        }
    }

    @Test
    public void connect_proxy_string_test() throws IOException {
        when(connection.getProxy()).thenReturn(new Proxy(Proxy.Type.HTTP, "proxy.example.com", 8080));
        try (Connection c = httpConnection.proxy("http://proxy.example.com:8080")) {
            assert c.getProxy().toString().equals("proxy.example.com:8080");
        }
    }

    @Test
    public void url_connection_test() throws IOException {
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url(connection)) {
            assert c.getURL().toString().equals("http://example.com");
        }
    }

    @Test
    public void url_string_url_test() throws IOException {
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url("http://example.com")) {
            assert c.getURL().toString().equals("http://example.com");
        }
    }

    @Test
    public void connect_MOCK_connection_getRequest_test() throws IOException {
        Connection.Request request = new Connection.Request();
        when(connection.getRequestMethod()).thenReturn(Connection.Method.GET);
        try (Connection c = httpConnection.newRequest()) {
            assert c.getRequest().getMethod().equals(Connection.Method.GET);
        }
    }

    @Test
    public void connect_string_url_getRequest_test() throws IOException {
        Connection.Request request = new Connection.Request();
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url("http://example.com")) {
            assert c.getRequest().getMethod().equals(Connection.Method.GET);
        }
    }

    @Test
    public void getResponse_test() throws IOException {
        Connection.Response response = new Connection.Response();
        when(connection.getResponse()).thenReturn(response);
        try (Connection c = httpConnection.connect(new URL("http://example.com"))) {
            assert c.getResponse().equals(response);
        }
    }

    @Test
    public void postResponse_test() throws IOException {
        Connection.Response response = new Connection.Response();
        when(connection.getResponse()).thenReturn(response);
        try (Connection c = httpConnection.connect(new URL("http://example.com"), Connection.Method.POST)) {
            assert c.getResponse().equals(response);
        }
    }

    @Test
    public void executeResponse_test() throws IOException {
        Connection.Response response = new Connection.Response();
        when(connection.getResponse()).thenReturn(response);
        try (Connection c = httpConnection.connect(new URL("http://example.com"))) {
            assert c.execute().getResponse().equals(response);
        }
    }

    @Test
    public void connect_string_url_postDataCharset_test() throws IOException {
        Map<String, String> data = new HashMap<>();
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.url("http://example.com")) {
            c.postDataCharset(UTF_8);
            assert c.getRequest().getHeaders().containsKey("Content-Type");
        }
    }

    @Test
    public void connect_MOCK_connection_postDataCharset_test() throws IOException {
        Connection.Request request = new Connection.Request();
        Map<String, String> data = new HashMap<>();
        when(connection.getURL()).thenReturn(new URL("http://example.com"));
        try (Connection c = httpConnection.connect(new URL("http://example.com"))) {
            c.postDataCharset(UTF_8);
            assert request.getHeaders().containsKey("Content-Type");
        }
    }

}