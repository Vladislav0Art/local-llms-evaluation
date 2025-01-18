package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.URL;
import java.net.MalformedURLException;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(conn);
    }

    @Test
    public void connectStringTest() {
        Connection conn = HttpConnection.connect("http://example.com");
        assertNotNull(conn);
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection conn = new HttpConnection();
        conn.url(new URL("http://example.com"));
        assertEquals("http://example.com", conn.request().url().toString());
    }

    @Test
    public void proxyTest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        HttpConnection conn = new HttpConnection();
        conn.proxy(proxy);
        assertEquals(conn.request().proxy(), proxy);
    }

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent("Mozilla/5.0");
        assertEquals("Mozilla/5.0", conn.request().header("User-Agent"));
    }

    @Test
    public void timeoutTest() {
        HttpConnection conn = new HttpConnection();
        conn.timeout(5000);
        assertEquals(5000, conn.request().timeout());
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection conn = new HttpConnection();
        conn.maxBodySize(1024);
        assertEquals(1024, conn.request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection conn = new HttpConnection();
        conn.followRedirects(true);
        assertTrue(conn.request().followRedirects());
    }

    @Test
    public void referrerTest() {
        HttpConnection conn = new HttpConnection();
        conn.referrer("http://example.com");
        assertEquals("http://example.com", conn.request().header("Referer"));
    }

    @Test
    public void methodTest() {
        HttpConnection conn = new HttpConnection();
        conn.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, conn.request().method());
    }

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory socketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        HttpConnection conn = new HttpConnection();
        conn.sslSocketFactory(socketFactory);
        assertEquals(socketFactory, conn.request().sslSocketFactory());
    }

}