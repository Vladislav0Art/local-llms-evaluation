package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void connect_String_url_ReturnsInstanceOfHttpConnection() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void connect_URL_url_ReturnsInstanceOfHttpConnection() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void connect_MalformedUrl_ThrowsMalformedURLException() {
        URL url = new URL("invalid://example.com");
        HttpConnection.connect(url);
    }

    @Test
    public void newRequest_ReturnsInstanceOfHttpConnection() {
        Connection connection = HttpConnection.newRequest();
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void url_String_url_ReturnsInstanceOfHttpConnection() {
        String url = "http://example.com";
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void url_URL_url_ReturnsInstanceOfHttpConnection() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void proxy_NullProxy_ThrowsNullPointerException() {
        HttpConnection.proxy(null);
    }

    @Test
    public void proxy_String_host_int_port_ReturnsInstanceOfHttpConnection() {
        String host = "example.com";
        int port = 80;
        Connection connection = HttpConnection.proxy(host, port);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void userAgent_String_userAgent_ReturnsInstanceOfHttpConnection() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void timeout_Int_millis_ReturnsInstanceOfHttpConnection() {
        int millis = 10000;
        Connection connection = HttpConnection.timeout(millis);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void maxBodySize_Int_bytes_ReturnsInstanceOfHttpConnection() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void followRedirects_Bolean_followRedirects_ReturnsInstanceOfHttpConnection() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void referrer_String_referrer_ReturnsInstanceOfHttpConnection() {
        String referrer = "example.com";
        Connection connection = HttpConnection.referrer(referrer);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void method_Method_method_ReturnsInstanceOfHttpConnection() {
        org.jsoup.helper.Method method = org.jsoup.helper.Method.GET;
        Connection connection = HttpConnection.method(method);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void ignoreHttpErrors_Bolean_ignoreHttpErrors_ReturnsInstanceOfHttpConnection() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void ignoreContentType_Bolean_ignoreContentType_ReturnsInstanceOfHttpConnection() {
        boolean ignoreContentType = false;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

    @Test
    public void data_String_key_returnedConnection() {
        String key = "key";
        Connection connection = HttpConnection.data(key, null, null);
        assertNotNull(connection);
        assertEquals(key, ((HttpConnection) connection).data().getKey());
    }

    @Test
    public void postDataCharset_String_charset_ReturnsInstanceOfHttpConnection() {
        String charset = "UTF-8";
        Connection connection = HttpConnection.postDataCharset(charset);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}