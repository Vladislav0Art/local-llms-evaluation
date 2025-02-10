package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testConnect() {
        String url = "http://example.com";
        Connection conn = HttpConnection.connect(url);
        assertNotNull(conn);
    }

    @Test
    public void testConnectNullUrl() {
        String url = null;
        Connection conn = HttpConnection.connect(url);
        assertNull(conn);
    }

    @Test
    public void testUrl() {
        URL url = new URL("http://example.com");
        Connection conn = HttpConnection.url(url);
        assertNotNull(conn);
    }

    @Test
    public void testUrlNullUrl() {
        String url = null;
        URL u = new URL(url);
        assertNull(u);
    }

    @Test
    public void testProxy() {
        Proxy.Type httpType = Proxy.Type.HTTP;
        InetSocketAddress address = new InetSocketAddress("proxy.example.com", 8080);
        Connection conn = HttpConnection.proxy(httpType, address);
        assertNotNull(conn);
    }

    @Test
    public void testProxyNullHost() {
        String host = null;
        int port = 8080;
        Connection conn = HttpConnection.proxy(host, port);
        assertNull(conn);
    }

    @Test
    public void testProxyNullPort() {
        String host = "example.com";
        int port = null;
        Connection conn = HttpConnection.proxy(host, port);
        assertNull(conn);
    }

}