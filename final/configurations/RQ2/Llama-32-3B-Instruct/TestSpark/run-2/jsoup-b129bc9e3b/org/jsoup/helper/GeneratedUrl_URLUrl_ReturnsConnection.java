package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedUrl_URLUrl_ReturnsConnection {

    @Test
    public void url_URLUrl_ReturnsConnection() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
    }

}