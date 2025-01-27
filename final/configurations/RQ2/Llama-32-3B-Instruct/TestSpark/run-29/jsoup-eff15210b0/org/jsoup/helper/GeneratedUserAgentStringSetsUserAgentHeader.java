package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedUserAgentStringSetsUserAgentHeader {

    public void testUrlStringConnectsToCorrectURL() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url));
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

}