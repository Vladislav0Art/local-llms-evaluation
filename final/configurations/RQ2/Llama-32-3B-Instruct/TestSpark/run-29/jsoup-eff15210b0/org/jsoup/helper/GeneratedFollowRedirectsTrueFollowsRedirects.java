package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedFollowRedirectsTrueFollowsRedirects {

    public void testUrlStringConnectsToCorrectURL() {
        String url = "http://example.com";
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url));
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

}