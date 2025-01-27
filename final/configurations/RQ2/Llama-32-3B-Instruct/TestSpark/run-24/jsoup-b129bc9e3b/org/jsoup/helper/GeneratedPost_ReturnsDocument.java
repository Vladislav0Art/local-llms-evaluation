package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;

public class GeneratedPost_ReturnsDocument {

    @Test
    public void post_ReturnsDocument() throws IOException {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        Document document = connection.post();
        assertNotNull(document);
    }

}