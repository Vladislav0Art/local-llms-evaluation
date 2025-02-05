package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectURLTest() throws IOException {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        Assertions.assertNotNull(connection);
    }

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        Assertions.assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.newRequest();
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void urlTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.url("http://example.com");
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection newConnection = connection.proxy(proxy);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void proxyHostPortTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.proxy("localhost", 8080);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.userAgent("Mozilla/5.0");
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.timeout(5000);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.maxBodySize(1024);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.followRedirects(false);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void referrerTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.referrer("http://example.com");
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Document document = connection.get();
        Assertions.assertNotNull(document);
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Document document = connection.post();
        Assertions.assertNotNull(document);
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.execute();
        Assertions.assertNotNull(response);
    }

    @Test
    public void requestTest() {
        HttpConnection connection = new HttpConnection();
        Connection.Request request = connection.request();
        Assertions.assertNotNull(request);
    }

    @Test
    public void responseTest() {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.response();
        Assertions.assertNotNull(response);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection connection = new HttpConnection();
        Connection newConnection = connection.postDataCharset("UTF-8");
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        Connection newConnection = connection.headers(headers);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void cookiesTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("token", "abcd1234");
        Connection newConnection = connection.cookies(cookies);
        Assertions.assertNotNull(newConnection);
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection connection = new HttpConnection();
        CookieStore cookieStore = new CookieStore();
        Connection newConnection = connection.cookieStore(cookieStore);
        Assertions.assertNotNull(newConnection);
    }

}