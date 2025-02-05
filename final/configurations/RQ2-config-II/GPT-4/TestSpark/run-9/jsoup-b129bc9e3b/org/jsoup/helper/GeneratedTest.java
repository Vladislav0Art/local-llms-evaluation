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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void urlURLTest() throws Exception {
        URL url = new URL("http://example.com");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(url);
        assertEquals("http://example.com", httpConnection.request().url().toString());
    }

    @Test
    public void urlStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        assertEquals("http://example.com", httpConnection.request().url().toString());
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent("Mozilla");
        assertEquals("Mozilla", httpConnection.request().userAgent());
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.timeout(1000);
        assertEquals(1000, httpConnection.request().timeout());
    }

    @Test
    public void dataKeyValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");
        Connection.KeyVal data = httpConnection.data("key");
        assertEquals("key", data.key());
        assertEquals("value", data.value());
    }

    @Test
    public void dataMapTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> map = new HashMap<String, String>();
        map.put("key", "value");
        httpConnection.data(map);
        Connection.KeyVal data = httpConnection.data("key");
        assertEquals("key", data.key());
        assertEquals("value", data.value());
    }

    @Test
    public void executeTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        Connection.Response response = httpConnection.execute();
        assertEquals(200, response.statusCode());
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertTrue(httpConnection.request() instanceof Connection.Request);
    }

    @Test
    public void responseTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        httpConnection.execute();
        assertTrue(httpConnection.response() instanceof Connection.Response);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.postDataCharset("UTF-8");
        assertEquals("UTF-8", httpConnection.request().postDataCharset());
    }

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection httpConnection = new HttpConnection();
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        httpConnection.sslSocketFactory(sslSocketFactory);
        assertEquals(sslSocketFactory, httpConnection.request().sslSocketFactory());
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy("192.168.1.1", 8080);
        Proxy proxy = httpConnection.request().proxy();
        assertEquals("192.168.1.1", proxy.address().toString());
    }

    @Test
    public void multiPartDataTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
        InputStream testInputStream = new ByteArrayInputStream("Test".getBytes());
        httpConnection.data("key", "fileName", testInputStream);
        assertTrue(httpConnection.request().data().stream().anyMatch(kv -> kv.hasInputStream()));
    }

}