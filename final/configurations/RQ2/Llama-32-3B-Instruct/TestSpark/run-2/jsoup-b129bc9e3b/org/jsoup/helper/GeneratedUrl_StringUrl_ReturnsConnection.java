package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedUrl_StringUrl_ReturnsConnection {

    @Test
    public void url_StringUrl_ReturnsConnection() {
        Connection connection = HttpConnection.url("http://example.com");
        assertNotNull(connection);
    }

}