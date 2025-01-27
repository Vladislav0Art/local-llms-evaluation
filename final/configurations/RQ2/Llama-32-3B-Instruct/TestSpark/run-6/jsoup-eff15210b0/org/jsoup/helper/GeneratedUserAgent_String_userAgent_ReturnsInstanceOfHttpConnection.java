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

public class GeneratedUserAgent_String_userAgent_ReturnsInstanceOfHttpConnection {

    @Test
    public void userAgent_String_userAgent_ReturnsInstanceOfHttpConnection() {
        String userAgent = "Mozilla/5.0";
        Connection connection = HttpConnection.userAgent(userAgent);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}