package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectWithUrlStringTest() {
        Connection conn = HttpConnection.connect("https://www.google.com");
        assertNotNull(conn);
    }

    @Test
    public void connectWithEmptyUrlStringTest() {
        HttpConnection.connect("");
    }

    @Test
    public void connectWithURLObjectTest() throws Exception {
        Connection conn = HttpConnection.connect(new URL("https://www.google.com"));
        assertNotNull(conn);
    }

    @Test
    public void newRequestTest() {
        HttpConnection conn = new HttpConnection();
        assertNotNull(conn.newRequest());
    }

    @Test
    public void urlWithUrlStringTest() {
        HttpConnection conn = new HttpConnection();
        assertNotNull(conn.url("https://www.google.com"));
    }

    @Test
    public void urlWithURLObjectTest() throws Exception {
        HttpConnection conn = new HttpConnection();
        assertNotNull(conn.url(new URL("https://www.google.com")));
    }

    @Test
    public void proxyTest() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8080));
        HttpConnection conn = new HttpConnection();
        Connection returnConn = conn.proxy(proxy);
        assertNotNull(returnConn);
    }

    @Test
    public void proxyWithHostAndPortTest() {
        HttpConnection conn = new HttpConnection();
        Connection returnConn = conn.proxy("127.0.0.1", 8080);
        assertNotNull(returnConn);
    }

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        Connection returnConn = conn.userAgent("Mozilla");
        assertNotNull(returnConn);
    }

}