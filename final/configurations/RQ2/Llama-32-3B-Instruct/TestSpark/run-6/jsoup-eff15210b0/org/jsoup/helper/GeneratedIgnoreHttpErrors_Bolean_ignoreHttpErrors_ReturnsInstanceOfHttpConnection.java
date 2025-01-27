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

public class GeneratedIgnoreHttpErrors_Bolean_ignoreHttpErrors_ReturnsInstanceOfHttpConnection {

    @Test
    public void ignoreHttpErrors_Bolean_ignoreHttpErrors_ReturnsInstanceOfHttpConnection() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}