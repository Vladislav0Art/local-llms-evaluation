package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectWithUrlTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectWithStringUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertNotNull(connection.newRequest());
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertEquals(connection, connection.userAgent("Test User-Agent"));
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection.post());
    }

    @Test
    public void requestBodyTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertEquals(connection, connection.requestBody("Test Body"));
    }

    @Test
    public void headerTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertEquals(connection, connection.header("Test Header", "Test Value"));
    }

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Header1", "Value1");
        headers.put("Header2", "Value2");
        Assert.assertEquals(connection, connection.headers(headers));
    }

    @Test
    public void cookieTest() {
        HttpConnection connection = new HttpConnection();
        Assert.assertEquals(connection, connection.cookie("Test Cookie", "Test Value"));
    }

    @Test
    public void cookiesTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> cookies = new HashMap<>();
        cookies.put("Cookie1", "Value1");
        cookies.put("Cookie2", "Value2");
        Assert.assertEquals(connection, connection.cookies(cookies));
    }

    @Test
    public void sslSocketFactoryTest() {
        HttpConnection connection = new HttpConnection();
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        Assert.assertEquals(connection, connection.sslSocketFactory(factory));
    }

    @Test
    public void dataWithKeyFilenameInputStreamTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        Assert.assertEquals(connection, connection.data("key", "test", stream));
    }

    @Test
    public void dataWithKeyFilenameInputStreamContentTypeTest() {
        HttpConnection connection = new HttpConnection();
        ByteArrayInputStream stream = new ByteArrayInputStream(new byte[10]);
        Assert.assertEquals(connection, connection.data("key", "test", stream, "text/plain"));
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection.execute());
    }

}