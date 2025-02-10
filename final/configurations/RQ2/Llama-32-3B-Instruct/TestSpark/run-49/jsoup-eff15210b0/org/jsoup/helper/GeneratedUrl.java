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

public class GeneratedUrl {

    @Test
    public void url() {
        Connection connection = HttpConnection.url("https://www.example.com");
        assertEquals(Connection.class, connection.getClass());
        assertEquals(String.class, connection.url().getClass());
    }

}