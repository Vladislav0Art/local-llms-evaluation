package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedExecuteThrowsIOException {

    @Test
    public void executeThrowsIOException() throws IOException {
        try {
            HttpConnection.connect("http://www.example.com").execute();
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}