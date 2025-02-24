package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void urlTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        URL url = new URL("https://www.example.com");
        connection.url(url);
        assertEquals("https://www.example.com", connection.getUrl().toString());
    }

    @Test
    public void urlStringTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.url("https://www.example.com");
        assertEquals("https://www.example.com", connection.getUrl().toString());
    }

    @Test
    public void proxyTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
        connection.proxy(proxy);
        assertEquals(proxy, connection.getProxy());
    }

    @Test
    public void proxyStringAndPortTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        connection.proxy("127.0.0.1", 8080);
        assertEquals("127.0.0.1", connection.getProxy().address().toString());
        assertEquals(8080, ((InetSocketAddress) connection.getProxy().address()).getPort());
    }

}