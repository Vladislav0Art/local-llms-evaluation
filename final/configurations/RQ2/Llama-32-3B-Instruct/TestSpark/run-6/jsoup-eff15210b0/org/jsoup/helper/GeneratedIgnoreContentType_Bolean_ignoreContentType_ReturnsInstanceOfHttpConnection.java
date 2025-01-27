package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class GeneratedIgnoreContentType_Bolean_ignoreContentType_ReturnsInstanceOfHttpConnection {

    @Test
    public void ignoreContentType_Bolean_ignoreContentType_ReturnsInstanceOfHttpConnection() {
        boolean ignoreContentType = false;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}