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

public class GeneratedMaxBodySize {

    @Test
    public void maxBodySize() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertEquals(int.class, connection.maxBodySize().getClass());
        assertEquals(bytes, connection.maxBodySize());
    }

}