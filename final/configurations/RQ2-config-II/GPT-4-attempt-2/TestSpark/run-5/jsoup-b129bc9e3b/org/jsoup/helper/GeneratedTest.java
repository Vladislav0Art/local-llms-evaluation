package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlAsStringTest() {
        Connection connection = HttpConnection.connect("https://someurl.com");
        assertNotNull(connection);
    }

    @Test
    public void connectUrlAsUrlTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("https://validurl.com"));
        assertNotNull(connection);
    }

    @Test
    public void connectInvalidUrlTest() {
        HttpConnection.connect("invalidUrl");
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.newRequest();
        assertNotNull(connection);
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.url(new URL("https://validurl.com"));
        assertNotNull(connection);
    }

    @Test
    public void proxyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy("localhost", 8080);
        assertNotNull(connection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.userAgent("Mozilla/5.0");
        assertNotNull(connection);
    }

    @Test
    public void methodTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.method(Connection.Method.POST);
        assertNotNull(connection);
    }

    @Test
    public void requestDataTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.data("key", "value");
        assertNotNull(connection);
    }

    @Test
    public void requestMultipleDataTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> data = new HashMap<>();
        data.put("key1", "value1");
        data.put("key2", "value2");
        Connection connection = httpConnection.data(data);
        assertNotNull(connection);
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.cookie("name", "value");
        assertNotNull(connection);
    }

    @Test
    public void multipleCookiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("cookie1", "value1");
        cookies.put("cookie2", "value2");
        Connection connection = httpConnection.cookies(cookies);
        assertNotNull(connection);
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Document document = httpConnection.get();
        assertNotNull(document);
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Document document = httpConnection.post();
        assertNotNull(document);
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.requestBody("requestBody");
        assertNotNull(connection);
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Response response = httpConnection.execute();
        assertNotNull(response);
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = httpConnection.request();
        assertNotNull(request);
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection httpConnection = new HttpConnection();
        CookieStore cookieStore = httpConnection.cookieStore();
        assertNotNull(cookieStore);
    }

    @Test
    public void proxyNullTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.proxy(null);
        assertNotNull(connection);
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.ignoreHttpErrors(true);
        assertNotNull(connection);
    }

    @Test
    public void headersTest() {
        HttpConnection httpConnection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");
        Connection connection = httpConnection.headers(headers);
        assertNotNull(connection);
    }

}