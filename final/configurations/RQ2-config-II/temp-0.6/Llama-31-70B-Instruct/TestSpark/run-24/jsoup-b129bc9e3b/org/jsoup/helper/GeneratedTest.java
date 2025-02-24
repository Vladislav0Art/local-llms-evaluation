package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testNewRequest() {
        Request request = new HttpConnection().newRequest();
        assertNotNull(request);
    }

    @Test
    public void testUrl() {
        HttpConnection connection = new HttpConnection();
        String url = "https://www.example.com";
        connection.url(url);
        assertEquals(url, connection.request().url().toString());
    }

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.DIRECT, new InetSocketAddress("localhost", 8080));
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

    @Test
    public void testUserAgent() {
        HttpConnection connection = new HttpConnection();
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/86.0.4240.193 Safari/537.36";
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.request().header("User-Agent"));
    }

    @Test
    public void testTimeout() {
        HttpConnection connection = new HttpConnection();
        int timeout = 10000;
        connection.timeout(timeout);
        assertEquals(timeout, connection.request().timeout());
    }

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = new HttpConnection();
        int maxBodySize = 10000;
        connection.maxBodySize(maxBodySize);
        assertEquals(maxBodySize, connection.request().maxBodySize());
    }

}