package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private HttpConnection httpConnection;

    @Test
    public void connectURLTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void urlURLTest() throws MalformedURLException {
        Connection connection = httpConnection.url(new URL("http://example.com"));
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void urlStringMalformedUrlTest() {
        httpConnection.url("malformed_url");
    }

    @Test
    public void proxyTest() {
        Connection connection = httpConnection.proxy(Proxy.NO_PROXY);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void proxyHostPortTest() {
        Connection connection = httpConnection.proxy("localhost", 8080);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void userAgentTest() {
        Connection connection = httpConnection.userAgent("Mozilla/5.0");
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void timeoutTest() {
        Connection connection = httpConnection.timeout(3000);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void maxBodySizeTest() {
        Connection connection = httpConnection.maxBodySize(1024);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void followRedirectsTest() {
        Connection connection = httpConnection.followRedirects(true);
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void referrerTest() {
        Connection connection = httpConnection.referrer("http://example.com");
        assertNotNull("Connection should not be null", connection);
    }

    @Test
    public void methodTest() {
        Connection connection = httpConnection.method(Connection.Method.GET);
        assertNotNull("Connection should not be null", connection);
    }

}