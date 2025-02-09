package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.net.Proxy;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void connectUrlStringTest() {
        Connection result = HttpConnection.connect("http://example.com");
        assertNotNull(result);
    }

    @Test
    public void connectUrlStringInvalidTest() {
        Connection result = HttpConnection.connect("invalidURL");
    }

    @Test
    public void connectUrlTest() throws IOException {
        Connection result = HttpConnection.connect(new URL("http://example.com"));
        assertNotNull(result);
    }

    @Test
    public void HttpConnectionDefaultConstructorTest() {
        HttpConnection result = new HttpConnection();
        assertNotNull(result);
    }

    @Test
    public void HttpConnectionCopyConstructorTest() {
        HttpConnection original = new HttpConnection();
        HttpConnection result = new HttpConnection(original.request());
        assertNotNull(result);
    }

    @Test
    public void newRequestTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.newRequest();
        assertNotNull(result);
    }

    @Test
    public void urlURLTest() throws IOException {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.url(new URL("http://example.com"));
        assertNotNull(result);
    }

    @Test
    public void urlURLNullTest() throws IOException {
        HttpConnection instance = new HttpConnection();
        instance.url((URL) null);
    }

    @Test
    public void proxyTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.proxy(Proxy.NO_PROXY);
        assertNotNull(result);
    }

    @Test
    public void proxyStringIntTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.proxy("localhost", 8888);
        assertNotNull(result);
    }

    @Test
    public void proxyInvalidTest() {
        HttpConnection instance = new HttpConnection();
        instance.proxy("invalidHost", -1);
    }

    @Test
    public void userAgentTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.userAgent("Test");
        assertNotNull(result);
    }

    @Test
    public void timeoutTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.timeout(1000);
        assertNotNull(result);
    }

    @Test
    public void timeoutNegativeTest() {
        HttpConnection instance = new HttpConnection();
        instance.timeout(-1000);
    }

    @Test
    public void maxBodySizeTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.maxBodySize(2048);
        assertNotNull(result);
    }

    @Test
    public void maxBodySizeNegativeTest() {
        HttpConnection instance = new HttpConnection();
        instance.maxBodySize(-2048);
    }

    @Test
    public void followRedirectsTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.followRedirects(true);
        assertNotNull(result);
    }

    @Test
    public void postDataCharsetTest() {
        HttpConnection instance = new HttpConnection();
        Connection result = instance.postDataCharset("ISO-8859-1");
        assertNotNull(result);
    }

}