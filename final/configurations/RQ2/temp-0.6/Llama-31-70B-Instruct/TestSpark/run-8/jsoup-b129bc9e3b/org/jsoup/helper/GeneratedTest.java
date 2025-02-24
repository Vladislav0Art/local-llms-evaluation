package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getUrlTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getUrl());
    }

    @Test
    public void setUrlTest() {
        HttpConnection connection = new HttpConnection();
        connection.url("http://localhost");
        assertEquals("http://localhost", connection.getUrl());
    }

    @Test
    public void getProxyTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getProxy());
    }

    @Test
    public void setProxyTest() {
        HttpConnection connection = new HttpConnection();
        connection.proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080)));
        assertEquals(new InetSocketAddress("localhost", 8080), connection.getProxy().address());
    }

    @Test
    public void getUserAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getUserAgent());
    }

    @Test
    public void setUserAgentTest() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36");
        assertEquals("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36", connection.getUserAgent());
    }

}