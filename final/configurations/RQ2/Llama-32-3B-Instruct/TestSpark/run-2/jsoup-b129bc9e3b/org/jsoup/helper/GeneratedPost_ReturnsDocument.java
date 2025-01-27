package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedPost_ReturnsDocument {

    @Test
    public void post_ReturnsDocument() throws IOException {
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.post();
        assertNotNull(document);
    }

}