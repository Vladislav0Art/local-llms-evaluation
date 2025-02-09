package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void connectStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertTrue(connection instanceof Connection);
    }

    @Test
    public void connectURLTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertTrue(connection instanceof Connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.newRequest() instanceof Connection.Request);
    }

    @Test
    public void urlWithURLTest() throws Exception {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.url(new URL("http://example.com")) instanceof HttpConnection);
    }

    @Test
    public void urlWithWrongStringTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.url("wrongurl") instanceof HttpConnection);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.userAgent("Mozilla") instanceof HttpConnection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.timeout(1000) instanceof HttpConnection);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.followRedirects(true) instanceof HttpConnection);
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.ignoreHttpErrors(true) instanceof HttpConnection);
    }

    @Test
    public void dataWithKeyValTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.data("key", "value") instanceof HttpConnection);
    }

    @Test
    public void dataWithMapTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key1", "value1");
        dataMap.put("key2", "value2");
        assertTrue(connection.data(dataMap) instanceof HttpConnection);
    }

    @Test
    public void requestBodyTest() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.requestBody("body") instanceof HttpConnection);
    }

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("header1", "value1");
        headers.put("header2", "value2");
        assertTrue(connection.headers(headers) instanceof HttpConnection);
    }

    @Test
    public void cookieStoreTest() {
        HttpConnection connection = new HttpConnection();
        assertNull(connection.cookieStore());
    }

    @Test
    public void postDataTypeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.post() instanceof org.jsoup.nodes.Document);
    }

}