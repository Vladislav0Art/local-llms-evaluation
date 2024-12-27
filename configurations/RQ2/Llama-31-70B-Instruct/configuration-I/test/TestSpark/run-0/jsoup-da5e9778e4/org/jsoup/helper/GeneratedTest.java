package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void connectUrlTest() throws IOException {
        URL url = new URL("http://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void connectStringTest() throws IOException {
        HttpConnection connection = HttpConnection.connect("http://www.example.com");
        assertNotNull(connection);
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        Request request = connection.newRequest();
        assertNotNull(request);
    }

    @Test
    public void urlUrlTest() {
        URL url = new URL("http://www.example.com");
        HttpConnection connection = new HttpConnection();
        connection.url(url);
        assertEquals(url, connection.request().url());
    }

    @Test
    public void urlStringTest() {
        String url = "http://www.example.com";
        HttpConnection connection = new HttpConnection();
        connection.url(url);
        assertEquals(url, connection.request().url().toString());
    }

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

}