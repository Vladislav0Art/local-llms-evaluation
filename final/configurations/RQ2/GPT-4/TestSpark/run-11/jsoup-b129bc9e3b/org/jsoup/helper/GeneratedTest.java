package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        Assert.assertNotNull(connection);
    }

    @Test
    public void urlURLTest() throws Exception {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url(new URL("http://example.com"));
    }

    @Test
    public void urlStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("http://example.com");
    }

    @Test
    public void proxyProxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy(Proxy.NO_PROXY);
    }

    @Test
    public void proxyStringIntTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.proxy("localhost", 8080);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent("Mozilla/5.0");
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.timeout(5000);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.maxBodySize(1024);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.followRedirects(true);
    }

    @Test
    public void referrerTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.referrer("http://example.com");
    }

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.method(Connection.Method.GET);
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.ignoreHttpErrors(true);
    }

    @Test
    public void ignoreContentTypeTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.ignoreContentType(true);
    }

    @Test
    public void dataStringStringTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");
    }

    @Test
    public void dataStringStringInputStreamTest() {
        HttpConnection httpConnection = new HttpConnection();
        InputStream dummyStream = new ByteArrayInputStream("dummyStream".getBytes());
        httpConnection.data("key", "fileName", dummyStream);
    }

    @Test
    public void dataMapTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key", "value");
        httpConnection.data(data);
    }

    @Test
    public void dataArrayTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key1", "value1", "key2", "value2");
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.requestBody("dummyRequestBody");
    }

    @Test
    public void headerTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.header("Content-Type", "application/json");
    }

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        httpConnection.headers(headers);
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookie("cookieName", "cookieValue");
    }

    @Test
    public void cookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookieName", "cookieValue");
        httpConnection.cookies(cookies);
    }

    @Test
    public void executeTest() throws Exception {
        Connection connection = HttpConnection.connect("http://example.com");
        Connection.Response response = connection.execute();
        Assert.assertNotNull(response);
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertNotNull(httpConnection.request());
    }

    @Test
    public void responseTest() {
        HttpConnection httpConnection = new HttpConnection();
        Assert.assertNotNull(httpConnection.response());
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.postDataCharset("UTF-8");
    }

    @Test
    public void getTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.get();
        Assert.assertNotNull(document);
    }

    @Test
    public void postTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.post();
        Assert.assertNotNull(document);
    }

}