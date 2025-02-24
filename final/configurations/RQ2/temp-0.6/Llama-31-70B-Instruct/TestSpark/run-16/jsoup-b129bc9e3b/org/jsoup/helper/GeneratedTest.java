package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.HttpConnection;

public class GeneratedTest {

    @Test
    public void testConnect() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void testUrl() {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
        assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void testProxy() {
        HttpConnection connection = new HttpConnection();
        connection.proxy("127.0.0.1", 8080);
        assertEquals("127.0.0.1", connection.request().proxy().address().getHostName());
        assertEquals(8080, connection.request().proxy().address().getPort());
    }

    @Test
    public void testUserAgent() {
        HttpConnection connection = new HttpConnection();
        connection.userAgent("Mozilla/5.0");
        assertEquals("Mozilla/5.0", connection.request().header("User-Agent"));
    }

    @Test
    public void testTimeout() {
        HttpConnection connection = new HttpConnection();
        connection.timeout(1000);
        assertEquals(1000, connection.request().timeout());
    }

    @Test
    public void testMaxBodySize() {
        HttpConnection connection = new HttpConnection();
        connection.maxBodySize(1024);
        assertEquals(1024, connection.request().maxBodySize());
    }

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = new HttpConnection();
        connection.followRedirects(false);
        assertFalse(connection.request().followRedirects());
    }

}