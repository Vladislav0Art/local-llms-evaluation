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

public class GeneratedMethod {

    @Test
    public void method() {
        org.jsoup.Connection.Method method = org.jsoup.Connection.Method.GET;
        Connection connection = HttpConnection.method(method);
        assertEquals(org.jsoup.Connection.Method.class, connection.method().getClass());
        assertEquals(method, connection.method());
    }

}