package org.jsoup.helper;

import org.jsoup.Connection.Method;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void urlTest() {
        HttpConnection httpConn = new HttpConnection();
        URL url = mock(URL.class);
        assertEquals(httpConn, httpConn.url(url));
    }

    @Test
    public void urlStringTest() {
        HttpConnection httpConn = new HttpConnection();
        String url = "http://www.example.com/";
        assertEquals(httpConn, httpConn.url(url));
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConn = new HttpConnection();
        Proxy proxy = mock(Proxy.class);
        assertEquals(httpConn, httpConn.proxy(proxy));
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection httpConn = new HttpConnection();
        String host = "example.com";
        int port = 80;
        assertEquals(httpConn, httpConn.proxy(host, port));
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConn = new HttpConnection();
        String userAgent = "Chrome";
        assertEquals(httpConn, httpConn.userAgent(userAgent));
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConn = new HttpConnection();
        int timeout = 30000;
        assertEquals(httpConn, httpConn.timeout(timeout));
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConn = new HttpConnection();
        int maxBodySize = 1000;
        assertEquals(httpConn, httpConn.maxBodySize(maxBodySize));
    }

}