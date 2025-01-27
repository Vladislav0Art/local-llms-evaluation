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

public class GeneratedProxy_String_host_int_port_ReturnsInstanceOfHttpConnection {

    @Test
    public void proxy_String_host_int_port_ReturnsInstanceOfHttpConnection() {
        String host = "example.com";
        int port = 80;
        Connection connection = HttpConnection.proxy(host, port);
        assertNotNull(connection);
        assertTrue(connection instanceof HttpConnection);
    }

}