package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedUrlStringConnectsToCorrectURL {

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

}