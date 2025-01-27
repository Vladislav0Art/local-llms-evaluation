package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedGetReturnsDocument {

    @Test
    public void getReturnsDocument() throws IOException {
        Connection connection = HttpConnection.connect("http://www.example.com");
        Document document = connection.get();

        assertNotNull(document);
        assertTrue(document.title().length() > 0);
    }

}