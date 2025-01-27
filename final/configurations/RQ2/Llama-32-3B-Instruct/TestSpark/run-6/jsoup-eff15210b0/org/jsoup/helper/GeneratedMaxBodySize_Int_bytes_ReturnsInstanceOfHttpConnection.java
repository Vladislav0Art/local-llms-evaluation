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

public class GeneratedMaxBodySize_Int_bytes_ReturnsInstanceOfHttpConnection {

    @Test
    public void maxBodySize_Int_bytes_ReturnsInstanceOfHttpConnection() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}