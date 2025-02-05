package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        Assert.assertNotNull(connection);
    }

    @Test
    public void connectUrlInvalidTest() {
        Connection connection = HttpConnection.connect("invalid_url");
    }

    @Test
    public void connectStringTest() throws Exception {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
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
        connection.userAgent("Mozilla/5.0");
        Assert.assertNotNull(connection.request().header("User-Agent"));
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(5000);
        Assert.assertEquals(5000, connection.request().timeoutMillis());
    }

    @Test
    public void methodTest() {
        HttpConnection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        Assert.assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void ignoreHttpErrorsTest() {
        HttpConnection connection = new HttpConnection();
        connection.ignoreHttpErrors(true);
        Assert.assertTrue(connection.request().ignoreHttpErrors());
    }

    @Test
    public void dataTest() {
        HttpConnection connection = new HttpConnection();
        connection.data("key", "value");
        Assert.assertEquals("value", connection.request().data().get(0).value());
    }

    @Test
    public void sslSocketFactoryTest() throws Exception {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, null, null);
        SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

        HttpConnection connection = new HttpConnection();
        connection.sslSocketFactory(sslSocketFactory);
        Assert.assertEquals(sslSocketFactory, connection.request().sslSocketFactory());
    }

    @Test
    public void headersTest() {
        HttpConnection connection = new HttpConnection();
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        connection.headers(headers);
        Assert.assertEquals("application/json", connection.request().header("Content-Type"));
    }

    @Test
    public void parserTest() {
        HttpConnection connection = new HttpConnection();
        connection.parser(Parser.xmlParser());
        Assert.assertTrue(connection.request().parser() instanceof Parser.XmlParser);
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com").get();
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com").post();
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com").get();
        connection.execute();
    }

}