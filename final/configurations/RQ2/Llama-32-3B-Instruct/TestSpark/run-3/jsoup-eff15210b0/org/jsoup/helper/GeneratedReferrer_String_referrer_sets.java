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

public class GeneratedReferrer_String_referrer_sets {

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
    public void referrer_String_referrer_sets() {
        HttpConnection connect = new HttpConnection();
        String referrer = "https://www.example.com";
        Connection url = connect.referrer(referrer);
        assertEquals(HEAD, url.request().method());
        assertTrue(url.ignoreHttpErrors());
    }

}