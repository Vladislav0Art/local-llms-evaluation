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

public class GeneratedFollowRedirects_Bolean_followRedirects_sets {

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
    public void followRedirects_Bolean_followRedirects_sets() {
        HttpConnection connect = new HttpConnection();
        boolean followRedirects = true;
        Connection url = connect.followRedirects(followRedirects);
        assertEquals(HEAD, url.request().method());
        assertTrue(url.ignoreHttpErrors());
    }

}