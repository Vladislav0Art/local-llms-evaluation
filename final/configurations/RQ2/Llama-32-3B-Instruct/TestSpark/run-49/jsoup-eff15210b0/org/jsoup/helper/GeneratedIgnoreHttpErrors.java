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

public class GeneratedIgnoreHttpErrors {

    @Test
    public void ignoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertEquals(boolean.class, connection.ignoreHttpErrors().getClass());
        assertEquals(ignoreHttpErrors, connection.ignoreHttpErrors());
    }

}