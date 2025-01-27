package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedIgnoreContentType_BoolIgnoreContentType_ReturnsConnectionWithIgnoreContentType {

    @Test
    public void ignoreContentType_BoolIgnoreContentType_ReturnsConnectionWithIgnoreContentType() {
        boolean ignoreContentType = true;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(connection);
    }

}