package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UncheckedIOException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.nio.charset.Charset;

public class GeneratedExecute_connection_response_to_connection_response_test {

    @Test
    public void execute_connection_response_to_connection_response_test() throws IOException {
        URL url = new URL("http://example.com");
        Connection conn = HttpConnection.connect(url);
        Connection.Response response = conn.execute();
        assertNotNull(response);
    }

}