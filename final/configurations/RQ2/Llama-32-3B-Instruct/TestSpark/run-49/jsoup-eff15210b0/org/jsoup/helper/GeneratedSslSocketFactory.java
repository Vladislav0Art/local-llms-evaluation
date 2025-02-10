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

public class GeneratedSslSocketFactory {

    @Test
    public void sslSocketFactory() {
        SSLSocketFactory sslSocketFactory = new org.junit.rules.SSLSocketFactory();
        Connection connection = HttpConnection.sslSocketFactory(sslSocketFactory);
        assertEquals(SSLSocketFactory.class, connection.sslSocketFactory().getClass());
        assertEquals(sslSocketFactory, connection.sslSocketFactory());
    }

}