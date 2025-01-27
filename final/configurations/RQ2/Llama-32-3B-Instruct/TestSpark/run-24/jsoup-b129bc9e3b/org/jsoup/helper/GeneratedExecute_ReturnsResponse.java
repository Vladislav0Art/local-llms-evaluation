package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;

public class GeneratedExecute_ReturnsResponse {

    @Test
    public void execute_ReturnsResponse() throws IOException {
        URL url = new URL("https://www.example.com");
        Connection connection = HttpConnection.connect(url);
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}