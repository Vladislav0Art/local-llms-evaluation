package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDataStringKeyValue {

    @Test
    public void dataStringKeyValue() {
        // Test that the data method with String key and value returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.data("key", "value"));
    }

}