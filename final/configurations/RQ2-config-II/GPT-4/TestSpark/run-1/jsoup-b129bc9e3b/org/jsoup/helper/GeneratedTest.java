package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlStringTest() {
        Connection connection = HttpConnection.connect("https://google.com");
        assertEquals("https://google.com", connection.request().url().toString());
    }

    @Test
    public void connectUrlTest() throws MalformedURLException {
        URL testUrl = new URL("https://google.com");
        Connection connection = HttpConnection.connect(testUrl);
        assertEquals(testUrl, connection.request().url());
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.url("https://google.com");
        assertEquals("https://google.com", connection.request().url().toString());
    }

    @Test
    public void proxyTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        Proxy testProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        connection.proxy(testProxy);
        assertEquals(testProxy, connection.request().proxy());
    }

    @Test
    public void userAgentTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla");
        assertEquals("Mozilla", connection.request().userAgent());
    }

    @Test
    public void timeoutTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.timeout(5000);
        assertEquals(5000, connection.request().timeoutMillis());
    }

    @Test
    public void maxBodySizeTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024);
        assertEquals(1024, connection.request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(true);
        assertTrue(connection.request().followRedirects());
    }

    @Test
    public void methodTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.method(Connection.Method.GET);
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void dataTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.data("key", "value");
        assertTrue(connection.request().data().stream().anyMatch(keyval -> keyval.key().equals("key") && keyval.value().equals("value")));
    }

    @Test
    public void requestBodyTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        connection.requestBody("body");
        assertEquals("body", connection.request().requestBody());
    }

    @Test
    public void parserTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        Parser testParser = Parser.htmlParser();
        connection.parser(testParser);
        assertEquals(testParser, connection.request().parser());
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("https://google.com");
        assertNotNull(connection.execute());
    }

    @Test
    public void executeNonExistingUrlTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("http://non-existing-url.com");
        connection.execute();
    }

    @Test
    public void executeInvalidMimeTypeTest() throws IOException {
        HttpConnection connection = (HttpConnection) HttpConnection.connect("https://www.google.com/images/logos/google_logo_41.png");
        connection.execute();
    }

}