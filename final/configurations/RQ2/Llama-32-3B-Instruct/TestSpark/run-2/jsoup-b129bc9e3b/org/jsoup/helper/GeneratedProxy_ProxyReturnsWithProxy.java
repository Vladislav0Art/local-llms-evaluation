package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedProxy_ProxyReturnsWithProxy {

    @Test
    public void proxy_ProxyReturnsWithProxy() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 80));
        Connection connection = HttpConnection.proxy(proxy);
        assertNotNull(connection);
    }

}