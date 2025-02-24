package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class GeneratedTest {

    private HttpConnection httpConnection;

    @Before
    public void setUp() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnect() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        HttpConnection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

    @Test
    public void testNewRequest() {
        HttpConnection newRequest = httpConnection.newRequest();
        assertNotNull(newRequest);
    }

    @Test
    public void testUrl() throws MalformedURLException {
        URL url = new URL("https://www.example.com");
        HttpConnection updatedConnection = httpConnection.url(url);
        assertNotNull(updatedConnection);
    }

    @Test
    public void testProxy() {
        HttpConnection updatedConnection = httpConnection.proxy(Mockito.mock(Proxy.class));
        assertNotNull(updatedConnection);
    }

    @Test
    public void testUserAgent() {
        HttpConnection updatedConnection = httpConnection.userAgent("Mozilla/5.0");
        assertNotNull(updatedConnection);
    }

    @Test
    public void testTimeout() {
        HttpConnection updatedConnection = httpConnection.timeout(1000);
        assertNotNull(updatedConnection);
    }

    @Test
    public void testFollowRedirects() {
        HttpConnection updatedConnection = httpConnection.followRedirects(true);
        assertNotNull(updatedConnection);
    }

    @Test
    public void testReferrer() {
        HttpConnection updatedConnection = httpConnection.referrer("https://www.example.com");
        assertNotNull(updatedConnection);
    }

}