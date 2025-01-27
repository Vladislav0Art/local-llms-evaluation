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

public class GeneratedUrl_String_url_ReturnsInstanceOfHttpConnection {

    @Test
    public void url_String_url_ReturnsInstanceOfHttpConnection() {
        String url = "http://example.com";
        Connection connection = HttpConnection.url(url);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}