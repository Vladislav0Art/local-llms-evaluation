package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void connectUrlTest() {
        URL url = Mockito.mock(URL.class);
        when(url.toString()).thenReturn("https://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals("https://www.example.com", connection.request().url().toString());
    }

    @Test
    public void connectStringTest() {
        HttpConnection connection = HttpConnection.connect("https://www.example.com");
        assertEquals("https://www.example.com", connection.request().url().toString());
    }

    @Test
    public void newRequestTest() {
        HttpConnection connection = new HttpConnection();
        HttpConnection newConnection = connection.newRequest();
        assertEquals(connection.request(), newConnection.request());
    }

    @Test
    public void urlTest() {
        HttpConnection connection = new HttpConnection();
        URL url = Mockito.mock(URL.class);
        when(url.toString()).thenReturn("https://www.example.com");
        connection.url(url);
        assertEquals("https://www.example.com", connection.request().url().toString());
    }

    @Test
    public void proxyTest() {
        HttpConnection connection = new HttpConnection();
        Proxy proxy = Mockito.mock(Proxy.class);
        connection.proxy(proxy);
        assertEquals(proxy, connection.request().proxy());
    }

}