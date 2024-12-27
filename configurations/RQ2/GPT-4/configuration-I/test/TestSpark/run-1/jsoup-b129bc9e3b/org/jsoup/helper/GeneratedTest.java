package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.Collection;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectURLTest() throws Exception {
        URL url = new URL("http://example.com");
        assertNotNull(HttpConnection.connect(url));
    }

    @Test
    public void connectStringURLTest() {
        assertNotNull(HttpConnection.connect("http://example.com"));
    }

    @Test
    public void newRequestTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertNotNull(httpConnection.newRequest());
    }

    @Test
    public void proxyParameterTest() {
        HttpConnection httpConnection = new HttpConnection();
        Proxy proxy = Proxy.NO_PROXY;
        assertEquals(httpConnection, httpConnection.proxy(proxy));
    }

    @Test
    public void proxyPropertiesTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals(httpConnection, httpConnection.proxy("127.0.0.1", 8000));
    }

    @Test
    public void timeoutTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals(httpConnection, httpConnection.timeout(5000));
    }

    @Test
    public void getTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.get();
    }

    @Test
    public void postTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.post();
    }

    @Test
    public void executeTest() throws IOException {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.execute();
    }

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        assertNotNull(httpConnection.request());
    }

}