package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        String urlString = "http://example.com";
        Connection connection = HttpConnection.connect(urlString);
        assertEquals(urlString, connection.request().url().toString());
    }

    @Test
    public void connectStringTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertEquals(url, connection.request().url());
    }

    @Test
    public void userAgentTest() {
        String userAgent = "Mozilla/5.0";
        HttpConnection connection = new HttpConnection();
        connection.userAgent(userAgent);
        assertEquals(userAgent, connection.request().userAgent());
    }

    @Test
    public void timeoutTest() {
        int timeout = 5000;
        HttpConnection connection = new HttpConnection();
        connection.timeout(timeout);
        assertEquals(timeout, connection.request().timeout());
    }

    @Test
    public void maxBodySizeTest() {
        int maxBodySize = 1024;
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(maxBodySize);
        assertEquals(maxBodySize, connection.request().maxBodySize());
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(false);
        assertFalse(connection.request().followRedirects());
    }

    @Test
    public void referrerTest() {
        String referrer = "http://example.com";
        HttpConnection connection = new HttpConnection();
        connection.referrer(referrer);
        assertEquals(referrer, connection.request().referrer());
    }

    @Test
    public void methodTest() {
        Connection.Method method = Connection.Method.POST;
        HttpConnection connection = new HttpConnection();
        connection.method(method);
        assertEquals(method, connection.request().method());
    }

    @Test
    public void sslSocketFactoryTest() {
        SSLSocketFactory SSLFactory = mock(SSLSocketFactory.class);
        HttpConnection connection = new HttpConnection();
        connection.sslSocketFactory(SSLFactory);
        assertEquals(SSLFactory, connection.request().sslSocketFactory());
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

    @Test
    public void dataTest() {
        String filename = "test.txt";
        InputStream inputStream = new ByteArrayInputStream("test".getBytes());
        String contentType = "text/plain";
        HttpConnection connection = new HttpConnection();
        connection.data("key", filename, inputStream, contentType);
        Connection.KeyVal kv = connection.request().data().get(0);
        assertEquals("key", kv.key());
        assertEquals(filename, kv.value());
        assertEquals(inputStream, kv.inputStream());
        assertEquals(contentType, kv.contentType());
    }

    @Test
    public void dataMapTest() {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("key", "value");
        HttpConnection connection = new HttpConnection();
        connection.data(dataMap);
        assertEquals("value", connection.request().data().get(0).value());
    }

    @Test
    public void headerTest() {
        String name = "Authorization";
        String value = "Bearer xxxxx";
        HttpConnection connection = new HttpConnection();
        connection.header(name, value);
        assertEquals(value, connection.request().headers().get(name));
    }

    @Test
    public void headersTest() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer xxxxx");
        HttpConnection connection = new HttpConnection();
        connection.headers(headers);
        assertEquals(headers, connection.request().headers());
    }

    @Test
    public void cookieTest() {
        String name = "SESSION";
        String value = "xxxxxx";
        HttpConnection connection = new HttpConnection();
        connection.cookie(name, value);
        assertEquals(value, connection.request().cookies().get(name));
    }

    @Test
    public void cookiesTest() {
        Map<String, String> cookies = new HashMap<>();
        cookies.put("SESSION", "xxxxxx");
        HttpConnection connection = new HttpConnection();
        connection.cookies(cookies);
        assertEquals(cookies, connection.request().cookies());
    }

    @Test
    public void parserTest() {
        Parser parser = new Parser(null);
        HttpConnection connection = new HttpConnection();
        connection.parser(parser);
        assertEquals(parser, connection.request().parser());
    }

}