package org.jsoup.helper;

import org.hamcrest.CoreMatchers;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.*;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void urlURLTest() throws Exception {
        URL url = new URL("http://example.com");
        HttpConnection connection = new HttpConnection();
        Connection returnedConn = connection.url(url);
        assertEquals(returnedConn, connection);
    }

    @Test
    public void urlStringTest() {
        HttpConnection connection = new HttpConnection();
        Connection returnedConn = connection.url("http://example.com");
        assertEquals(returnedConn, connection);
    }

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, null);
        Connection returnedConn = connection.proxy(proxy);
        assertEquals(returnedConn, connection);
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        Connection returnedConn = connection.proxy("127.0.0.1", 8080);
        assertEquals(returnedConn, connection);
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        connection.url("http://example.com");
        Document doc = connection.get();
        assertNotNull(doc);
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.method(Connection.Method.POST);
        connection.url("http://example.com");
        Document doc = connection.post();
        assertNotNull(doc);
    }

    @Test
    public void requestTest() {
        HttpConnection connection = new HttpConnection();
        Connection.Request request = connection.request();
        assertNotNull(request);
    }

    @Test
    public void responseTest() {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.response();
        assertNotNull(response);
    }

    @Test
    public void executeHTTPMockTest() throws IOException {
        HttpConnection connection = Mockito.mock(HttpConnection.class);
        Mockito.when(connection.execute()).thenReturn(Mockito.mock(Connection.Response.class));
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}