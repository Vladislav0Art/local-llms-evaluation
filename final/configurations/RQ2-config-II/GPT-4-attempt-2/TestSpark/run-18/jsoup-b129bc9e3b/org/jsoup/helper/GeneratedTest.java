package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void connectWithURLTest() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertEquals(url, connection.request().url());
    }

    @Test
    public void connectWithStringTest() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertEquals(url, connection.request().url().toString());
    }

    @Test
    public void urlTest() {
        String url = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection.url(url);
        assertEquals(url, connection.request().url().toString());
    }

    @Test
    public void proxyTest() {
        Proxy proxy = Mockito.mock(Proxy.class);
        HttpConnection connection = new HttpConnection();
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

    @Test
    public void userAgentTest() {
        String userAgent = "Mozilla/5.0";
        HttpConnection connection = new HttpConnection();
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.request().userAgent());
    }

    @Test
    public void timeoutTest() {
        int timeout = 5000;
        HttpConnection connection = new HttpConnection();
        connection.timeout(timeout);
        assertEquals(timeout, connection.request().timeout());
    }

}