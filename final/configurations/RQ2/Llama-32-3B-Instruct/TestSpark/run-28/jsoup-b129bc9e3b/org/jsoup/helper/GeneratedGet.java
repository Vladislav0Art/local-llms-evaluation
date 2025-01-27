package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGet {

    @Test
    public void get() throws IOException {
        // Test that the get method returns the correct response
        Connection connection = HttpConnection.connect("http://example.com");
        Document document = connection.get();
        assertNotNull(document);
    }

}