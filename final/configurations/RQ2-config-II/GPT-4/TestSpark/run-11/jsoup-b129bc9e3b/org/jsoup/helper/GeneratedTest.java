package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect("https://example.com");
        assertNotNull(connection);
        assertEquals(new URL("https://example.com"), connection.request().url());
    }

    @Test
    public void connectURLTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("https://example.com"));
        assertNotNull(connection);
        assertEquals(new URL("https://example.com"), connection.request().url());
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(new URL("https://example.com"));
        assertEquals(new URL("https://example.com"), httpConnection.request().url());
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        httpConnection.proxy(proxy);
        assertNotNull(httpConnection.request().proxy());
        assertEquals(proxy, httpConnection.request().proxy());
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent("custom-user-agent");
        assertEquals("custom-user-agent", httpConnection.request().userAgent());
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.timeout(10000);
        assertEquals(10000, httpConnection.request().timeout());
    }

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.method(Connection.Method.POST);
        assertEquals(Connection.Method.POST, httpConnection.request().method());
    }

    @Test
    public void dataStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");
        assertFalse(httpConnection.request().data().isEmpty());
        assertEquals("key", httpConnection.request().data().get(0).key());
        assertEquals("value", httpConnection.request().data().get(0).value());
    }

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection httpConnection = new HttpConnection();
        SSLSocketFactory factory = Mockito.mock(SSLSocketFactory.class);
        httpConnection.sslSocketFactory(factory);
        assertEquals(factory, httpConnection.request().sslSocketFactory());
    }

    @Test
    public void dataMapStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        httpConnection.data(data);
        assertFalse(httpConnection.request().data().isEmpty());
        assertEquals("key", httpConnection.request().data().get(0).key());
        assertEquals("value", httpConnection.request().data().get(0).value());
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.requestBody("custom-request-body");
        assertEquals("custom-request-body", httpConnection.request().requestBody());
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = (HttpConnection) HttpConnection.connect("https://example.com");
        httpConnection.userAgent("Mozilla");
        httpConnection.request().method(Connection.Method.GET);
        Connection.Response response = httpConnection.execute();
        assertNotNull(response);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.postDataCharset("UTF-8");
        assertEquals("UTF-8", httpConnection.request().postDataCharset());
    }

}