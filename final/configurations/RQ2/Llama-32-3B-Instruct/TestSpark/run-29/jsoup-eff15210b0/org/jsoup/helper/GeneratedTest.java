package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedTest {

    public void testUrlStringConnectsToCorrectURL() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url));
    }

    @Test
    public void urlStringConnectsToCorrectURL() {
        testUrlStringConnectsToCorrectURL();
    }

    public void testConnectStringThrowsMalformedURLExceptionException() throws MalformedURLException {
        String url = "example.com";
        try {
            HttpConnection.connect(url);
            assert false;
        } catch (UncheckedIOException e) {
            assertTrue(e.getCause() instanceof MalformedURLException);
        }
    }

    @Test
    public void connectStringThrowsMalformedURLExceptionException() {
        testConnectStringThrowsMalformedURLExceptionException();
    }

    public void testConnectUrlConnectsToCorrectURL() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url.toString()));
    }

    @Test
    public void connectUrlConnectsToCorrectURL() {
        testConnectUrlConnectsToCorrectURL();
    }

    public void testProxyNullProxyCreatesNoProxy() {
        Proxy proxy = null;
        Connection connection = HttpConnection.proxy(proxy);
        assertNull(connection.proxy());
    }

    @Test
    public void proxyNullProxyCreatesNoProxy() {
        testProxyNullProxyCreatesNoProxy();
    }

    public void testProxyStringHostConnectsToCorrectHostPort() {
        String host = "example.com";
        int port = 8080;
        Connection connection = HttpConnection.proxy(host, port);
        assertEquals(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port)), connection.proxy());
    }

    @Test
    public void proxyStringHostConnectsToCorrectHostPort() {
        testProxyStringHostConnectsToCorrectHostPort();
    }

    public void testProxyStringHostAndPortConnectsToCorrectHostPort() {
        String host = "example.com";
        int port = 8080;
        Connection connection = HttpConnection.proxy(host, port);
        assertEquals(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port)), connection.proxy());
    }

    @Test
    public void proxyStringHostAndPortConnectsToCorrectHostPort() {
        testProxyStringHostAndPortConnectsToCorrectHostPort();
    }

    public void testUserAgentStringSetsUserAgentHeader() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertTrue(connection.headers().get("User-Agent").orElse(null).equals(userAgent));
    }

    @Test
    public void userAgentStringSetsUserAgentHeader() {
        testUserAgentStringSetsUserAgentHeader();
    }

    public void testTimeoutIntSetsTimeout() {
        int millis = 10000;
        Connection connection = HttpConnection.timeout(millis);
        assertEquals(millis, connection.timeout());
    }

    @Test
    public void timeoutIntSetsTimeout() {
        testTimeoutIntSetsTimeout();
    }

    public void testFollowRedirectsTrueFollowsRedirects() {
        boolean followRedirects = true;
        Connection connection = HttpConnection.followRedirects(followRedirects);
        assertTrue(connection.followRedirects());
    }

    @Test
    public void followRedirectsTrueFollowsRedirects() {
        testFollowRedirectsTrueFollowsRedirects();
    }

    public void testIgnoreHttpErrorsFalseDoesNotIgnoreHTTPErrors() {
        boolean ignoreHttpErrors = false;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertFalse(connection.ignoreHttpErrors());
    }

    @Test
    public void ignoreHttpErrorsFalseDoesNotIgnoreHTTPErrors() {
        testIgnoreHttpErrorsFalseDoesNotIgnoreHTTPErrors();
    }

}