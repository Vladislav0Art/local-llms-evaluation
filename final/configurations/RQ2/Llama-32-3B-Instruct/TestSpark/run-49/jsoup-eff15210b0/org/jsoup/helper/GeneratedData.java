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

public class GeneratedData {

    @Test
    public void data() {
        String key = "key";
        String value = "value";
        Connection connection = HttpConnection.data(key, value);
        assertEquals(String.class, connection.data().getClass());
        assertEquals(Map.Entry.class, connection.data().entrySet().iterator().next().getClass());
        assertEquals(value, connection.data().get("key"));
    }

}