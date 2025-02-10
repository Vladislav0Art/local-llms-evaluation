package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedProxy {

    @Test
    public void proxy() {
        Proxy proxy = new org.junit.rules.Proxy();
        Connection connection = HttpConnection.proxy(proxy);
        assertEquals(Connection.class, connection.getClass());
        assertEquals(Proxy.class, connection.proxy().getClass());
    }

}