package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void connectStringTest() throws MalformedURLException {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        HttpConnection newConnection = connection.newRequest();
        assertNotNull(newConnection);
    }

    @Test
    public void urlTest() throws MalformedURLException {
        HttpConnection connection = new HttpConnection();
        URL url = new URL("https://www.example.com");
        connection.url(url);
        assertEquals(url, connection.request().url());
    }

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

}