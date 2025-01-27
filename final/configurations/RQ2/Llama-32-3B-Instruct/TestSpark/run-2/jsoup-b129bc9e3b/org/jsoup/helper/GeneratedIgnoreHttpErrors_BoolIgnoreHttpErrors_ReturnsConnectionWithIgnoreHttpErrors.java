package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedIgnoreHttpErrors_BoolIgnoreHttpErrors_ReturnsConnectionWithIgnoreHttpErrors {

    @Test
    public void ignoreHttpErrors_BoolIgnoreHttpErrors_ReturnsConnectionWithIgnoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(connection);
    }

}