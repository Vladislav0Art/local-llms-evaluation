package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.helper.HttpConnection;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;
import java.net.MalformedURLException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void connectWithStringUrlTest() throws MalformedURLException {
        Connection conn = HttpConnection.connect("http://example.com");
        assertEquals(new URL("http://example.com"), conn.request().url());
    }

    @Test
    public void connectWithUrlTest() throws MalformedURLException {
        Connection conn = HttpConnection.connect(new URL("http://example.com"));
        assertEquals(new URL("http://example.com"), conn.request().url());
    }

    @Test
    public void newRequestTest() {
        HttpConnection conn = new HttpConnection();

        Connection newConn = conn.newRequest();
        assertNotEquals(newConn, conn);
    }

    @Test
    public void urlWithStringTest() throws MalformedURLException {
        HttpConnection conn = new HttpConnection();
        conn.url("http://example.com");
        assertEquals(new URL("http://example.com"), conn.request().url());
    }

    @Test
    public void urlWithUrlTest() throws MalformedURLException {
        HttpConnection conn = new HttpConnection();
        conn.url(new URL("http://example.com"));
        assertEquals(new URL("http://example.com"), conn.request().url());
    }

    @Test
    public void proxyWithHostAndPortTest() {
        HttpConnection conn = new HttpConnection();
        conn.proxy("example.com", 8000);
        assertEquals("example.com", ((InetSocketAddress) conn.request().proxy().address()).getHostName());
        assertEquals(8000, ((InetSocketAddress) conn.request().proxy().address()).getPort());
    }

    @Test
    public void proxyWithProxyObjectTest() {
        HttpConnection conn = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8000));
        conn.proxy(proxy);
        assertEquals(proxy, conn.request().proxy());
    }

    @Test
    public void userAgentTest() {
        HttpConnection conn = new HttpConnection();
        conn.userAgent("TestAgent");
        assertEquals("TestAgent", conn.request().userAgent());
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
        conn.maxBodySize(100000);
        assertEquals(100000, conn.request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection conn = new HttpConnection();
        conn.followRedirects(false);
        assertFalse(conn.request().followRedirects());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection conn = new HttpConnection();
        conn.ignoreHttpErrors(true);
        assertTrue(conn.request().ignoreHttpErrors());
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection conn = new HttpConnection();
        conn.ignoreContentType(true);
        assertTrue(conn.request().ignoreContentType());
    }

    @Test
    public void dataWithKeyValTest() {
        HttpConnection conn = new HttpConnection();
        conn.data("key1", "value1", "key2");
    }

    @Test
    public void requestBodyTest() {
        HttpConnection conn = new HttpConnection();
        conn.requestBody("This is a test");
        assertEquals("This is a test", conn.request().requestBody());
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com").method(Connection.Method.GET);
        assertNotNull(connection.execute());
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection conn = new HttpConnection();
        conn.postDataCharset("UTF-8");
        assertEquals("UTF-8", conn.request().postDataCharset());
    }

}