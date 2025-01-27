package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.internal.ConstrainableInputStream;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedData_NewDataObject_ReturnsNewHttpConnection {

    @Before
    public void setup() throws MalformedURLException {
        // Create a new URL object
        String url = "http://example.com";
        Connection.connect(url);
    }

    @Test
    public void data_NewDataObject_ReturnsNewHttpConnection() throws IOException {
        List<Connection.KeyVal> data = new ArrayList<>();
        data.add(Connection.KeyVal.of("key1", "value1"));
        Connection newConnection = HttpConnection.data(data);
        assertNotNull(newConnection);
        assertTrue(newConnection instanceof HttpConnection);
    }

}