package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTimeout {

    @Test
    public void timeout() {
        // Test that the timeout method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertEquals(connection.timeout(5000), 5000);
    }

}