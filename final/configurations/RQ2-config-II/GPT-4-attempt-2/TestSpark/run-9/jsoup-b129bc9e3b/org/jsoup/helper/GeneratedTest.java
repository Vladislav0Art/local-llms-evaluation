package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectInvalidStringUrlTest() {
        HttpConnection.connect("invalid_url");
    }

    @Test
    public void connectUrlTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertNotNull(httpConnection.newRequest());
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals("http://example.com", httpConnection.url(new URL("http://example.com")).request().url().toString());
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = Proxy.NO_PROXY;
        assertSame(proxy, httpConnection.proxy(proxy).request().proxy());
    }

    @Test
    public void proxyStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = httpConnection.proxy("127.0.0.1", 8888).request().proxy();
        assertNotNull(proxy);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals("agent", httpConnection.userAgent("agent").request().userAgent());
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals(3000, httpConnection.timeout(3000).request().timeout());
    }

    @Test
    public void getTest() throws IOException {
        Document document = HttpConnection.connect("http://example.com").get();
        assertNotNull(document);
    }

    @Test
    public void getInvalidUrlTest() throws IOException {
        HttpConnection.connect("http://invalid.domain").get();
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = HttpConnection.connect("http://invalid.domain");
        httpConnection.execute();
    }

    @Test
    public void dataStringTest() {
        HttpConnection connection = new HttpConnection();
        connection.data("key", "value");
        assertEquals("value", connection.request().data().get(0).value());
    }

    @Test
    public void dataMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        connection.data(data);
        assertEquals("value", connection.request().data().get(0).value());
    }

    @Test
    public void cookiesTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("test_cookie", "test_value");
        connection.cookies(cookies);
        assertEquals("test_value", connection.request().cookies().get("test_cookie"));
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals("UTF-8", connection.postDataCharset("UTF-8").request().postDataCharset());
    }

}