package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testConnect() {
        assertNotSame(null, HttpConnection.connect("http://example.com"));
        HttpConnection connection = new HttpConnection();
        assertEquals("http://example.com", connection.connect("http://example.com"));
    }

    @Test
    public void testConnect_URL() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.url(new URL("https://www.example.com")) != null);
        assertTrue(connection.url("https://www.example.com") != null);
    }

    @Test
    public void testConnect_URL_Suffixes() {
        HttpConnection connection = new HttpConnection();
        assertTrue(connection.url("http://example.com/path").getHost().equals("example.com"));
        assertTrue(connection.url("https://www.example.com/path").getHost().equals("www.example.com"));
    }

    @Test
    public void testConnect_URL_Domain() {
        HttpConnection connection = new HttpConnection();
        assertEquals("www.example.com", connection.url(new URL("http://example.com")).getHost());
        assertEquals("http://example.net", connection.url(new URL("http://example.com/path").getHost()));
    }

    @Test
    public void testConnect

    Proxy() {
        String proxyUrl = "http://proxy.example.com:8080";
        HttpConnection connection = new HttpConnection(proxyUrl);
        assertTrue(connection.proxy(new Proxy(proxyUrl)));
        assertEquals(proxyUrl, connection.getProxy().getScheme());
        assertEquals("http", connection.getProxy().getHost());
    }

    @Test
    public void testConnect_Proxy_0() {
        HttpConnection connection = new HttpConnection();
        assertEquals("http://example.com", connection.proxy(null));
    }

    @Test
    public void testConnectProxy_Suffixes() {
        String proxyUrl = "http://proxy.example.com:8080";
        HttpConnection connection = new HttpConnection(proxyUrl);
        assertTrue(connection.proxy(new Proxy(proxyUrl)).getHost().equals("proxy.example.com"));
        assertEquals("https://www.example.net", connection.proxy(new Proxy(proxyUrl)).getHost());
    }

    @Test
    public void testConnectProxy_Domain() {
        String proxyUrl = "http://proxy.example.com:8080";
        HttpConnection connection = new HttpConnection(proxyUrl);
        assertEquals("proxy.example.com", connection.getProxy().getScheme());
        assertEquals("proxy.example.com", connection.getProxy().getHost());
    }

    @Test
    public void testConnectCookies() {
        String cookieStoreUrl = "https://example.com/cookies";
        CookieManager cookieManager = new CookieManager();
        HttpConnection connection = new HttpConnection(cookieStoreUrl);
        assertNotNull(connection.cookieStore());
        assertEquals("https://example.com", connection.getCookieStore().getHost());
    }

    @Test
    public void testConnectCookies_Suffixes() {
        String cookieStoreUrl = "https://example.com/cookies";
        CookieManager cookieManager = new CookieManager();
        HttpConnection connection = new HttpConnection(cookieStoreUrl);
        assertEquals("https://example.com", cookieManager.getCookieStore().getHost());
    }

    @Test
    public void testConnectCookies_Domain() {
        String cookieStoreUrl = "https://example.com/cookies";
        CookieManager cookieManager = new CookieManager();
        HttpConnection connection = new HttpConnection(cookieStoreUrl);
        assertEquals("https://example.com", cookieManager.getCookieStore().getHost());
    }

    @Test
    public void testData() {
        String key = "test_key";
        assertEquals(0, HttpConnection.data(key).size());
    }

    @Test
    public void testData_Suffixes() {
        String key = "test_key";
        assertTrue(HttpConnection.data(key).stream().anyMatch(k -> k.getKey().equals(key)));
    }

    @Test
    public void testData_Domain() {
        String key = "test_key";
        assertEquals("http://example.com", HttpConnection.data(key).getHost());
    }

}