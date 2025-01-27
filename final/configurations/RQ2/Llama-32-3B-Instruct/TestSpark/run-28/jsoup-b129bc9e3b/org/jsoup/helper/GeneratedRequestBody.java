package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRequestBody {

    @Test
    public void requestBody() {
        // Test that the requestBody method returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.requestBody("Hello, World!"));
    }

}