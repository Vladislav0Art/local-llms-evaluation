package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

public class GeneratedProxy_StringHost_ReturnsConnectionWithProxy {

    @Test
    public void proxy_StringHost_ReturnsConnectionWithProxy() {
        String host = "example.com";
        int port = 80;
        Connection connection = HttpConnection.proxy(host, port);
        assertNotNull(connection);
    }

}