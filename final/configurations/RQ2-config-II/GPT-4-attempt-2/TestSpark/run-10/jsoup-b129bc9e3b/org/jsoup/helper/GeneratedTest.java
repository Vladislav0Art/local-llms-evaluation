package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedTest {

    @Test
    public void connectStringTest() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectNullStringTest() {
        HttpConnection.connect((String) null);
    }

    @Test
    public void connectURLTest() throws MalformedURLException {
        Connection connection = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void connectNullURLTest() {
        HttpConnection.connect((URL) null);
    }

    @Test
    public void urlURLTest() throws MalformedURLException {
        HttpConnection connection = (HttpConnection) new HttpConnection().url(new URL("http://example.com"));
        assertNotNull(connection);
    }

    @Test
    public void urlNullURLTest() {
        new HttpConnection().url((URL) null);
    }

    @Test
    public void urlStringTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().url("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void urlNullStringTest() {
        new HttpConnection().url((String) null);
    }

    @Test
    public void userAgentTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().userAgent("Mozilla");
        assertNotNull(connection);
    }

    @Test
    public void timeoutTest() {
        HttpConnection connection = (HttpConnection) new HttpConnection().timeout(5000);
        assertNotNull(connection);
    }

}