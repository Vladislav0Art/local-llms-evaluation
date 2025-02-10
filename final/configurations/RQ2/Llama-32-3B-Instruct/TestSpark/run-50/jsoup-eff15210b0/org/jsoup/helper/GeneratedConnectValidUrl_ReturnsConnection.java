package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.Document;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedConnectValidUrl_ReturnsConnection {

    @Test
    public void connectValidUrl_ReturnsConnection() {
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}