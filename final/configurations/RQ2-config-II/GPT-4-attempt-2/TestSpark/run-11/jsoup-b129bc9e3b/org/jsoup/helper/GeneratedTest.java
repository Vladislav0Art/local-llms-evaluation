package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        String url = "https://dummywebsite.com";
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectURLTest() throws MalformedURLException {
        URL url = new URL("https://dummywebsite.com");
        Connection connection = HttpConnection.connect(url);
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url("https://dummywebsite.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void proxyNullTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy((Proxy) null);
        Assert.assertNotNull(connection);
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy("localhost", 8080);
        Assert.assertNotNull(connection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.userAgent("Mozilla/5.0");
        Assert.assertNotNull(connection);
    }

    @Test
    public void dataInvalidNumberOfArgsTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key1", "value1", "key2");
    }

    @Test
    public void dataTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key1", "value1", "key2", "value2");
        Assert.assertNotNull(connection);
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.requestBody("body");
        Assert.assertNotNull(connection);
    }

    @Test
    public void headerTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.header("Accept", "text/html");
        Assert.assertNotNull(connection);
    }

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "text/html");
        Connection connection = httpConnection.headers(headers);
        Assert.assertNotNull(connection);
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.cookie("username", "user1");
        Assert.assertNotNull(connection);
    }

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("username", "user1");
        Connection connection = httpConnection.cookies(cookies);
        Assert.assertNotNull(connection);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.postDataCharset("UTF-8");
        Assert.assertNotNull(connection);
    }

}