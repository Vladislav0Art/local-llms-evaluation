package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedGet_ReturnsDocument {

    @Before
    public void setup() throws MalformedURLException {
        // Create a new URL object
        String url = "http://example.com";
        Connection.connect(url);
    }

    @Test
    public void get_ReturnsDocument() throws IOException {
        String url = "http://example.com";
        Document document = HttpConnection.connect(url).get();
        assertNotNull(document);
        assertTrue(document.getDocument().equals(HttpConnection.connect(url)));
    }

}