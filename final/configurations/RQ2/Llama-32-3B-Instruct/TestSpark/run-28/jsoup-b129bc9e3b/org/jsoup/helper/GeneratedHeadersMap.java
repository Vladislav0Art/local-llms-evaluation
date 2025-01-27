package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedHeadersMap {

    @Test
    public void headersMap() {
        // Test that the headers method with Map returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.headers(Collections.singletonMap("key", "value")));
    }

}