package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class GeneratedConnectMethodConnectsToUrlWithProxy {

    @Test
    public void connectMethodConnectsToUrlWithProxy() throws IOException {
        Connection connection = HttpConnection.connect("http://www.example.com", new Proxy(Proxy.Type.HTTP, 8080));
        assertTrue(connection.proxy().equals(new Proxy(Proxy.Type.HTTP, 8080)));
    }

}