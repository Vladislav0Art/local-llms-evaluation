package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://test.com");
        assertNotNull(connection);
    }

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://test.com"));
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.newRequest());
    }

    @Test
    public void urlURLTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.url(new URL("http://test.com")));
    }

    @Test
    public void urlStringTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.url("http://test.com"));
    }

    @Test
    public void proxyTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.proxy(new Proxy(Proxy.Type.DIRECT, null)));
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.proxy("localhost", 8080));
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.userAgent("Mozilla"));
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.timeout(5000));
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.maxBodySize(2048));
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.followRedirects(true));
    }

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.referrer("http://test.com"));
    }

    @Test
    public void methodTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.method(Connection.Method.GET));
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.ignoreHttpErrors(true));
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.ignoreContentType(true));
    }

    @Test
    public void dataKeyValueTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.data("key", "value"));
    }

    @Test
    public void sslSocketFactoryTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = SSLContext.getDefault().getSocketFactory();
        assertEquals(connection, connection.sslSocketFactory(sslSocketFactory));
    }

    @Test
    public void dataKeyFileNameInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.data("key", "filename", InputStream.nullInputStream()));
    }

    @Test
    public void dataKeyFileNameInputStreamContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(connection, connection.data("key", "filename", InputStream.nullInputStream(), "image/png"));
    }

    @Test
    public void dataMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        assertEquals(connection, connection.data(data));
    }

}