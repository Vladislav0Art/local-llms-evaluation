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

public class GeneratedIgnoreContentType {

    @Test
    public void ignoreContentType() {
        boolean ignoreContentType = false;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertEquals(boolean.class, connection.ignoreContentType().getClass());
        assertEquals(ignoreContentType, connection.ignoreContentType());
    }

}