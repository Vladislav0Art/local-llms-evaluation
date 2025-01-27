package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedProxy_ProxyConnects {

    @Before
    public void setup() {
        Connection.connect("http://example.com");
    }

    public static class TestConnection extends Connection {
        private Method method;
        private Map<String, String> cookies;
        private CookieStore cookieStore;
        private Proxy proxy;

        public TestConnection(Method method) {
            this.method = method;
        }
    }

    @Test
    public void proxy_ProxyConnects() {
        HttpConnection connect = new HttpConnection();
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
        Connection url = connect.proxy(proxy);
        assertEquals(HEAD, url.request().method());
        assertFalse(url.ignoreHttpErrors());
    }

}