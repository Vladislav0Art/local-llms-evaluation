package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.KeyVal;
import org.jsoup.internal.ConstrainableInputStream;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private HttpConnection connection;

    @Before
    public void setUp() {
        connection = new HttpConnection();
    }

    @Test
    public void testConnectWithUrlString() throws MalformedURLException {
        String url = "https://www.google.com";
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void testConnectWithUrl() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void testNewRequest() {
        HttpConnection connection = connection.newRequest();
        assertNotNull(connection);
    }

    @Test
    public void testUrl() throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        HttpConnection connection = connection.url(url);
        assertNotNull(connection);
    }

    @Test
    public void testProxy() {
        Proxy proxy = mock(Proxy.class);
        HttpConnection connection = connection.proxy(proxy);
        assertNotNull(connection);
    }

}