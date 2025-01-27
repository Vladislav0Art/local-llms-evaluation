package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCookieStringNameValue {

    @Test
    public void cookieStringNameValue() {
        // Test that the cookie method with String name and value returns the correct object
        Connection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection.cookie("session_id", "123456"));
    }

}