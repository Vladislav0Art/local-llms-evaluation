package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedGet_ReturnsDocument {

    @Test
    public void get_ReturnsDocument() throws IOException, InterruptedException {
        String html = "<html><body>Hello World!</body></html>";
        ByteArrayInputStream input = new ByteArrayInputStream(html.getBytes());
        Connection connection = HttpConnection.connect("http://localhost:8080");
        Document document = (Document) connection.get();
        assertNotNull(document);
    }

}