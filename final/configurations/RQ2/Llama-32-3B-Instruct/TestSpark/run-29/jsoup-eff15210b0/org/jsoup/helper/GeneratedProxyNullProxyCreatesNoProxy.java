package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedProxyNullProxyCreatesNoProxy {

    public void testUrlStringConnectsToCorrectURL() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url));
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

}