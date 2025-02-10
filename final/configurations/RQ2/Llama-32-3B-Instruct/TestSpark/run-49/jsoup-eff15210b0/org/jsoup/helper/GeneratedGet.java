package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGet {

    @Test
    public void get() throws IOException {
        Document document = new org.jsoup.nodes.Document();
        Connection connection = HttpConnection.connect("https://www.example.com");
        assertEquals(Document.class, connection.get().getClass());
        assertEquals(document, connection.get());
    }

}