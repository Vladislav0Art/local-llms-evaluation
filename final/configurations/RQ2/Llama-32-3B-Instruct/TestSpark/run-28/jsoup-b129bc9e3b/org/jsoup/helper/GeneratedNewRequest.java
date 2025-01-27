package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNewRequest {

    @Test
    public void newRequest() {
        // Test that a new request is created correctly
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

}