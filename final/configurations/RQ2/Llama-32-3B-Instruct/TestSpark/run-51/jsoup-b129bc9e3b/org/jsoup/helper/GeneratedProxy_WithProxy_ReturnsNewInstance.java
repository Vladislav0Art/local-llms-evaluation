package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedProxy_WithProxy_ReturnsNewInstance {

    @Test
    public void proxy_WithProxy_ReturnsNewInstance() throws Exception {
        Connection connection = new HttpConnection();
        connection.proxy(new Proxy("example.com", 8080));
        assertNotNull(connection.proxy());
    }

}