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

public class GeneratedConnect_URL_url_ReturnsInstanceOfHttpConnection {

    @Test
    public void connect_URL_url_ReturnsInstanceOfHttpConnection() {
        URL url = new URL("http://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}