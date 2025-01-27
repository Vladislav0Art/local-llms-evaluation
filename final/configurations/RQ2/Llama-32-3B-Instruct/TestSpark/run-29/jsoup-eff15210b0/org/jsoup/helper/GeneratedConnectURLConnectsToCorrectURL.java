package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;

public class GeneratedConnectURLConnectsToCorrectURL {

    @Test
    public void connectURLConnectsToCorrectURL() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertTrue(connection.url().get().orElse(null).toString().equals(url.toString()));
    }

}