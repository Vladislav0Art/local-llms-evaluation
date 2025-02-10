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

public class GeneratedExecute {

    @Test
    public void execute() throws IOException {
        Connection connection = HttpConnection.connect("https://www.example.com");
        Connection.Response response = new org.jsoup.Connection.Response();
        assertEquals(Connection.Response.class, connection.execute(response).getClass());
        assertEquals(response, connection.execute(response));
    }

}