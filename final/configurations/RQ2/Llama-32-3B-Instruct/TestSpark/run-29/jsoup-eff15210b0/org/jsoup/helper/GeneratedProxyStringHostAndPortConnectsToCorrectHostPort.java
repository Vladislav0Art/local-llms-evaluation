package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedProxyStringHostAndPortConnectsToCorrectHostPort {

    public void testUrlStringConnectsToCorrectURL() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url));
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

}