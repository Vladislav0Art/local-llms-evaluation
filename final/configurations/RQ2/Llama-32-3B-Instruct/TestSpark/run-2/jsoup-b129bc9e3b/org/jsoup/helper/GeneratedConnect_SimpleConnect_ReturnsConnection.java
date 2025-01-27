package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedConnect_SimpleConnect_ReturnsConnection {

    @Test
    public void connect_SimpleConnect_ReturnsConnection() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}