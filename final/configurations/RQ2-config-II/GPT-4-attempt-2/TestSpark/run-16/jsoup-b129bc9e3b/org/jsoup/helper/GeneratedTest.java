package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() throws Exception {
        Connection con = HttpConnection.connect("https://www.google.com");
        assertTrue(con instanceof HttpConnection);
    }

    @Test
    public void connectUrlTest() throws Exception {
        Connection con = HttpConnection.connect(new URL("https://www.google.com"));
        assertTrue(con instanceof HttpConnection);
    }

    @Test
    public void urlTest() throws Exception {
        HttpConnection con = (HttpConnection) HttpConnection.connect("https://www.google.com");
        con.url(new URL("https://www.example.com"));
        assertEquals("https://www.example.com", con.request().url().toString());
    }

    @Test
    public void userAgentTest() {
        HttpConnection con = new HttpConnection();
        con.userAgent("TestAgent");
        assertEquals("TestAgent", con.request().userAgent());
    }

    @Test
    public void dataMapTest() {
        HttpConnection con = new HttpConnection();
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        con.data(map);
        assertEquals("value", con.request().data().get(0).value());
    }

    @Test
    public void requestTest() {
        HttpConnection con = new HttpConnection();
        Connection.Request reqMock = mock(Connection.Request.class);
        when(reqMock.url()).thenReturn(new URL("https://www.example.com"));
        con.request(reqMock);
        assertEquals("https://www.example.com", con.request().url().toString());
    }

    @Test
    public void executeWithHttpStatusExceptionTest() throws Exception {
        HttpConnection con = (HttpConnection) HttpConnection.connect("https://www.google.com");
        con.proxy(Proxy.NO_PROXY);
        con.response().statusCode();
    }

    @Test
    public void dataWithInvalidArgumentsTest() {
        HttpConnection con = new HttpConnection();
        con.data("key");
    }

}