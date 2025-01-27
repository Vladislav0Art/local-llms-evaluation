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

public class GeneratedConnectReturnsNewInstance {

    @Test
    public void connectReturnsNewInstance() {
        String url1 = "http://www.example.com";
        String url2 = "http://www.example2.com";

        Connection connection1 = HttpConnection.connect(url1);
        Connection connection2 = HttpConnection.connect(url2);

        assertNotSame(connection1, connection2);
    }

}