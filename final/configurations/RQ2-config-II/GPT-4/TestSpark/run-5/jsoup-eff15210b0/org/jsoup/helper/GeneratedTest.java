package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        final Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectStringNullTest() {
        HttpConnection.connect((String) null);
    }

    @Test
    public void connectURLTest() throws Exception {
        final Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void connectURLNullTest() {
        HttpConnection.connect((URL) null);
    }

    @Test
    public void urlURLTest() throws Exception {
        final HttpConnection connection = new HttpConnection();
        final Connection result = connection.url(new URL("http://example.com"));
        assertNotNull(result);
    }

    @Test
    public void urlStringTest() {
        final HttpConnection connection = new HttpConnection();
        final Connection result = connection.url("http://example.com");
        assertNotNull(result);
    }

    @Test
    public void proxySettingsTest() {
        final HttpConnection connection = new HttpConnection();
        final Connection result = connection.proxy("localhost", 8080);
        assertNotNull(result);
    }

    @Test
    public void userAgentTest() {
        final HttpConnection connection = new HttpConnection();
        final Connection result = connection.userAgent("Mozilla/5.0");
        assertNotNull(result);
    }

    @Test
    public void timeoutTest() {
        final HttpConnection connection = new HttpConnection();
        final Connection result = connection.timeout(5000);
        assertNotNull(result);
    }

}