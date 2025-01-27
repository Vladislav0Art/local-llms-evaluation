package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedConnectString_AcceptableURL_ReturnsConnection {

    @Test
    public void connectString_AcceptableURL_ReturnsConnection() {
        Connection conn = Connection.connect("http://example.com");
        assertNotNull(conn);
    }

}