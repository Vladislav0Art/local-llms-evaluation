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

public class GeneratedTimeout {

    @Test
    public void timeout() {
        int millis = 10000;
        Connection connection = HttpConnection.timeout(millis);
        assertEquals(int.class, connection.timeout().getClass());
        assertEquals(millis, connection.timeout());
    }

}