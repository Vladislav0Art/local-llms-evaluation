package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectStringUrlInvalidTest() {
        Connection connection = HttpConnection.connect("invalidurl");
    }

    @Test
    public void connectUrlTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection connection = httpConnection.newRequest();
        assertNotNull(connection);
    }

    @Test
    public void urlWithUrlTest() throws MalformedURLException {
        HttpConnection httpConnection = new HttpConnection();
        URL url = new URL("http://example.com");
        httpConnection.url(url);
    }

    @Test
    public void urlWithStringInvalidUrlTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.url("invalidurl");
    }

    @Test
    public void userAgentTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.userAgent("Mozilla");
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.timeout(2000);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.maxBodySize(2000);
    }

    @Test
    public void dataWithKeyAndValueTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key", "value");
    }

    @Test
    public void dataWithMapTest() {
        Map<String, String> data = new HashMap<>();
        data.put("name", "value");
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data(data);
    }

    @Test
    public void requestBodyTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.requestBody("body");
    }

    @Test
    public void headerTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.header("name", "value");
    }

    @Test
    public void cookieTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.cookie("name", "value");
    }

    @Test
    public void executeTest() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = httpConnection.request();
        assertNotNull(request);
    }

}