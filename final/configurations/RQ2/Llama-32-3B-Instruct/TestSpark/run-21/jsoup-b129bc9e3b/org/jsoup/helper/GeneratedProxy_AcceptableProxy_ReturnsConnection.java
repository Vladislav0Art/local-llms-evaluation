package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedProxy_AcceptableProxy_ReturnsConnection {

    @Test
    public void proxy_AcceptableProxy_ReturnsConnection() {
        Connection conn = Connection.proxy(new Proxy(Proxy.Type.HTTP, "example.com", 8080));
        assertNotNull(conn);
    }
}

}