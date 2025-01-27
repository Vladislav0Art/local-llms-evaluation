package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIgnoreHttpErrors {

    @Test
    public void ignoreHttpErrors() {
        // Test that the ignoreHttpErrors method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertTrue(connection.ignoreHttpErrors(true));
    }

}