package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void connectURLViaStringTest() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void connectURLViaURLTest() throws MalformedURLException {
        URL url = new URL("http://example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        assertNotNull(connection.proxy("localhost", 4000));
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
        assertNotNull(connection.get());
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        connection.url("http://example.com");
        assertNotNull(connection.post());
    }

}