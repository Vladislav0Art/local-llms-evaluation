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

public class GeneratedUrlValidUrl_ReturnsConnection {

    @Test
    public void urlValidUrl_ReturnsConnection() {
        Connection connection = HttpConnection.url("http://example.com");
        assertNotNull(connection);
    }

}