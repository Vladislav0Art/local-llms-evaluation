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

public class GeneratedTimeout_Int_timeout_set {

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
    public void timeout_Int_timeout_set() {
        HttpConnection connect = new HttpConnection();
        int millis = 1000;
        Connection url = connect.timeout(millis);
        assertEquals(HEAD, url.request().method());
        assertTrue(url.ignoreHttpErrors());
    }

}