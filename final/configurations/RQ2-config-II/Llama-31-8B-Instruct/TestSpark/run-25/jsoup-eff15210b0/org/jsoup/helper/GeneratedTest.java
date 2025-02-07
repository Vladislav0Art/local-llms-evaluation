package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.Connection.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.jsoup.Connection.Method.GET;
import static org.jsoup.Connection.Method.POST;
import static org.jsoup.Connection.Method.HEAD;
import static org.jsoup.Connection.Method.PUT;
import static org.jsoup.Connection.Method.DELETE;
import static org.jsoup.Connection.Method.OPTIONS;
import static org.jsoup.Connection.Method.TRACE;
import static org.jsoup.Connection.Method.CONNECT;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private HttpConnection httpConnection;

    @Test
    public void connect_StringTest() {
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertEquals("https://www.example.com", connection.url().url().toString());
    }

    @Test
    public void connect_URLTest() {
        Connection connection = HttpConnection.connect(new URL("https://www.example.com"));
        assertEquals("https://www.example.com", connection.url().url().toString());
    }

    @Test
    public void newRequestTest() {
        Connection connection = httpConnection.newRequest();
        assertEquals(connection, connection.request());
    }

    @Test
    public void url_StringTest() {
        Connection connection = httpConnection.url("https://www.example.com");
        assertEquals("https://www.example.com", connection.url().url().toString());
    }

    @Test
    public void url_URLTest() {
        Connection connection = httpConnection.url(new URL("https://www.example.com"));
        assertEquals("https://www.example.com", connection.url().url().toString());
    }

    @Test
    public void proxy_ProxyTest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection connection = httpConnection.proxy(proxy);
        assertEquals(proxy, connection.proxy());
    }

}