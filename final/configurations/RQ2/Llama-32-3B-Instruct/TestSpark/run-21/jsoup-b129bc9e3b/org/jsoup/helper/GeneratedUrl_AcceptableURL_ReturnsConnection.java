package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedUrl_AcceptableURL_ReturnsConnection {

    @Test
    public void url_AcceptableURL_ReturnsConnection() {
        Connection conn = Connection.url(new URL("http://example.com"));
        assertNotNull(conn);
    }

}