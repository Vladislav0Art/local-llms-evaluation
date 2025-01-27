package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void connectUrl() {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertNull(conn.request());
    }

    @Test
    public void connectString() {
        Connection conn = HttpConnection.connect("http://example.com");
        assertNull(conn.request());
    }

    @Test
    public void newRequest() {
        Connection conn = HttpConnection.newRequest();
        assertNotNull(conn);
        assertTrue(conn instanceof Connection);
    }

    @Test
    public void urlURL() {
        URL url = new URL("http://example.com");
        Connection conn = HttpConnection.url(url);
        assertNull(conn.request());
    }

    @Test
    public void urlString() {
        String url = "http://example.com";
        Connection conn = HttpConnection.url(url);
        assertNull(conn.request());
    }

    @Test
    public void proxyProxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("host", 8080));
        Connection conn = HttpConnection.proxy(proxy);
        assertNull(conn.request());
    }

    @Test
    public void proxyStringHostPort() {
        String host = "host";
        int port = 8080;
        Connection conn = HttpConnection.proxy(host, port);
        assertNull(conn.request());
    }

    @Test
    public void userAgent() {
        String userAgent = "User-Agent";
        Connection conn = HttpConnection.userAgent(userAgent);
        assertNotNull(conn.request());
        assertEquals(userAgent, conn.request().header(Connection.Header.USER_AGENT));
    }

    @Test
    public void timeout() {
        int millis = 1000;
        Connection conn = HttpConnection.timeout(millis);
        assertNotNull(conn.request());
        assertTrue(conn.request().timeout(millis));
    }

    @Test
    public void maxBodySize() {
        int bytes = 1024;
        Connection conn = HttpConnection.maxBodySize(bytes);
        assertNotNull(conn.request());
        assertEquals(bytes, conn.request().maxBodySize(bytes));
    }

    @Test
    public void followRedirects() {
        boolean followRedirects = true;
        Connection conn = HttpConnection.followRedirects(followRedirects);
        assertNotNull(conn.request());
        assertTrue(conn.request().followRedirects(followRedirects));
    }

    @Test
    public void referrer() {
        String referrer = "Referer";
        Connection conn = HttpConnection.referrer(referrer);
        assertNotNull(conn.request());
        assertEquals(referrer, conn.request().header(Connection.Header.REFERER));
    }

    @Test
    public void method() {
        Method method = Connection.Method.GET;
        Connection conn = HttpConnection.method(method);
        assertNotNull(conn.request());
        assertEquals(method, conn.request().method());
    }

    @Test
    public void ignoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection conn = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(conn.request());
        assertTrue(conn.request().ignoreHttpErrors(ignoreHttpErrors));
    }

    @Test
    public void ignoreContentType() {
        boolean ignoreContentType = false;
        Connection conn = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(conn.request());
        assertFalse(conn.request().ignoreContentType(ignoreContentType));
    }

    @Test
    public void dataKeyVal() {
        String key = "key";
        String value = "value";
        Connection conn = HttpConnection.data(key, value);
        assertNotNull(conn.request());
        assertEquals(key, conn.request().data().get(Connection.KeyVal.KEY).getKey());
        assertEquals(value, conn.request().data().get(Connection.KeyVal.VALUE).getValue());
    }

    @Test
    public void dataMap() {
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        Connection conn = HttpConnection.data(data);
        assertNotNull(conn.request());
        assertEquals(1, data.size());
    }

    @Test
    public void requestBody() {
        String body = "body";
        Connection conn = HttpConnection.postDataCharset(body);
        assertNotNull(conn.request());
        assertEquals(body, conn.request().postData().getValue());
    }

}